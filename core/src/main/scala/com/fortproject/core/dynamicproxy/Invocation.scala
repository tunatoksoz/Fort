package com.fortproject.core.dynamicproxy

import scala.reflect.runtime.universe._

trait Invocation {
  def arguments: Array[Any];
  def genericArguments: Array[Any];
  def invocationTarget: Any;
  def method: Type;
  def methodInvocationTarget: Type;
  def proxy: Object;
  def returnValue: Object;
  def targetType: Type;
  def getArgumentValue(index: Int);
  def getConcreteMethod: Type;
  def getConcreteMethodInvocationTarget: Type;
  def proceed;
  def setArgumentValue(index: Int, value: Any);
}
