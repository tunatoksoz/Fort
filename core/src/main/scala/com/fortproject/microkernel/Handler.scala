package com.fortproject.microkernel

import scala.reflect.runtime.universe._
import com.fortproject.microkernel.context.CreationContext
import com.fortproject.core.ComponentModel
import com.fortproject.microkernel.HandlerState.HandlerState

trait Handler extends SubDependencyResolver {
  def componentModel: ComponentModel;
  def currentState: HandlerState;
  def init(kernel: KernelInternal);
  def isBeingResolvedInContext(context: CreationContext);
  def release(burden: Burden): Boolean;
  def resolve(context: CreationContext);
  def supports(service: Type);
  def supportsAssignable(service: Type);
  def tryResolve(context: CreationContext);
}
