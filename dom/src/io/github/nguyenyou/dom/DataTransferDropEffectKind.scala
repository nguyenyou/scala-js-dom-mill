package io.github.nguyenyou.dom

import scala.scalajs.js

opaque type DataTransferDropEffectKind <: String = String

object DataTransferDropEffectKind {
  val none: DataTransferDropEffectKind = "none"
  val copy: DataTransferDropEffectKind = "copy"
  val link: DataTransferDropEffectKind = "link"
  val move: DataTransferDropEffectKind = "move"
}
