package com.fortproject.microkernel

object HandlerState extends Enumeration {
  type HandlerState = Value
  val Valid, WaitingDependency = Value;
}