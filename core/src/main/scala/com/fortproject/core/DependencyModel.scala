package com.fortproject.core

import scala.reflect.runtime.universe._

class DependencyModel(val dependencyKey: String,
                      val targetType: Type,
                      val isOptional: Boolean,
                      val hasDefaultValue: Boolean = false,
                      val defaultValue: Any = null) {
}
