package de.dfki.cps.scemf

import com.typesafe.config.ConfigFactory

/**
  * @author Martin Ring <martin.ring@dfki.de>
  */
object Config {
  private lazy val config = ConfigFactory.load()
  lazy val clangCommand = config.getString("specific.systemc.clang")
  lazy val systemcHome = config.getString("specific.systemc.sc_home")
  lazy val systemCLib = config.getString("specific.systemc.sc_lib")
}
