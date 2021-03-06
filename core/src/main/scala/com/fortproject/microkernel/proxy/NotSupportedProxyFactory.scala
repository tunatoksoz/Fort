package com.fortproject.microkernel.proxy

import com.fortproject.microkernel.{ProxyFactoryExtension, Kernel, ProxyFactory}
import com.fortproject.core.ComponentModel
import com.fortproject.microkernel.context.CreationContext

class NotSupportedProxyFactory extends ProxyFactory {
  def addInterceptorSelector(selector: ModelInterceptorSelector): Unit = {

  }

  def create(kernel: Kernel, instance: Any, model: ComponentModel, context: CreationContext, constructorArguments: Any*): Unit = {
    throw new NotImplementedError();
  }

  def create(customFactory: ProxyFactoryExtension, kernel: Kernel, model: ComponentModel, context: CreationContext, constructorArguments: Any*): Unit = {

  }

  def requiresTargetInstance(kernel: Kernel, model: ComponentModel): Boolean = false;

  def shouldCreateProxy(model: ComponentModel): Boolean = false;
}
