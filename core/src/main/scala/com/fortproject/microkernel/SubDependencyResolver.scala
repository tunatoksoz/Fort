package com.fortproject.microkernel

import com.fortproject.microkernel.context.CreationContext
import com.fortproject.core.{DependencyModel, ComponentModel}

trait SubDependencyResolver {
  def canResolve(context: CreationContext,
                 contextHandlerResolver: SubDependencyResolver,
                 model: ComponentModel,
                 dependencyModel: DependencyModel): Boolean;
  def resolve(context: CreationContext,
              contextHandlerResolve: SubDependencyResolver,
              model: ComponentModel,
              dependencyModel: DependencyModel): Any;
}
