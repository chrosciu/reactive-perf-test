package com.nuxplanet.gatling.imperative

class ImperativeAsyncSimulation extends ImperativeBaseSimulation {
  def scenarioName() = "imperative-async"
  def action() = "/imperative/item/async"

  run()
}
