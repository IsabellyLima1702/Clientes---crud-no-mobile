package br.senai.sp.jandira.clientesappdsa.screens.cliente

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.clientesappdsa.R

@Composable
fun Dicas(modifier: Modifier){
    Box(
        modifier = Modifier
            .fillMaxSize()
    )
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.Red)
    ){
        Image(
            painter = painterResource(R.drawable.logo),
            contentDescription = "",
            modifier = Modifier
                .size(100.dp)
                .padding(top = 30.dp)
        )
        Column (
            modifier = Modifier
                .fillMaxHeight()
        ){
            Text(
                text = "Home",
                color = Color.Black,
                fontSize = 45.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun TelaDicasPreview(){
    Dicas(modifier = Modifier)
}