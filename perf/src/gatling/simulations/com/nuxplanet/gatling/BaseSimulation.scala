package com.nuxplanet.gatling

import io.gatling.core.Predef._
import io.gatling.http.Predef._

abstract class BaseSimulation extends Simulation {
  var numberOfUsers = 1000
  var rampDuration = 3
  var delay = 500

  def scenarioName(): String
  def url(): String
  def action(): String

  def fullScenarioName(): String = scenarioName() + ", users: " + numberOfUsers + ", delay: " + delay

  def fullAction(): String = action() + "?delay=" + delay

  def run() {
    val httpConf = http
      .baseUrl(url())
      .warmUp(url())

    val simpleRecord = scenario(fullScenarioName())
      .exec(http(fullScenarioName()).get(fullAction()))
      .exec()

    setUp(simpleRecord.inject(rampUsers(numberOfUsers).during(rampDuration)))
      .protocols(httpConf)
  }
}


