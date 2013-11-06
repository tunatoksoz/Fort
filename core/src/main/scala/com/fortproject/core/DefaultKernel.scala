package com.fortproject.core

import scala.reflect.runtime.universe._
import com.fortproject.microkernel._
import com.fortproject.microkernel.registration.Registration
import com.fortproject.core.internal.GraphNode
import com.fortproject.microkernel.subsystems.configuration.ConfigurationStore
import com.fortproject.microkernel.proxy.NotSupportedProxyFactory
import com.fortproject.core.LifestyleType.LifestyleType

class DefaultKernel(var resolver: DependencyResolver, var proxyFactory: ProxyFactory) extends Kernel {
  def this(proxyFactory: ProxyFactory) {
    this(null, null);
  }

  def this() {
    this(new NotSupportedProxyFactory());
  }

  def componentModelBuilder: ComponentModelBuilder = {
    throw new Exception();
  }

  def configurationStore: ConfigurationStore = {
    throw new Exception();
  }

  def graphNodes: Array[GraphNode] = {
    throw new Exception();
  }

  def handlerFactory: HandlerFactory = {
    throw new Exception();
  }

  def parent: Kernel = {
    throw new Exception();
  }

  def releasePolicy: ReleasePolicy = {
    throw new Exception();
  }


  def addChildKernel(kernel: Kernel): Unit = {
    throw new Exception();
  }

  def addFacility(facility: Facility): Unit = {
    throw new Exception();
  }

  def addFacility[T <: Facility](): Kernel = {
    throw new Exception();
  }

  def addFacility[T <: Facility](onCreate: (T) => Unit): Unit = {
    throw new Exception();
  }

  def addHandlerSelector(selector: HandlerSelector): Unit = {
    throw new Exception();
  }

  def addHandlersFilter(filter: HandlersFilter): Unit = {
    throw new Exception();
  }

  def addSubsystem(name: String, subsystem: SubSystem): Unit = {
    throw new Exception();
  }


  def addComponent(key: String, classType: Type) {
    throw new Exception();
  }

  def addComponent(key: String, classType: Type, lifestyle: LifestyleType) {
    throw new Exception();
  }

  def addComponent(key: String, classType: Type, lifestyle: LifestyleType, overwriteLifestyle: Boolean) {
    throw new Exception();
  }

  def addComponent(key: String, serviceType: Type, classType: Type) {
    throw new Exception();
  }

  def addComponent(key: String, serviceType: Type, classType: Type, lifestyle: LifestyleType) {
    throw new Exception();
  }

  def addComponent(key: String, serviceType: Type, classType: Type, lifestyle: LifestyleType, overwriteLifestyle: Boolean) {

  }

  def addComponent[T](implicit classType: TypeTag[T]) {
    addComponent(classType.toString, classType.tpe)
  }

  def addComponent[T](lifestyle: LifestyleType)(implicit classType: TypeTag[T]) {
    addComponent(classType.toString, classType.tpe, lifestyle);
  }

  def addComponent[T](lifestyle: LifestyleType, overwriteLifestyle: Boolean)(implicit classType: TypeTag[T]) {
    addComponent(classType.toString, classType.tpe, lifestyle, overwriteLifestyle);
  }

  def addComponent[T](serviceType: Type)(implicit classType: TypeTag[T]) {
    addComponent(classType.toString, serviceType, classType.tpe);
  }

  def addComponent[T](serviceType: Type, lifestyle: LifestyleType)(implicit classType: TypeTag[T]) {
    addComponent(classType.toString, serviceType, classType.tpe, lifestyle);
  }

  def addComponent[T](serviceType: Type, lifestyle: LifestyleType, overwriteLifestyle: Boolean)(implicit classType: TypeTag[T]) {
    addComponent(classType.toString, serviceType, classType.tpe, lifestyle, overwriteLifestyle);
  }


  def getAssignableHandlers(service: Type): Array[Handler] = {
    return null;
  }

  def getFacilities(): Array[Facility] = {
    throw new Exception();
  }

  def getHandler(name: String): Handler = {
    throw new Exception();
  }

  def getHandler(service: Type): Handler = {
    throw new Exception();
  }

  def getHandlers(service: Type): Array[Handler] = {
    throw new Exception();
  }

  def getSubSystem(name: String): SubSystem = {
    throw new Exception();
  }

  def hasComponent(name: String): Boolean = {
    throw new Exception();
  }

  def hasComponent(service: Type): Boolean = {
    throw new Exception();
  }

  def register(registers: Registration*): Kernel = {
    throw new Exception();
  }

  def releaseComponent(instance: Any): Unit = {
    throw new Exception();
  }

  def removeChildKernel(kernel: Kernel): Unit = {
    throw new Exception();
  }

  def resolve(service: Type): Any = {
    throw new Exception();
  }

  def resolve(service: Type, arguments: Map[Any, Any]): Any = {
    throw new Exception();
  }

  def resolve(service: Type, arguments: Any): Any = {
    throw new Exception();
  }

  def resolve[T](argumentObject: Any): T = {
    throw new Exception();
  }

  def resolve[T](): T = {
    throw new Exception();
  }

  def resolve[T](key: String): T = {
    throw new Exception();
  }

  def resolve(key: String, arguments: Any): Any = {
    throw new Exception();
  }

  def resolve(key: String, service: Type): Any = {
    throw new Exception();
  }

  def resolve(key: String, service: Type, arguments: Any): Any = {
    throw new Exception();
  }

  def resolveAll(service: Type): Array[Any] = {
    throw new Exception();
  }

  def resolveAll(service: Type, arguments: Map[Any, Any]): Array[Any] = {
    throw new Exception();
  }

  def resolveAll(service: Type, arguments: Any): Array[Any] = {
    throw new Exception();
  }

  def resolveAll[T](): Array[T] = {
    throw new Exception();
  }

  def resolveAll[T](arguments: Map[Any, Any]): Array[T] = {
    throw new Exception();
  }

  def resolveAll[T](argumentObject: Any): Array[T] = {
    throw new Exception();
  }
}
