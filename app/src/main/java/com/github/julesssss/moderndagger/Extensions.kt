package com.github.julesssss.moderndagger

import android.content.Context
import android.util.Log
import android.widget.Toast

/**
 * Collection of Extension Functions. If the function takes a lambda parameter we should declare it
 * inline for performance improvements.
 *
 * - See https://kotlinlang.org/docs/reference/extensions.html for more information.
 */

/**
 * Simplify the method for displaying toast messages. Default to short length, but allow this to be changed.
 */
fun Context.toast(message: String?, longToast: Boolean = false) {
    if (message.isNullOrEmpty()) return
    Toast.makeText(this, message, if (longToast) Toast.LENGTH_LONG else Toast.LENGTH_SHORT).show()
}

/**
 * Simplify the method for displaying log messages. Default to debug, allow info level with flag.
 */
fun Any.log(message: String?, infoLevel: Boolean = true) {
    if (infoLevel) Log.d(this::class.java.simpleName, message)
    else Log.i(this::class.java.simpleName, message)
}