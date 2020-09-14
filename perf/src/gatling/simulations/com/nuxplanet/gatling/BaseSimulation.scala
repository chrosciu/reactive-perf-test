package com.nuxplanet.gatling

import io.gatling.core.Predef._
import io.gatling.http.Predef._

abstract class BaseSimulation extends Simulation {
  var scenarioName = "DUMMY"
  var numberOfUsers = 1000
  var rampDuration = 3
  var url = "DUMMY"
  var action = "DUMMY"

  def run()  {
    val httpConf = http
      .baseUrl(url)
      .warmUp(url)

    val simpleRecord = scenario(scenarioName)
                .exec(http(scenarioName + ": " + action).get(action))
                .exec()

    setUp(simpleRecord.inject(rampUsers(numberOfUsers).during(rampDuration)))
      .protocols(httpConf)
  }
}


