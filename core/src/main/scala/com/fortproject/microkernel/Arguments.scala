package com.fortproject.microkernel

class Arguments() extends scala.collection.mutable.OpenHashMap[Any, Any]  {
  def putt(key: Any, value: Any) = {
    put(key, value);
    this;
  }
}
