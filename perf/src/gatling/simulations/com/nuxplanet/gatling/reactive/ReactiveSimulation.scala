package com.nuxplanet.gatling.reactive

class ReactiveSimulation extends ReactiveBaseSimulation {
  scenarioName = "reactive-one-item"
  action = "/reactive/item"

  run()
}
