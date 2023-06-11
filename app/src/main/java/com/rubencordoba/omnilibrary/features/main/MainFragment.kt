package com.rubencordoba.omnilibrary.features.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.rubencordoba.omnilibrary.R
import com.rubencordoba.omnilibrary.core.enums.BookSearchCriteriaType
import com.rubencordoba.omnilibrary.core.lifecycle.observeEvent

class MainFragment : Fragment() {

    private lateinit var viewModel: MainViewModel
    private lateinit var mainSearchButton: Button
    private lateinit var mainInfoButton: Button
    private lateinit var mainBookSearchCriteria: BookSearchCriteriaType

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_main, container, false)

        mainSearchButton = view.findViewById(R.id.main_search_button)
        mainBookSearchCriteria = BookSearchCriteriaType.ISBN
        listeners()
        observers()

        return view
    }

    private fun listeners() {
        mainSearchButton.setOnClickListener {
            if(mainBookSearchCriteria == BookSearchCriteriaType.ISBN) {
                viewModel.searchByISBN()
            } else if(mainBookSearchCriteria == BookSearchCriteriaType.TITLE) {
                viewModel.searchByTitle()
            }
        }

        mainInfoButton.setOnClickListener {
            navigateToInfo()
        }
    }

    private fun observers() {
        observeEvent(viewModel.navigateToBookDetails) {
            navigateToBookDetails()
        }

        observeEvent(viewModel.navigateToSearchList) {
            navigateToSearchList()
        }
    }

    private fun navigateToInfo() {
        findNavController().navigate(
            MainFragmentDirections.actionMainFragmentToInfoFragment()
        )
    }

    private fun navigateToBookDetails() {
        //TODO: Mandar argumento de procedencia e ISBN
        findNavController().navigate(
            MainFragmentDirections.actionMainFragmentToBookDetailsFragment()
        )
    }

    private fun navigateToSearchList() {
        //TODO: Mandar texto a buscar
        findNavController().navigate(
            MainFragmentDirections.actionMainFragmentToSearchListFragment()
        )
    }

}