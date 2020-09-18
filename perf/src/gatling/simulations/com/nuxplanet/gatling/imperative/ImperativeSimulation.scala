package com.nuxplanet.gatling.imperative

class ImperativeSimulation extends ImperativeBaseSimulation {
  def scenarioName() = "imperative"
  def action() = "/imperative/item"

  run()
}
