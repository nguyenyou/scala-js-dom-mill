package io.github.nguyenyou.dom

import scala.scalajs.js

trait PermissionStatus extends EventTarget {
  val state: PermissionState
  var onchange: js.Function1[Event, ?]
}
