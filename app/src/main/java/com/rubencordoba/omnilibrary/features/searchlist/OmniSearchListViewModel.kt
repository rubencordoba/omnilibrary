package com.rubencordoba.omnilibrary.features.searchlist

import androidx.lifecycle.ViewModel
import androidx.navigation.NavController

class OmniSearchListViewModel : ViewModel() {

    fun goToMain(navController: NavController) {
        navController.navigate("main")
    }
}