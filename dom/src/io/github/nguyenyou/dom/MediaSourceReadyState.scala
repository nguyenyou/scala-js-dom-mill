package io.github.nguyenyou.dom

opaque type MediaSourceReadyState <: String = String

object MediaSourceReadyState {
  val closed: MediaSourceReadyState = "closed"
  val ended: MediaSourceReadyState = "ended"
  val open: MediaSourceReadyState = "open"
}
