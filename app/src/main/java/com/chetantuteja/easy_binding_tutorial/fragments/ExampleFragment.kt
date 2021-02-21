package com.chetantuteja.easy_binding_tutorial.fragments

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import com.chetantuteja.easy_binding_tutorial.R
import com.chetantuteja.easy_binding_tutorial.databinding.FragmentExampleBinding

/**
 * @author Chetan Tuteja (chetan.tuteja@gmail.com)
 * @since 21-Feb-21
 */
class ExampleFragment : BindingFragment<FragmentExampleBinding>() {

    companion object {
        const val TAG = "BindingFragment"
    }

    override fun setupViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentExampleBinding {
        return FragmentExampleBinding.inflate(inflater, container, false)
    }

    override fun init() {
        setupViews()
    }

    private fun setupViews() {
        // Set Text using ViewBinding.
        binding.tvWelcomeMsg.text = getString(R.string.easy_binding_fragment)

        // Set onClick Action using ViewBinding.
        binding.btnShowToast.setOnClickListener {
            Toast.makeText(
                requireContext(), getString(R.string.easy_binding_fragment),
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}