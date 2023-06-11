package com.rubencordoba.omnilibrary.features.info

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.rubencordoba.omnilibrary.R

class InfoFragment : Fragment() {


    private lateinit var viewModel: InfoViewModel
    private lateinit var infoBackButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_info, container, false)

        infoBackButton = view.findViewById(R.id.info_back_button)

        listeners()

        return view
    }

    private fun listeners() {
        infoBackButton.setOnClickListener {
            findNavController().navigate(
                InfoFragmentDirections.actionInfoFragmentToMainFragment()
            )
        }
    }


}