package com.fortproject.microkernel.subsystems.configuration

import scala.reflect.runtime.universe._

trait Configuration {
  def name: String;
  def value: String;
  def children: ConfigurationCollection;
  def attributes: ConfigurationAttributeCollection;
  def getValue(typ: Type, defaultValue: Any);
}
