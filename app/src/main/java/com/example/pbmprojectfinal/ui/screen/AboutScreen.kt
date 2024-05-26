package com.example.pbmprojectfinal.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.pbmprojectfinal.R

@Composable
fun AboutScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        AboutCard()
    }
}

@Composable
fun AboutCard() {
    Card(
        elevation = 4.dp,
        shape = RoundedCornerShape(24.dp),
    ) {
        Column(
            modifier = Modifier
                .padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = stringResource(R.string.pbm_final_project))

            Spacer(modifier = Modifier.height(8.dp))

            Text(text = stringResource(R.string.dibuat_oleh))

            Spacer(modifier = Modifier.height(8.dp))

            Text(text = stringResource(R.string.askar_aziz))

            Spacer(modifier = Modifier.height(8.dp))

            Text(text = stringResource(R.string.muhammad_nizar_asykary))
        }
    }
}

//@Composable
//fun MenuButton() {
//    var expanded by remember { mutableStateOf(false) }
//    var selectedItem by remember { mutableStateOf("Choice 1") }
////    var isDarkTheme by remember { mutableStateOf(isSystemInDarkTheme() }
//
//    Row {
//        OutlinedButton(
//            onClick = { expanded = true },
//            modifier = Modifier.padding(8.dp)
//        ) {
//            Text(selectedItem)
//        }
//
//        DropdownMenu(
//            expanded = expanded,
//            onDismissRequest = { expanded = false }
//        ) {
//            DropdownMenuItem(
//                onClick = {
//                    selectedItem = "Choice 1"
//                    expanded = false
//                }
//            ) {
//                Text("Choice 1")
//            }
//
//            DropdownMenuItem(
//                onClick = {
//                    selectedItem = "Choice 2"
//                    expanded = false
//                }
//            ) {
//                Text("Choice 2")
//            }
//        }
//    }
//}
