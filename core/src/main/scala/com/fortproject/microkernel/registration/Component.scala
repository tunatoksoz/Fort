package com.fortproject.microkernel.registration

import scala.reflect.runtime.universe._
import com.fortproject.core.NotImplementedException

object Component {
  def forr(serviceType: Type): ComponentRegistrationObject = {
    throw new NotImplementedException();
  }

  def forr(serviceType: Type*): ComponentRegistrationObject = {
    throw new NotImplementedException();
  }

  def forr(serviceType: Iterable[Type]): ComponentRegistrationObject = {
    throw new NotImplementedException();
  }

  def forr[TService1](): ComponentRegistration[TService1] = {
    throw new NotImplementedException();
  }

  def hasAttribute[TAttribute](typ: Type) = {
    throw new NotImplementedException();
  }

  def hasAttribute[TAttribute](filter: (TAttribute=>Boolean)) = {
    throw new NotImplementedException();
  }
}
