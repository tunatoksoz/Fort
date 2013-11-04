package com.fortproject.microkernel

import com.fortproject.core.ComponentModel

trait HandlerFactory {
  def create(model: ComponentModel): Handler;
}
