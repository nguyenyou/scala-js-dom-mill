package io.github.nguyenyou.dom

opaque type EndOfStreamError <: String = String

object EndOfStreamError {
  val decode: EndOfStreamError = "decode"
  val network: EndOfStreamError = "network"
}
