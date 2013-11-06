package com.fortproject.microkernel.registration

import scala.reflect.runtime.universe._

import com.fortproject.microkernel.{Arguments, KernelInternal}
import com.fortproject.core.LifestyleType.LifestyleType

class ComponentRegistration[TService] extends Registration {
  def register(kernel: KernelInternal): Unit = {

  }

  def named(name: String): ComponentRegistration[TService] = {
    return this;
  }

  def implementedBy[TServiceImpl]: ComponentRegistration[TService] = {
    throw new NotImplementedError()
  }

  def instance(instance: TService): ComponentRegistration[TService] = {
    throw new NotImplementedError()
  }

  def lifestyle(): LifestyleWrapper = {
    throw new NotImplementedError()
  }

  def dynamicParameters(parameter: (Type, Arguments) => Unit) = {
    throw new NotImplementedError();
  }
}

class ComponentRegistrationObject extends ComponentRegistration[Any] {

}