package com.github.julesssss.moderndagger

/**
 * AnalyticsHelper is a simple example of a class that might be re-used in multiple places. At this
 * point there is no state to initialise or configuration to setup. We will cover these more complex
 * scenarios later on.
 */
class AnalyticsHelper {

    fun simulatePageTracking(page: String) {
        log("Tracking page: '$page', from AnalyticsHelper: ${hashCode()}.")
    }

}