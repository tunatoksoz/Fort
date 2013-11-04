package com.fortproject.microkernel

import com.fortproject.microkernel.context.CreationContext
import com.fortproject.core.ComponentModel

trait Reference[T]{
  def attach(component: ComponentModel);
  def detach(component: ComponentModel);
  def resolve(kernel: Kernel, context: CreationContext): T;
}

