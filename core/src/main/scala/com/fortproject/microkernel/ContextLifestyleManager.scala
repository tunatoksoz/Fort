package com.fortproject.microkernel

import com.fortproject.microkernel.context.CreationContext

trait ContextLifestyleManager {
  def getContextInstance(context: CreationContext): Any;
}
