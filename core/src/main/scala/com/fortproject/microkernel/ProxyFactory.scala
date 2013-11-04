package com.fortproject.microkernel

import com.fortproject.core.ComponentModel
import com.fortproject.microkernel.context.CreationContext
import com.fortproject.microkernel.proxy.ModelInterceptorSelector

trait ProxyFactory {
  def addInterceptorSelector(selector: ModelInterceptorSelector);
  def create(kernel: Kernel,
             instance: Any,
             model: ComponentModel,
             context: CreationContext,
             constructorArguments: Any*);
  def create(customFactory: ProxyFactoryExtension,
             kernel: Kernel,
             model: ComponentModel,
             context: CreationContext,
             constructorArguments: Any*);
  def requiresTargetInstance(kernel: Kernel, model:ComponentModel): Boolean;
  def shouldCreateProxy(model: ComponentModel): Boolean;
}
