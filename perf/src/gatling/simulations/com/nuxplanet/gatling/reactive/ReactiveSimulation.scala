package com.nuxplanet.gatling.reactive

class ReactiveSimulation extends ReactiveBaseSimulation {
  def scenarioName() = "reactive"
  def action() = "/reactive/item"

  run()
}
