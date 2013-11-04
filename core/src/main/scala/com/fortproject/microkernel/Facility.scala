package com.fortproject.microkernel

import com.fortproject.core.Configuration;

trait Facility {
  def init(kernel: Kernel, facilityConfig: Configuration);
  def terminate();
}
