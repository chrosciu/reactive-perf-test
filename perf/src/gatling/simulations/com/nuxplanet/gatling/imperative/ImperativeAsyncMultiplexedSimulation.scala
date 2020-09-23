package com.nuxplanet.gatling.imperative

class ImperativeAsyncMultiplexedSimulation extends ImperativeBaseSimulation {
  def scenarioName() = "imperative-async-multiplexed"
  def action() = "/imperative/item/async/multiplexed"

  run()
}
