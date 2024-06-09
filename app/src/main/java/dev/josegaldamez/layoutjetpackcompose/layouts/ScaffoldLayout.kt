package dev.josegaldamez.layoutjetpackcompose.layouts

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldLayout(){
    Scaffold(
        topBar = {
              TopAppBar(
                  colors = TopAppBarDefaults.topAppBarColors(
                      containerColor = Color.Magenta
                  ),
                  title = {
                  Text(text = "App bar")
              })
        },
        floatingActionButton = {
            FloatingActionButton(
                containerColor = Color.Magenta,
                shape = CircleShape,
                onClick = {}) {
                Text(
                    text = "+",
                    fontSize = 24.sp,
                    color = Color.White
                )
            }
        }
    ) {paddingValues ->
        Box(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
        ){

            Column {

                ItemContact(
                    name = "Jose Galdamez",
                    phoneNumber = "+504 9999-9999")

                ItemContact(
                    name = "Tony Stack",
                    phoneNumber = "+504 8888-9999")

                ItemContact(
                    name = "Peter Parker",
                    phoneNumber = "+504 8888-7777")

            }

        }

    }
}
