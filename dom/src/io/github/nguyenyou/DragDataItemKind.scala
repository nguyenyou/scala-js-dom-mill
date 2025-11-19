package io.github.nguyenyou.dom

import scala.scalajs.js

opaque type DragDataItemKind <: String = String

object DragDataItemKind {
  val string: DragDataItemKind = "string"
  val file: DragDataItemKind = "file"
}
