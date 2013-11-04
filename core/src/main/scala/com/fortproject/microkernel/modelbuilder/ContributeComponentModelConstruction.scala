package com.fortproject.microkernel.modelbuilder

import com.fortproject.core.ComponentModel
import com.fortproject.microkernel.Kernel

trait ContributeComponentModelConstruction {
  def processModel(kernel: Kernel, model: ComponentModel);
}
