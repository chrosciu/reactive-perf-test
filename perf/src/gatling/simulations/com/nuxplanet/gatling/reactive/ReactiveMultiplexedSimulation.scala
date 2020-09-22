package com.nuxplanet.gatling.reactive

class ReactiveMultiplexedSimulation extends ReactiveBaseSimulation {
  def scenarioName() = "reactive-multiplexed"
  def action() = "/reactive/item/multiplexed"

  run()
}
