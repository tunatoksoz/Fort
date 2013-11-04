package com.fortproject.microkernel

import com.fortproject.microkernel.context.CreationContext
import com.fortproject.core.ComponentModel
import com.fortproject.core.dynamicproxy.{ProxyGenerationOptions, ProxyBuilder, Interceptor}

trait ProxyFactoryExtension {
  def generate(builder: ProxyBuilder,
               options: ProxyGenerationOptions,
               interceptors: Array[Interceptor],
               model: ComponentModel,
               context: CreationContext): Any;
}
