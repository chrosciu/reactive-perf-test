package com.nuxplanet.gatling.reactive

class ReactiveBlockingSimulation extends ReactiveBaseSimulation {
  scenarioName = "reactive-blocking"
  action = "/reactive/item/blocking"

  run()
}
