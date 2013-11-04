package com.fortproject.microkernel

import scala.reflect.runtime.universe._

trait HandlerSelector {
  def hasOpinionAbout(key: String, service: Type): Boolean;
  def selectHandler(key: String, service: Type, handlers: Handler);
}
