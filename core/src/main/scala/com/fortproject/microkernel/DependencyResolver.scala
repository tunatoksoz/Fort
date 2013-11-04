package com.fortproject.microkernel

import scala.reflect.runtime.universe._

trait DependencyResolver extends SubDependencyResolver {
  def addSubResolver(subResolver: SubDependencyResolver);
  def initialize(kernel: KernelInternal, resolving: KernelEvents.DependencyDelegate);
  def removeSubResolver(subResolver: SubDependencyResolver);
}
