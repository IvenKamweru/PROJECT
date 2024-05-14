package net.ezra.ui.contact


import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.ui.theme.AppTheme



@Composable
fun ContactScreen(navController: NavHostController) {
Column (
    modifier = Modifier
        .fillMaxSize()
        .background(color = Color(0xFFE34a8d5)),



    horizontalAlignment = Alignment.CenterHorizontally,



){

    IconButton(onClick = { navController.navigate(ROUTE_HOME){
        popUpTo(ROUTE_CONTACT){inclusive= true}
    } }) {
        Icon(painter = painterResource(id = R.drawable.back), contentDescription ="null")
    }


    Row(
        horizontalArrangement = Arrangement.Center
    ) {
        Text(text = "CONTACT US",  fontSize = 30.sp, textDecoration = TextDecoration.Underline)
    }

    Text(text = "Find us through", fontSize =25.sp )
}



    Column(modifier = Modifier

    ) {








        Spacer(modifier = Modifier.height(40.dp))
       Box(modifier = Modifier.fillMaxSize(),
       contentAlignment = Alignment.Center,


       ){
        Card (modifier = Modifier
            .width(300.dp)
            .height(500.dp),
            elevation = CardDefaults.cardElevation(10.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFEf0e3a3)
            )
        ){

            Spacer(modifier = Modifier.height(20.dp))
            Spacer(modifier = Modifier.width(20.dp))


            Row {


            Card(modifier = Modifier
                .width(160.dp)
                .height(70.dp)
                .padding(10.dp),
                elevation = CardDefaults.cardElevation(10.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )

            ){

                Row {


                Image (painter = painterResource(id = R.drawable.ooo),
                    contentDescription ="null",

                    modifier = Modifier.size(40.dp))

                    Spacer(modifier = Modifier.width(20.dp))
                    Text(text = "07696969", fontSize = 15.sp)
                    




                }


            }

                Spacer(modifier = Modifier.width(10.dp))
                
                Card (modifier = Modifier
                    .width(100.dp)
                    .height(90.dp),
                    elevation = CardDefaults.cardElevation(10.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent
                    )

                ){

                    Image(painter = painterResource(id = R.drawable.prof), contentDescription ="null",
                        modifier = Modifier.size(100.dp))
                }






            Text(

                text = ""
            )


        }

            Spacer(modifier = Modifier.height(20.dp))

            Row {

                Card(
                    modifier = Modifier
                        .width(300.dp)
                        .height(70.dp)
                        .padding(10.dp),
                    elevation = CardDefaults.cardElevation(10.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    )

                ) {
                    Row {



                    Image(painter = painterResource(id = R.drawable.mall), contentDescription ="null"
                       )
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(text = "PharmaStock", fontSize = 30.sp)
                    }
                }

     



            }

            Spacer(modifier = Modifier.height(10.dp))

            Row {

                Card (
                    modifier = Modifier
                        .width(300.dp)
                        .height(70.dp)
                        .padding(10.dp),
                    elevation = CardDefaults.cardElevation(10.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    )

                ){
                    Row {



                    Image(painter = painterResource(id = R.drawable.ig), contentDescription ="null" )
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(text = "PharmaStock", fontSize = 30.sp)
                    }

                }

            }


            Spacer(modifier = Modifier.height(10.dp))

            Row {

                Card(
                    modifier = Modifier
                        .width(300.dp)
                        .height(70.dp)
                        .padding(10.dp),
                    elevation = CardDefaults.cardElevation(10.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    )
                ) {
                    Row {



                    Image(painter = painterResource(id = R.drawable.xx), contentDescription ="null" )
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(text = "PharmaStock", fontSize = 30.sp)

                    }
                }



            }
            Spacer(modifier = Modifier.height(10.dp))

            Row {

                Card(
                   modifier = Modifier
                       .width(300.dp)
                       .height(70.dp)
                       .padding(10.dp),
                    elevation = CardDefaults.cardElevation(10.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    )

                ) {
                    Row {

                        Image(painter = painterResource(id = R.drawable.tel), contentDescription ="null" )
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(text = "PharmaStock", fontSize = 30.sp)
                    }
                    
                    
                    
                }

               
                
            }
            Text(text = "", textDecoration = TextDecoration.Underline)













































        }
       }







    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    ContactScreen(rememberNavController())
}

