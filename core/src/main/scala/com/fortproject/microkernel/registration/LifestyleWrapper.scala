package com.fortproject.microkernel.registration

class LifestyleWrapper {
  def transient() : ComponentRegistrationObject = {
    throw new NotImplementedError()
  }
}
