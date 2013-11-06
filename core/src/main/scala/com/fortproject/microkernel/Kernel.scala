package com.fortproject.microkernel

import scala.reflect.runtime.universe._
import com.fortproject.core.internal.GraphNode
import com.fortproject.microkernel.registration.Registration
import com.fortproject.microkernel.subsystems.configuration.ConfigurationStore

trait Kernel extends KernelEvents {
  def componentModelBuilder: ComponentModelBuilder;
  def configurationStore: ConfigurationStore;
  def graphNodes: Array[GraphNode];
  def handlerFactory: HandlerFactory;
  def parent: Kernel;
  def addChildKernel(kernel: Kernel);
  def addFacility(facility: Facility);
  def addFacility[T <: Facility](): Kernel;
  def addFacility[T <: Facility](onCreate: (T)=>Unit);
  def addHandlerSelector(selector: HandlerSelector);
  def addHandlersFilter(filter: HandlersFilter);
  def addSubsystem(name: String, subsystem: SubSystem);
  def getAssignableHandlers(service: Type): Array[Handler];
  def getFacilities(): Array[Facility];
  def getHandler(name: String): Handler;
  def getHandler(service: Type): Handler;
  def getHandlers(service: Type): Array[Handler];
  def getSubSystem(name: String): SubSystem;
  def hasComponent(name: String): Boolean;
  def hasComponent(service: Type): Boolean;
  def register(registers: Registration*): Kernel;
  def releaseComponent(instance: Any);
  def removeChildKernel(kernel: Kernel);
  def resolve(service: Type): Any;
  def resolve(service: Type, arguments: Map[Any, Any]): Any;
  def resolve(service: Type, arguments: Any): Any;
  def resolve(key: String, service: Type): Any;
  def resolve[T](argumentObject: Any): T;
  def resolve[T](): T;
  def resolve[T](key: String): T;
  def resolve(key: String, arguments: Any): Any;
  def resolve(key: String, service: Type, arguments: Any): Any;
  def resolveAll(service: Type): Array[Any];
  def resolveAll(service: Type, arguments: Map[Any, Any]): Array[Any];
  def resolveAll(service: Type, arguments: Any): Array[Any];
  def resolveAll[T](): Array[T];
  def resolveAll[T](arguments: Map[Any, Any]): Array[T];
  def resolveAll[T](argumentObject: Any): Array[T];
}
