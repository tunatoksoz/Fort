package com.fortproject.microkernel

import com.fortproject.microkernel.context.CreationContext
import com.fortproject.core.ComponentModel

abstract class InstanceReference[T](private val instance: T) extends Reference[T] {
  def attach(component: ComponentModel) = {

  }
  def detach(component: ComponentModel) = {

  }
  def resolve(kernel: Kernel, context: CreationContext): T = {
    return instance;
  }
}
