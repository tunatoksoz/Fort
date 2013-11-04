package com.fortproject.microkernel

import scala.reflect.runtime.universe._

trait HandlersFilter {
  def hasOpinionAbout(service: Type);
  def selectHandlers(service: Type, handlers: Array[Handler]): Array[Handler];
}
