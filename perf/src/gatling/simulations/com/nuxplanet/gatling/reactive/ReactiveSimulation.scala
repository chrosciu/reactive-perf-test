package com.nuxplanet.gatling.reactive

import com.nuxplanet.gatling.BaseSimulation

class ReactiveSimulation extends BaseSimulation{
  scenarioName = "reactive"
  numberOfUsers = 1000
  url = "http://localhost:8090"
  action = "/reactive/item"

  run()
}
