/*
 * Implements the Gamepad API.
 *
 * [[https://www.w3.org/TR/2015/WD-gamepad-20151217/ W3C Working Draft]]
 */

package io.github.nguyenyou.dom

import scala.scalajs.js

trait GamepadEventInit extends EventInit {
  var gamepad: js.UndefOr[Gamepad] = js.undefined
}
