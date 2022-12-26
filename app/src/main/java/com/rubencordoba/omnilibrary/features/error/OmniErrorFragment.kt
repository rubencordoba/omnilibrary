package com.rubencordoba.omnilibrary.features.error

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rubencordoba.omnilibrary.R

class OmniErrorFragment : Fragment() {

    companion object {
        fun newInstance() = OmniErrorFragment()
    }

    private lateinit var viewModel: OmniErrorViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_omni_error, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(OmniErrorViewModel::class.java)
        // TODO: Use the ViewModel
    }

}