package com.fortproject.core

import scala.reflect.runtime.universe._
import com.fortproject.core.dynamicproxy.Interceptor
import com.fortproject.core.internal.ComponentName
import com.fortproject.microkernel.{Kernel, Reference}
import com.fortproject.microkernel.context.CreationContext

class InterceptorReference(val referencedComponentName: String) extends Reference[Interceptor] {
  private var referencedComponentType: Type = _;

  def this(componentType: Type) {
    this(ComponentName.defaultNameFor(componentType));
    referencedComponentType = componentType;
  }

  override def hashCode() : Int = {
    return this.referencedComponentName.hashCode();
  }

  def attach(component: ComponentModel): Unit = {

  }

  def detach(component: ComponentModel): Unit = {

  }

  def resolve(kernel: Kernel, context: CreationContext): Interceptor = {
    return null;
  }
}
