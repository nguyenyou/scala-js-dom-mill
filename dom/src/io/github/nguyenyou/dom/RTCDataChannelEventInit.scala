/** http://www.w3.org/TR/2015/WD-webrtc-20150210/ */
package io.github.nguyenyou.dom

import scala.scalajs.js

trait RTCDataChannelEventInit extends EventInit {
  var channel: js.UndefOr[RTCDataChannel] = js.undefined
}
