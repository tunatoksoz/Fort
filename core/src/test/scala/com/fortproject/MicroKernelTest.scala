package com.fortproject

import scala.reflect.runtime.universe._
import org.specs2.mutable._
import org.specs2.specification._
import org.specs2.execute.PendingUntilFixed

import com.fortproject.core.DefaultKernel
import com.fortproject.microkernel._
import com.fortproject.microkernel.registration.{ComponentRegistrationException, Component}
import com.fortproject.testcomponents._
import com.fortproject.microkernel.proxy.DefaultProxyFactory

object MicroKernelSpecification extends Specification with BeforeExample with AfterExample with PendingUntilFixed {
  var kernel: DefaultKernel = null;
  def before = () => kernel = new DefaultKernel()
  def after = () => {}

  "Kernel" should {
    "add class component with interface" in {
      kernel register(Component.forr[ComponentImpl]().named("key"))
      kernel hasComponent("key") must beTrue
    }

    "add class component with no interface" in {
      kernel register(Component.forr[DefaultComponent]().named("key"))
      kernel hasComponent("key") must beTrue
    }

    "add class that has two parameters of same type and no overloads" in {
      kernel register(Component.forr[ClassWithTwoParametersWithSameType]().named("test"))
      kernel register(Component.forr[Common]().implementedBy[CommonImpl1].named("test2"))
      kernel.resolve(typeOf[ClassWithTwoParametersWithSameType], null) must beNull;
    }

    "add common component" in {
      kernel register(Component.forr[Common].implementedBy[CommonImpl1]);
      kernel register(Component.forr[Common].implementedBy[CommonImpl1].named("test2"))
      kernel hasComponent("key") must beTrue
    }

    "add component instance" in {
      val component = new ComponentImpl();
      kernel.register(Component.forr[ComponentImpl]().named("key").instance(component))
      kernel.hasComponent("key") must beTrue
      kernel.resolve[ComponentImpl] mustEqual component;
    }

    "add component instance2" in {
      val component = new ComponentImpl();

      kernel.register(Component.forr[ComponentImpl]().named("key").instance(component))
      kernel.hasComponent("key") must beTrue

      kernel.resolve[ComponentImpl]("key") mustEqual component;

      kernel.resolve[ComponentImpl] mustEqual component;
    }

    "add component by service" in {
      val component = new CommonImpl1();

      kernel.register(Component.forr[Common]().instance(component))
      kernel.resolve[Common] mustEqual component;
    }

    "use custom dependency resolver" in {
      val resolver = new NotImplementedDependencyResolver();
      var defaultKernel = new DefaultKernel(resolver, new DefaultProxyFactory());
      defaultKernel.resolver mustEqual resolver
      // defaultKernel.resolver mustEqual resolver.kernel
    }

    "add handler for class component" in {
      kernel.register(Component.forr[ComponentImpl].named("key"))
      kernel.getHandler("key") mustNotEqual null
    }

    "add handler for class with no interface" in {
      kernel.register(Component.forr[DefaultComponent].named("key"))
      kernel.getHandler("key") mustNotEqual null
    }

    "should not add two components with same key" in {
      kernel.register(Component.forr[ComponentImpl].named("key"))
      kernel.register(Component.forr[ComponentImpl].named("key")) must throwA[ComponentRegistrationException];
    }

    "resolve all" in {
      kernel.register(Component.forr[Common].implementedBy[CommonImpl1])
      kernel.register(Component.forr[Common].implementedBy[CommonImpl1])
      val services = kernel.resolveAll[Common]
      services.length mustEqual 2
    }

    "resolve all handles multi service components" in {
      kernel.register(Component.forr[Common].implementedBy[CommonImpl1])
      kernel.register(Component.forr[Common].implementedBy[CommonImpl1])
      val services = kernel.resolveAll[Common]
      services.length mustEqual 2
    }

    "resolve all when provided dependencies dynamically" in {
      kernel.register(
        Component
          .forr[Common]
          .implementedBy[CommonImplWithDependency]
          .dynamicParameters((k, d) => {
            d.putt(typeOf[DefaultComponent], new DefaultComponent())
          }));
      val services = kernel.resolveAll[Common]
      services.length mustEqual 1
    }

    "resolve all resolves when dependency provided inline" in {
      kernel.register(
        Component
          .forr[Common]
          .implementedBy[CommonImplWithDependency]
      );

      kernel.resolveAll[Common](new Arguments().putt("customer", new DefaultComponent)).length mustEqual 1
    }

    "resolve all throws dependency resolver exception" in {
      kernel.register(Component.forr[CommonImplWithDependency]);

      kernel.resolveAll[CommonImplWithDependency] must throwA[DependencyResolverException];
    }
  }
}
