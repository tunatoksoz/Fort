package com.fortproject.microkernel

import scala.reflect.runtime.universe._
import com.fortproject.core.ComponentModel

trait KernelInternal extends Kernel {
  def addCustomComponent(model: ComponentModel): Handler;
  def createComponentActivator(model: ComponentModel): ComponentActivator;
  def createLifestyleManager(model: ComponentModel, activator: ComponentActivator): LifestyleManager;
  def loadHandlerByName(key: String, service: Type, arguments: Map[Any, Any]): Handler;
  def loadHandlerByType(key: String, service: Type, arguments: Map[Any, Any]): Handler;
  def optimizeDependencyResolution();
  def resolve(service: Type, arguments: Map[Any, Any], policy: ReleasePolicy): Any;
  def resolve(key: String, service: Type, arguments: Map[String, String], policy: ReleasePolicy);
  def resolveAll(service: Type, arguments: Map[Any, Any], policy: ReleasePolicy);
  def createHandler(model: ComponentModel): Handler;
  def raiseEventsOnHandlerCreated(handler: Handler);
}
