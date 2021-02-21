package com.chetantuteja.easy_binding_tutorial.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.chetantuteja.easy_binding_tutorial.R
import kotlinx.android.synthetic.main.fragment_example.*

/**
 * @author Chetan Tuteja (chetan.tuteja@gmail.com)
 * @since 21-Feb-21
 */
class ExampleFragment : Fragment() {

    companion object {
        const val TAG = "ExampleFragment"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_example, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViews()
    }

    private fun setupViews() {
        // Set Text using Kotlin Synthetics.
        tvWelcomeMsg.text = getString(R.string.synthetic_fragment)

        // Set onClick Action using Kotlin Synthetics.
        btnShowToast.setOnClickListener {
            Toast.makeText(
                requireContext(), getString(R.string.synthetic_fragment),
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}