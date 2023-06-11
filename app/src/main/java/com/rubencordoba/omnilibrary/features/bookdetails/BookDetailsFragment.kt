package com.rubencordoba.omnilibrary.features.bookdetails

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.rubencordoba.omnilibrary.R

class BookDetailsFragment : Fragment() {


    private lateinit var viewModel: BookDetailsViewModel
    private lateinit var bookDetailsButton: Button
    //TODO: Recoger argumento de procedencia

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_book_details, container, false)

        bookDetailsButton = view.findViewById(R.id.book_details_button)

        listeners()

        return view
    }

    private fun listeners() {
        bookDetailsButton.setOnClickListener {
            //TODO: Controlar argumento de procedencia
            findNavController().navigate(
                BookDetailsFragmentDirections.actionBookDetailsFragmentToMainFragment()
            )
        }
    }

}