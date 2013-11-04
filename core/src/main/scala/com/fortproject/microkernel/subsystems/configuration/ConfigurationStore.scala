package com.fortproject.microkernel.subsystems.configuration

trait ConfigurationStore {
  def addChildContainerConfiguration(name: String, config: Configuration);
  def addComponentConfiguration(key: String, config: Configuration);
  def addFacilityConfiguration(key: String, config: Configuration);
  def addInstallerConfiguration(config: Configuration);
  def getChildContainerConfiguration(key: String): Configuration;
  def getComponentConfiguration(key: String): Configuration;
  def getComponents(): Traversable[Configuration];
  def getConfigurationForChildContainers(): Traversable[Configuration];
  def getFacilities(): Traversable[Configuration];
  def getInstallers(): Traversable[Configuration];
}
