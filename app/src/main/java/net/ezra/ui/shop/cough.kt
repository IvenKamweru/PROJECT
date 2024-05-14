package net.ezra.ui.shop


import android.content.res.Configuration
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController


@Composable
fun ShopScreen(navController: NavHostController) {

    Column (modifier = Modifier
        .fillMaxSize()
    ) {
         {

        }
        Text(text = "STOCK INSIGHT")

        Card (
            colors = CardDefaults.cardColors(Color(0xffEf3dc9e )),
            elevation = CardDefaults.cardElevation(5.dp)
        ){

            Text(text = "UnitsSold", color = Color.Black, fontSize = 15.sp)


        }







    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    ShopScreen(rememberNavController())
}

