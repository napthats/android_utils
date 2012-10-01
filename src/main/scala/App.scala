package com.napthats.android.utils

import _root_.android.view.View

object ListenerImplicit {
  implicit def function2ViewOnClickListener(f: View => Unit): View.OnClickListener = {
    new View.OnClickListener() {
      def onClick(view: View) { f(view) }
    }
  }
}

