package io.github.nguyenyou.dom

import scala.scalajs.js

opaque type WorkerType <: String = String

object WorkerType {
  val classic: WorkerType = "classic"
  val module: WorkerType = "module"
}
