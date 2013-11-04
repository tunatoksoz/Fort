package com.fortproject.microkernel

import scala.reflect.runtime.universe._;

import com.fortproject.core.internal.ComponentName
import com.fortproject.microkernel.modelbuilder.{ContributeComponentModelConstruction, ComponentModelDescriptor}

trait ComponentModelBuilder {
  def contributors: Array[ContributeComponentModelConstruction];
  def addContributor(contributor: ContributeComponentModelConstruction);
  def buildModel(name: ComponentName,
                 services: Array[Type],
                 classType: Type,
                 extendedProperties: Map[Any, Any]);
  def buildModel(customContributors: Array[ComponentModelDescriptor]);
  def removeContributor(contributor: ContributeComponentModelConstruction);
}
