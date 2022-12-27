package com.rubencordoba.omnilibrary.features.main

import androidx.lifecycle.ViewModel
import androidx.navigation.NavController

class OmniMainViewModel : ViewModel(

) {

    fun goToSearchList(navController: NavController) {
        navController.navigate("searchlist")
    }
}