package com.fortproject.microkernel.proxy

import com.fortproject.microkernel.{ProxyFactoryExtension, Kernel, ProxyFactory}
import com.fortproject.core.ComponentModel
import com.fortproject.microkernel.context.CreationContext

class DefaultProxyFactory extends ProxyFactory {
  def addInterceptorSelector(selector: ModelInterceptorSelector): Unit = ???

  def create(kernel: Kernel, instance: Any, model: ComponentModel, context: CreationContext, constructorArguments: Any*): Unit = ???

  def create(customFactory: ProxyFactoryExtension, kernel: Kernel, model: ComponentModel, context: CreationContext, constructorArguments: Any*): Unit = ???

  def requiresTargetInstance(kernel: Kernel, model: ComponentModel): Boolean = ???

  def shouldCreateProxy(model: ComponentModel): Boolean = ???
}
