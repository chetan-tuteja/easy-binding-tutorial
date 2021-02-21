package com.chetantuteja.easy_binding_tutorial.activites

import android.view.LayoutInflater
import com.chetantuteja.easy_binding_tutorial.R
import com.chetantuteja.easy_binding_tutorial.databinding.ActivityMainBinding
import com.chetantuteja.easy_binding_tutorial.fragments.ExampleFragment
import com.chetantuteja.easy_binding_tutorial.utils.performFragmentTransaction

/**
 * @author Chetan Tuteja (chetan.tuteja@gmail.com)
 * @since 21-Feb-21
 */
class MainActivity : BindingActivity<ActivityMainBinding>() {

    companion object {
        const val TAG = "MainActivity"
    }

    override fun setupViewBinding(inflater: LayoutInflater): ActivityMainBinding {
        return ActivityMainBinding.inflate(inflater)
    }

    override fun init() {
        setupViews()
    }

    private fun setupViews() {
        // Set Text using ViewBinding.
        binding.tvWelcomeMsg.text = getString(R.string.easy_binding_activity)

        // Set onClick Action using ViewBinding.
        binding.btnLoadFrag.setOnClickListener {
            performFragmentTransaction(
                ExampleFragment(), ExampleFragment.TAG
            )
        }
    }
}