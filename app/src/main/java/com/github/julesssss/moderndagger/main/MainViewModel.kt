package com.github.julesssss.moderndagger.main

/**
 * ViewModel which provides data and state to MainActivity. Should have no knowledge of Activity
 * behaviour or state.
 */
class MainViewModel {

    /**
     * Simulates a ViewModel function.
     *
     * @return a list of integers
     */
    fun retrieveInts() = listOf(1, 2, 3, 4, 5, 6)

}