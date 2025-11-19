/** https://www.w3.org/TR/2016/CR-mediacapture-streams-20160519/ */
package io.github.nguyenyou.dom

import scala.scalajs.js

trait MediaStreamTrackEventInit extends EventInit {
  var track: js.UndefOr[MediaStreamTrack] = js.undefined
}
