package com.fortproject.core.internal

import scala.reflect.runtime.universe._

class ComponentName(private val _name: String, private val _setByUser: Boolean) {
  def name: String = _name;
  def setByUser: Boolean = _setByUser;
}

object ComponentName {
  def defaultFor(componentType: Type): ComponentName = {
    return new ComponentName(ComponentName.defaultNameFor(componentType), false);
  }
  def defaultNameFor(componentType: Type): String = {
    return componentType.toString(); // TODO(tunatoksoz): Fix.
  }
}
