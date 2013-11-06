package com.fortproject.microkernel

import com.fortproject.microkernel.context.CreationContext
import com.fortproject.core.{DependencyModel, ComponentModel}

class NotImplementedDependencyResolver extends DependencyResolver {
  def addSubResolver(subResolver: SubDependencyResolver): Unit = ???

  def initialize(kernel: KernelInternal, resolving: KernelEvents.DependencyDelegate): Unit = ???

  def removeSubResolver(subResolver: SubDependencyResolver): Unit = ???

  def resolve(context: CreationContext, contextHandlerResolve: SubDependencyResolver, model: ComponentModel, dependencyModel: DependencyModel): Any = ???

  def canResolve(context: CreationContext, contextHandlerResolver: SubDependencyResolver, model: ComponentModel, dependencyModel: DependencyModel): Boolean = ???
}
