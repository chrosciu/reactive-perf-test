package com.nuxplanet.gatling.reactive

class ReactiveBlockingSimulation extends ReactiveBaseSimulation {
  def scenarioName() = "reactive-blocking"
  def action() = "/reactive/item/blocking"

  run()
}
