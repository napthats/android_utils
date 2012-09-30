package com.napthats.android

import _root_.android.view.View

object ListenerUtils {
  implicit def function2ViewOnClickListener(f: View => Unit): View.OnClickListener = {
    new View.OnClickListener() {
      def onClick(view: View) { f(view) }
    }
  }
}

