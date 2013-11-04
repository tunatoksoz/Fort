package com.fortproject.microkernel.context

import com.fortproject.microkernel.SubDependencyResolver
import com.fortproject.core.{DependencyModel, ComponentModel}

class CreationContext extends SubDependencyResolver {


  def canResolve(context: CreationContext,
                 contextHandlerResolver: SubDependencyResolver,
                 model: ComponentModel,
                 dependencyModel: DependencyModel): Boolean = {
    return false;
  }

  def resolve(context: CreationContext,
              contextHandlerResolve: SubDependencyResolver,
              model: ComponentModel,
              dependencyModel: DependencyModel): Any = {

  }
}
