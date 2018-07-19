package com.github.julesssss.moderndagger.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.github.julesssss.moderndagger.R
import com.github.julesssss.moderndagger.log

/**
 * MainActivity is the single Activity in this project. It uses the MVVM pattern to retrieve data in
 * a single direction from the ViewModel.
 */
class MainActivity : AppCompatActivity() {

    private val viewModel by lazy { MainViewModel() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.retrieveInts().forEach {
            log("received $it")
        }
    }
}
