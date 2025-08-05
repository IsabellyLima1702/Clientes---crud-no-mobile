package br.senai.sp.jandira.clientesappdsa.screens.cliente

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.senai.sp.jandira.clientesappdsa.screens.cliente.componentes.BarraDeTitulo
import br.senai.sp.jandira.clientesappdsa.screens.cliente.componentes.BarraInferior
import br.senai.sp.jandira.clientesappdsa.screens.cliente.componentes.BotaoFlutuante
import br.senai.sp.jandira.clientesappdsa.screens.cliente.componentes.Conteudo
import br.senai.sp.jandira.clientesappdsa.ui.theme.ClientesAppDSATheme

@Composable
fun ListaDeClientes(modifier: Modifier = Modifier){
   Scaffold(
       topBar = {
           BarraDeTitulo()
       },
       bottomBar = {
           BarraInferior()
       },
       floatingActionButton = {
           BotaoFlutuante()
       },
       content = { padding ->
           Conteudo(padding)
       }
   )
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
private fun ListaDeClientesPreview(){
    ClientesAppDSATheme {
        ListaDeClientes()
    }
}