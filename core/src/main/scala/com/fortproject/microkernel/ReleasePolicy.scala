package com.fortproject.microkernel

trait ReleasePolicy {
  def createSubPolicy(): ReleasePolicy;
  def hasTrack(instance: Any): Boolean;
  def release(instance: Any);
  def track(instance: Any, burden: Burden);
}
