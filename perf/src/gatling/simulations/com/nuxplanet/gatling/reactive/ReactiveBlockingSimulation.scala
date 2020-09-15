package com.nuxplanet.gatling.reactive

class ReactiveBlockingSimulation extends ReactiveBaseSimulation {
  scenarioName = "reactive-one-item-blocking"
  action = "/reactive/item/blocking"

  run()
}
