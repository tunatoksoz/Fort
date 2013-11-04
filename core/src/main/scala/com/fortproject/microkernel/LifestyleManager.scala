package com.fortproject.microkernel

import com.fortproject.microkernel.context.CreationContext
import com.fortproject.core.ComponentModel

trait LifestyleManager {
  def init(componentActivator: ComponentActivator, kernel: Kernel, model: ComponentModel);
  def release(instance: Object);
  def resolve(context: CreationContext, releasePolicy: ReleasePolicy): Any;
}
