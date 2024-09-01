package com.project.bottommbar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BottomBar() {
    Scaffold(
        bottomBar = {
            BottomAppBar(
                containerColor = Color(0xFF008080),
                actions = {
                    Column(
                        modifier = Modifier.padding(start = 25.dp)
                    ) {
                        Icon(
                            Icons.Filled.Home, "Home",
                            modifier = Modifier.size(47.dp),
                            tint = Color.White
                        )
                        Text(
                            text = "Home",
                            color = Color.White,
                            fontSize = 20.sp
                        )
                    }
                    Spacer(
                        modifier = Modifier.padding(start = 60.dp)
                    )
                    Column(
                        modifier = Modifier.padding(start = 20.dp)
                    ) {
                        Icon(
                            Icons.Filled.Search, "Search",
                            modifier = Modifier.size(47.dp),
                            tint = Color.White
                        )
                        Text(
                            text = "Search",
                            color = Color.White,
                            fontSize = 20.sp
                        )
                    }
                    Spacer(
                        modifier = Modifier.padding(start = 60.dp)
                    )
                    Column(
                        modifier = Modifier.padding(start = 20.dp)
                    ) {
                        Icon(
                            Icons.Filled.Person, "Profile",
                            modifier = Modifier.size(47.dp),
                            tint = Color.White
                        )
                        Text(
                            text = "Profile",
                            color = Color.White,
                            fontSize = 20.sp
                        )
                    }
                }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Bottom Navigation Bar",
                fontSize = 39.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
        }
    }
}
