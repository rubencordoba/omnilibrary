package com.rubencordoba.omnilibrary.features.searchlist

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
import com.rubencordoba.omnilibrary.features.main.OmniMainViewModel

@Composable
fun OmniSearchListScreen(viewModel: OmniSearchListViewModel, navController: NavController) {
    Column() {
        Text("This is Search List Fragment!")
        Spacer(modifier = Modifier.height(4.dp))
        Button(onClick = { viewModel.goToMain(navController) }) {
            Text(text = "Ir a Main Screen")
        }
    }
}

@Preview
@Composable
fun OmniSearchListScreenPreview() {
    OmniSearchListScreen(viewModel(), rememberNavController())
}