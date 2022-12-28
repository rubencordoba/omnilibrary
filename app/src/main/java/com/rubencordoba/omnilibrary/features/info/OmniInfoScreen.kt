package com.rubencordoba.omnilibrary.features.info

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun OmniInfoScreen(navController: NavController) {
    Column() {
        Text("This is Info Fragment!")
        Spacer(modifier = Modifier.height(4.dp))
        Button(onClick = { navController.navigate("main") }) {
            Text(text = "Ir a Main Screen")
        }
    }
}

@Preview
@Composable
fun OmniInfoScreenPreview() {
    OmniInfoScreen(rememberNavController())
}