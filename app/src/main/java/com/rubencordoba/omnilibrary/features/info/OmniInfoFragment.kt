package com.rubencordoba.omnilibrary.features.info

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rubencordoba.omnilibrary.R

class OmniInfoFragment : Fragment() {

    companion object {
        fun newInstance() = OmniInfoFragment()
    }

    private lateinit var viewModel: OmniInfoViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_omni_info, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(OmniInfoViewModel::class.java)
        // TODO: Use the ViewModel
    }

}