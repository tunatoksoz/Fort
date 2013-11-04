package com.fortproject.microkernel.registration

import com.fortproject.microkernel.KernelInternal

trait Registration {
  def register(kernel: KernelInternal);
}
