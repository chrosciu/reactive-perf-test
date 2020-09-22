package com.nuxplanet.gatling.imperative

class ImperativeMultiplexedSimulation extends ImperativeBaseSimulation {
  def scenarioName() = "imperative-multiplexed"
  def action() = "/imperative/item/multiplexed"

  run()
}
