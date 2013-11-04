package com.fortproject.microkernel.proxy

import com.fortproject.core.{InterceptorReference, ComponentModel}

trait ModelInterceptorSelector {
  def hasInterceptors(model: ComponentModel): Boolean;
  def selectInterceptors(model: ComponentModel, interceptors: Iterable[InterceptorReference]);
}
