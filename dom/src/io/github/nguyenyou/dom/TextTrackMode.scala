package io.github.nguyenyou.dom

opaque type TextTrackMode <: String = String

object TextTrackMode {
  val disabled: TextTrackMode = "disabled"
  val hidden: TextTrackMode = "hidden"
  val showing: TextTrackMode = "showing"
}
