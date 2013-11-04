package com.fortproject.microkernel

import com.fortproject.microkernel.context.CreationContext

trait ComponentActivator {
  def create(contect: CreationContext, burden: Burden);
  def destroy(instance: Any);
}
