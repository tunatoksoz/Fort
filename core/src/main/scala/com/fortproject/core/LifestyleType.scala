package com.fortproject.core

object LifestyleType extends Enumeration {
  type LifestyleType = Value
  val Undefined, Singleton, Thread, Transient, Pooled, PerWebRequest, Custom, Bound = Value;
}
