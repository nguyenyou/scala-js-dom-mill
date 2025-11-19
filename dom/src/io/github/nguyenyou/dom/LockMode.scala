package io.github.nguyenyou.dom

import scala.scalajs.js

opaque type LockMode <: String = String

object LockMode {
  val exclusive: LockMode = "exclusive"

  val shared: LockMode = "shared"
}
