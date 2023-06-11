package com.rubencordoba.omnilibrary.features.searchlist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.rubencordoba.omnilibrary.R
import com.rubencordoba.omnilibrary.core.adapters.SearchListAdapter
import com.rubencordoba.omnilibrary.core.models.BookSearchItem

class SearchListFragment : Fragment() {


    private lateinit var viewModel: SearchListViewModel
    private lateinit var searchListRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_search_list, container, false)

        searchListRecyclerView = view.findViewById(R.id.search_list_recyclerview)

        val listener = object : SearchListAdapter.OnItemClickListener {
            override fun onItemClick(book: BookSearchItem) {
                navigateToBookDetails()
            }

        }

        searchListRecyclerView.adapter = SearchListAdapter(arrayListOf(), listener)

        return view
    }

    private fun navigateToBookDetails() {
        //TODO: Mandar argumento de procedencia e ISBN
        findNavController().navigate(
            SearchListFragmentDirections.actionSearchListFragmentToBookDetailsFragment()
        )
    }


}