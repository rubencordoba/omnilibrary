package com.rubencordoba.omnilibrary.features.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rubencordoba.omnilibrary.R

class OmniMainFragment : Fragment() {

    companion object {
        fun newInstance() = OmniMainFragment()
    }

    private lateinit var viewModel: OmniMainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_omni_main, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(OmniMainViewModel::class.java)
        // TODO: Use the ViewModel
    }

}