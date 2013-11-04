package com.fortproject.microkernel.modelbuilder

import com.fortproject.core.ComponentModel
import com.fortproject.microkernel.Kernel

trait ComponentModelDescriptor {
  def buildComponentModel(kernel: Kernel, model: ComponentModel);
  def configureComponentModel(kernel: Kernel, model: ComponentModel);
}
