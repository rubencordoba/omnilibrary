package com.rubencordoba.omnilibrary.features.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun OmniMainScreen(viewModel: OmniMainViewModel, navController: NavController) {
    Column() {
        Text("This is Main Fragment!")
        Spacer(modifier = Modifier.height(4.dp))
        Button(onClick = { viewModel.goToSearchList(navController) }) {
            Text(text = "Ir a Search Screen")
        }
    }
}

@Preview
@Composable
fun OmniMainScreenPreview() {
    OmniMainScreen(viewModel(), rememberNavController())
}