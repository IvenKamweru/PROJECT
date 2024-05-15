package net.ezra.ui.home

import android.graphics.drawable.Icon
import android.icu.number.Scale
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MIT
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_EVENING
import net.ezra.navigation.ROUTE_PRODUCTS
import net.ezra.navigation.ROUTE_SHOP

import net.ezra.R
import net.ezra.navigation.ROUTE_ADD_STUDENTS

@Composable
fun HomeScreen(navController: NavHostController) {


    Column (modifier = Modifier
        .background(color = Color(0XFFEb0f4fa))

        .fillMaxSize()
    ) {

        {

        }
        Text(text = "STOCK INSIGHT", fontFamily = FontFamily.Default, fontSize = 15.sp,)

   Spacer(modifier = Modifier.height(10.dp))

        LazyRow {
           item {
               Row {



                   Card ( modifier = Modifier
                       .height(80.dp)
                       .width(100.dp),

                       colors = CardDefaults.cardColors(
                           containerColor = Color.White
                       ),
                       elevation = CardDefaults.cardElevation(5.dp),

                       )


                   {

                       Text(text = "Contacts",
                           modifier = Modifier.clickable{navController.navigate(ROUTE_CONTACT) {
                               popUpTo(ROUTE_HOME) { inclusive = true }
                           }},
                           color = Color.Black, fontSize = 15.sp)

                   }

                   Spacer(modifier = Modifier.width(5.dp))

                   Card ( modifier = Modifier
                       .height(80.dp)
                       .width(100.dp),


                       colors = CardDefaults.cardColors(
                           containerColor = Color.White
                       ),
                       elevation = CardDefaults.cardElevation(5.dp),


                       ){

                       Text(text = "Services",
                           modifier = Modifier.clickable{navController.navigate(ROUTE_SERVICES) {
                               popUpTo(ROUTE_HOME) { inclusive = true }
                           }}
                           )
                   }

                   Spacer(modifier = Modifier.width(5.dp))

//                   Card(
//                       modifier = Modifier
//                           .width(100.dp)
//                           .height(80.dp)
//                           ,
//                       elevation = CardDefaults.cardElevation(10.dp),
//                       colors = CardDefaults.cardColors(
//                           containerColor = Color.White
//                       )
//
//
//                   )
//                   {
//Column (modifier = Modifier.padding(10.dp)
//    .padding(10.dp),
//    verticalArrangement = Arrangement.Center
//
//
//
//)
//{
//
//}
//
//                   }

               } }
        }

     Spacer(modifier = Modifier.height(20.dp))


  Text(text = "QUICK ACTIONS",color = Color(0XFFE160030))


Spacer(modifier = Modifier.height(10.dp))


        Row {




            Card( modifier = Modifier
                .height(150.dp)
                .width(150.dp),

                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFE78c7f6)
                ),
                elevation = CardDefaults.cardElevation(5.dp)



                ) {

                Column(modifier = Modifier
                    .width(100.dp)
                    .height(100.dp)
                    .padding(20.dp),

                    ){



                    Image(painter = painterResource(id = R.drawable.co), contentDescription ="null" )
                }
                    Text(text = "CoughSyrup",
                        modifier = Modifier.clickable{navController.navigate(ROUTE_ABOUT) {
                            popUpTo(ROUTE_HOME) { inclusive = true }
                        }})


            }

               Spacer(modifier = Modifier.width(10.dp))

              Card( modifier = Modifier
                  .height(150.dp)
                  .width(150.dp),


                  colors = CardDefaults.cardColors(
                      containerColor = Color(0xFFE78c7f6)
                  ),
                  elevation = CardDefaults.cardElevation(5.dp)


              ) {

                  Column(modifier = Modifier
                      .width(100.dp)
                      .height(100.dp)
                      .padding(20.dp),

                  ) {

                     Image(painter = painterResource(id = R.drawable.pp), contentDescription ="null" )


                  }

                  Text(text = "PainKillers",
                      modifier = Modifier.clickable{navController.navigate(ROUTE_SHOP) {
                          popUpTo(ROUTE_HOME) { inclusive = true }
                      }}
                      )

              }




        }
   
        Spacer(modifier = Modifier.height(10.dp))

        Row {



        Spacer(modifier = Modifier.height(5.dp))



        Card( modifier = Modifier
            .height(150.dp)
            .width(150.dp),

            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFE78c7f6)
            ),
            elevation = CardDefaults.cardElevation(5.dp)




        ){
            Column (modifier = Modifier
                .width(100.dp)
                .height(100.dp)
                .padding(20.dp),


                ){

            Image(painter = painterResource(id = R.drawable.aa), contentDescription ="null" )


            }


            Text(text = "AntiBiotics",
                modifier = Modifier.clickable{navController.navigate(ROUTE_MIT) {
                    popUpTo(ROUTE_HOME) { inclusive = true }
                }})
        }

     Spacer(modifier = Modifier.width(10.dp))



        Card( modifier = Modifier
            .width(150.dp)
            .height(150.dp),

                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFE78c7f6)
                ),
            elevation = CardDefaults.cardElevation(5.dp)

        ){
            Column(modifier = Modifier
                .width(100.dp)
                .height(100.dp)
                .padding(20.dp),

            ){

                Image(painter = painterResource(id = R.drawable.oo), contentDescription ="null" )

            }



            Text(text = "Ointments",
                modifier = Modifier.clickable{navController.navigate(ROUTE_EVENING) {
                    popUpTo(ROUTE_HOME) { inclusive = true }
                }})



                }






        }

        Spacer(modifier = Modifier.height(40.dp))
Row {



        Text(text = "PharmaStock")

    Spacer(modifier = Modifier.width(50.dp))

Card(modifier = Modifier
    .width(50.dp)
    .height(50.dp),

    colors = CardDefaults.cardColors(
        containerColor = Color(0xFFEb0f688)

    ),
    elevation = CardDefaults.cardElevation(5.dp)

){
    Column {


        IconButton(onClick = { navController.navigate(ROUTE_HOME){
            popUpTo(ROUTE_HOME){inclusive= true}
        } }) {
            androidx.compose.material3.Icon(painter = painterResource(id = R.drawable.ho), contentDescription ="null")
        }
}


  }
    
    Spacer(modifier = Modifier.width(50.dp))
    
    Text(text = "By Iven")
    
}































    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    HomeScreen(rememberNavController())
}

