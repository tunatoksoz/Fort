package com.fortproject.core.dynamicproxy

import scala.reflect.runtime.universe._

trait ProxyBuilder {
  def moduleScope: ModuleScope;
  def createClassProxy(classToProxy: Type, options: ProxyGenerationOptions): Type;
  def createClassProxy(classToProxy: Type, additionalTraitsToProxy: Array[Type], options: ProxyGenerationOptions): Type;
  def createClassProxyType(classToProxy: Type, additionalTraitsToProxy: Array[Type], options: ProxyGenerationOptions): Type;
  def createInterfaceProxyTypeWithTarget(traitToProxy: Type, additionalTraitsToProxy: Array[Type], options: ProxyGenerationOptions): Type;
  def createInterfaceProxyTypeWithTargetInterface(interfaceToProxy: Type, additionalInterfacesToProxy: Array[Type], options: ProxyGenerationOptions): Type;
}
