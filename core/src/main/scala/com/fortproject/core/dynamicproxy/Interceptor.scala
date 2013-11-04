package com.fortproject.core.dynamicproxy

trait Interceptor {
  def intercept(invocation: Invocation)
}
