package com.chetantuteja.easy_binding_tutorial.activites

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chetantuteja.easy_binding_tutorial.R
import com.chetantuteja.easy_binding_tutorial.fragments.ExampleFragment
import com.chetantuteja.easy_binding_tutorial.utils.performFragmentTransaction
import kotlinx.android.synthetic.main.activity_main.*

/**
 * @author Chetan Tuteja (chetan.tuteja@gmail.com)
 * @since 21-Feb-21
 */
class MainActivity : AppCompatActivity() {

    companion object {
        const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViews()
    }

    private fun setupViews() {
        // Set Text using Kotlin Synthetics.
        tvWelcomeMsg.text = getString(R.string.synthetic_activity)

        // Set onClick Action using Kotlin Synthetics.
        btnLoadFrag.setOnClickListener {
            performFragmentTransaction(
                ExampleFragment(), ExampleFragment.TAG
            )
        }
    }
}