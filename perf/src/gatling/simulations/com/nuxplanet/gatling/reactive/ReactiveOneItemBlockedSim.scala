package com.nuxplanet.gatling.reactive

class ReactiveOneItemBlockedSim extends ReactiveBaseSimulation {
  scenarioName = "reactive-one-item-blocked"
  action = "/reactive/item/blocked"

  run()
}
