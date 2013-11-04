package com.fortproject.microkernel

import com.fortproject.core.ComponentModel
import com.fortproject.core.DependencyModel

object KernelEvents {
  type DependencyDelegate = (ComponentModel, DependencyModel, Any) => Boolean;
}

trait KernelEvents {

}
