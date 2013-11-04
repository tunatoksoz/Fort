package com.fortproject.microkernel

trait SubSystem {
  def init(kernel: KernelInternal);
  def terminate();
}
