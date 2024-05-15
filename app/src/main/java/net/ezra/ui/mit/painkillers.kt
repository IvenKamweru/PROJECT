package net.ezra.ui.mit

import android.content.res.Configuration
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MIT


//@Composable
//fun MitScreen(navController: NavHostController) {
    @Composable
    fun MitScreen(navController: NavHostController) {
        val nameState = remember { mutableStateOf("") }
        val emailState = remember { mutableStateOf("") }
        val phoneState = remember { mutableStateOf("") }

    Column {




                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        OutlinedTextField(
                            value = nameState.value,
                            onValueChange = { nameState.value = it },
                            label = { Text("Name") },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(bottom = 8.dp)
                        )

                        OutlinedTextField(
                            value = emailState.value,
                            onValueChange = { emailState.value = it },
                            label = { Text("Email") },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(bottom = 8.dp)
                        )

                        OutlinedTextField(
                            value = phoneState.value,
                            onValueChange = { phoneState.value = it },
                            label = { Text("Phone Number") },
                            modifier = Modifier.fillMaxWidth()
                        )
                        Button(onClick = {
                            // You can perform actions like validation or navigation here
                        },

                            ) {
                            Text(text = "Submit")
                        }
                    }
        
                }






    }



@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    MitScreen(rememberNavController())
}

