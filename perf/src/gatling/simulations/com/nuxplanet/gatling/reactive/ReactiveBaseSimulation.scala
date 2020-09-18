package com.nuxplanet.gatling.reactive

import com.nuxplanet.gatling.BaseSimulation

abstract class ReactiveBaseSimulation extends BaseSimulation {
  def url() = "http://127.0.0.1:8090"
}


