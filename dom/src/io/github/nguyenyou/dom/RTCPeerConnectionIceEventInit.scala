/** http://www.w3.org/TR/2015/WD-webrtc-20150210/ */
package io.github.nguyenyou.dom

import scala.scalajs.js

trait RTCPeerConnectionIceEventInit extends EventInit {
  var candidate: js.UndefOr[RTCIceCandidate] = js.undefined
}
