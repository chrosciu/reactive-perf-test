package com.nuxplanet.gatling.imperative

import com.nuxplanet.gatling.BaseSimulation

abstract class ImperativeBaseSimulation extends BaseSimulation {
  def url() = "http://127.0.0.1:8081"
}


