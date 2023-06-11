package com.rubencordoba.omnilibrary.features.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rubencordoba.omnilibrary.core.lifecycle.Event

class MainViewModel : ViewModel() {

    private val _navigateToBookDetails: MutableLiveData<Event<Unit>> = MutableLiveData()
    val navigateToBookDetails: LiveData<Event<Unit>> = _navigateToBookDetails

    private val _navigateToSearchList: MutableLiveData<Event<Unit>> = MutableLiveData()
    val navigateToSearchList: LiveData<Event<Unit>> = _navigateToSearchList

    fun searchByISBN() {
        _navigateToBookDetails.value = Event(Unit)
    }

    fun searchByTitle() {
        _navigateToSearchList.value = Event(Unit)
    }
}