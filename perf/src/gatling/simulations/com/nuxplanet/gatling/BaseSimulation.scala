package com.nuxplanet.gatling

import io.gatling.core.Predef._
import io.gatling.http.Predef._

abstract class BaseSimulation extends Simulation {
  var scenarioName = "DUMMY"
  var numberOfUsers = 1
  var rampDuration = 3
  var delay = 500
  var url = "DUMMY"
  var action = "DUMMY"

  def run() {
    val httpConf = http
      .baseUrl(url)
      .warmUp(url)

    val simpleRecord = scenario(scenarioName)
      .exec(http(scenarioName + " with delay " + delay).get(action + "?delay=" + delay))
      .exec()

    setUp(simpleRecord.inject(rampUsers(numberOfUsers).during(rampDuration)))
      .protocols(httpConf)
  }
}


