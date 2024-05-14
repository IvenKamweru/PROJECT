package net.ezra.ui.services


import android.content.ClipData.Item
import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.ui.theme.AppTheme
import net.ezra.R


@Composable
fun ServicesScreen(navController: NavHostController) {






    Column(
        modifier = Modifier
            .background(Color(0xFFe2d8df3)),
        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
        
        
        



    ) 
    
    
    {
        
        


Spacer(modifier = Modifier.height(100.dp))
   Image(painter = painterResource(id =R.drawable.hosi), contentDescription ="null",
       modifier = Modifier.size(100.dp)



       )


        LazyColumn {
            item {


                Row {




                    Column {


                        Spacer(modifier = Modifier.height(100.dp))
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight(),
                            elevation = CardDefaults.cardElevation(10.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color(0xFFE97d5ed)
                            )

                        ) {



                            Row {



                                Card(
                                    modifier = Modifier
                                        .width(150.dp)
                                        .height(100.dp)
                                        .padding(10.dp),
                                    elevation = CardDefaults.cardElevation(10.dp),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color(0xFFE09639d)
                                    )


                                )
                                {

                                    Image(painter = painterResource(id = R.drawable.xray), contentDescription ="null", modifier = Modifier.fillMaxSize() )
                                }
                                Card(
                                    modifier = Modifier
                                        .width(200.dp)
                                        .height(100.dp)
                                        .padding(10.dp),
                                    elevation = CardDefaults.cardElevation(10.dp),
                                    colors = CardDefaults.cardColors(containerColor = Color.White)

                                ) {

                                    Text(text = "X-Ray")

                                }

                            }



                            Spacer(modifier = Modifier.height(10.dp))


                            Row {


                                Card(
                                    modifier = Modifier
                                        .width(150.dp)
                                        .height(100.dp)
                                        .padding(10.dp),
                                    elevation = CardDefaults.cardElevation(10.dp),
                                    colors = CardDefaults.cardColors(containerColor = Color.White)

                                ){

                                    Image(painter = painterResource(id = R.drawable.imun), contentDescription ="null", modifier = Modifier.fillMaxSize()

                                    )
                                }


                                Card(
                                    modifier = Modifier
                                        .width(200.dp)
                                        .height(100.dp)
                                        .padding(10.dp),
                                    elevation = CardDefaults.cardElevation(10.dp),
                                    colors = CardDefaults.cardColors(containerColor = Color.White)

                                ){

                                    Text(text = "Immunization")
                                }
                            }



                            Spacer(modifier = Modifier.height(10.dp))

                            Row {

                                Card(
                                    modifier = Modifier
                                        .width(150.dp)
                                        .height(100.dp)
                                        .padding(10.dp),
                                    elevation = CardDefaults.cardElevation(10.dp),
                                    colors = CardDefaults.cardColors(containerColor = Color.White)

                                ) {

                                    Image(painter = painterResource(id = R.drawable.eye), contentDescription ="null", modifier = Modifier.fillMaxSize() )

                                }
                                Card(
                                    modifier = Modifier
                                        .width(200.dp)
                                        .height(100.dp)
                                        .padding(10.dp),
                                    elevation = CardDefaults.cardElevation(10.dp),
                                    colors = CardDefaults.cardColors(containerColor = Color.White)

                                ){
                                    Text(text = "Opthalmology")
                                }

                            }

                            Spacer(modifier = Modifier.height(10.dp))


                            Row {

                                Card(
                                    modifier = Modifier
                                        .width(150.dp)
                                        .height(100.dp)
                                        .padding(10.dp),
                                    elevation = CardDefaults.cardElevation(10.dp),
                                    colors = CardDefaults.cardColors(containerColor = Color.White)
                                ){
                                    Image(painter = painterResource(id = R.drawable.derm), contentDescription ="null", modifier = Modifier.fillMaxSize() )

                                }

                                Card(
                                    modifier = Modifier
                                        .width(200.dp)
                                        .height(100.dp)
                                        .padding(10.dp),
                                    elevation = CardDefaults.cardElevation(10.dp),
                                    colors = CardDefaults.cardColors(containerColor = Color.White)

                                ){
                                    Text(text = "Dermatology")
                                }

                            }

                            Spacer(modifier = Modifier.height(10.dp))


                            Row {

                                Card(
                                    modifier = Modifier
                                        .width(150.dp)
                                        .height(100.dp)
                                        .padding(10.dp),
                                    elevation = CardDefaults.cardElevation(10.dp),
                                    colors = CardDefaults.cardColors(containerColor = Color.White)
                                ){
                                    Image(painter = painterResource(id = R.drawable.phys), contentDescription ="null", modifier = Modifier.fillMaxSize() )

                                }

                                Card(
                                    modifier = Modifier
                                        .width(200.dp)
                                        .height(100.dp)
                                        .padding(10.dp),
                                    elevation = CardDefaults.cardElevation(10.dp),
                                    colors = CardDefaults.cardColors(containerColor = Color.White)

                                ){
                                    Text(text = "Physician")
                                }
                            }


                            Spacer(modifier = Modifier.height(10.dp))


                            Row {

                                Card(
                                    modifier = Modifier
                                        .width(150.dp)
                                        .height(100.dp)
                                        .padding(10.dp),
                                    elevation = CardDefaults.cardElevation(10.dp),
                                    colors = CardDefaults.cardColors(containerColor = Color.White)
                                ){
                                    Image(painter = painterResource(id = R.drawable.inf), contentDescription ="null", modifier = Modifier.fillMaxSize() )

                                }

                                Card(
                                    modifier = Modifier
                                        .width(200.dp)
                                        .height(100.dp)
                                        .padding(10.dp),
                                    elevation = CardDefaults.cardElevation(10.dp),
                                    colors = CardDefaults.cardColors(containerColor = Color.White)

                                ){
                                    Text(text = "Maternity")
                                }
                            }

                            Spacer(modifier = Modifier.height(10.dp))

                            Row {

                                Card(
                                    modifier = Modifier
                                        .width(150.dp)
                                        .height(100.dp)
                                        .padding(10.dp),
                                    elevation = CardDefaults.cardElevation(10.dp),
                                    colors = CardDefaults.cardColors(containerColor = Color.White)
                                ){
                                    Image(painter = painterResource(id = R.drawable.lab), contentDescription ="null", modifier = Modifier.fillMaxSize() )

                                }

                                Card(
                                    modifier = Modifier
                                        .width(200.dp)
                                        .height(100.dp)
                                        .padding(10.dp),
                                    elevation = CardDefaults.cardElevation(10.dp),
                                    colors = CardDefaults.cardColors(containerColor = Color.White)

                                ){
                                    Text(text = "Laboratory")
                                }

                            }























































































                        }
                    }
                }

            }
        }
    }

}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    ServicesScreen(rememberNavController())
}

