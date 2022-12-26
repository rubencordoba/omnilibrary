package com.rubencordoba.omnilibrary.features.bookdetails

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rubencordoba.omnilibrary.R

class OmniBookDetailsFragment : Fragment() {

    companion object {
        fun newInstance() = OmniBookDetailsFragment()
    }

    private lateinit var viewModel: OmniBookDetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_omni_book_details, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(OmniBookDetailsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}