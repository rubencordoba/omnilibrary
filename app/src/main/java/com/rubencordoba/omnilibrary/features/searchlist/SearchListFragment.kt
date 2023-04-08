package com.rubencordoba.omnilibrary.features.searchlist

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rubencordoba.omnilibrary.R

class SearchListFragment : Fragment() {

    companion object {
        fun newInstance() = SearchListFragment()
    }

    private lateinit var viewModel: SearchListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_search_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SearchListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}