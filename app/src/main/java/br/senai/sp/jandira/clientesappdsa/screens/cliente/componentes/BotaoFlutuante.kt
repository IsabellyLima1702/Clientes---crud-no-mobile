package br.senai.sp.jandira.clientesappdsa.screens.cliente.componentes

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.senai.sp.jandira.clientesappdsa.ui.theme.ClientesAppDSATheme

@Composable
fun BotaoFlutuante(modifier: Modifier = Modifier){
    FloatingActionButton(
        onClick = {},
        shape = CircleShape
    ) {
        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = "Botão adicionar"
        )
    }
}

@Preview
@Composable
private fun BotaoFlutuantePreview(){
    ClientesAppDSATheme {
        BotaoFlutuante()
    }
}