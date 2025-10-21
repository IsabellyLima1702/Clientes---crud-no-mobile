package br.senai.sp.jandira.clientesappdsa.screens.cliente

import android.content.res.Configuration
import android.util.Patterns
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.clientesappdsa.model.Cliente
import br.senai.sp.jandira.clientesappdsa.service.Conexao
import br.senai.sp.jandira.clientesappdsa.ui.theme.ClientesAppDSATheme
import br.senai.sp.jandira.clientesappdsa.ui.theme.DicasAppDSATheme
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.await

@Composable
fun TelaDicas(padding: PaddingValues, controleNavegacao: NavHostController?) {

    //Criar uma instância da conexão com a API
    val clienteApi = Conexao().getClienteService()

    Surface (
        modifier = Modifier
            .padding(padding)
            .fillMaxSize()
    ){
        Column (
            modifier =  Modifier
                .fillMaxSize()
        ){
            Row (
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                verticalAlignment =  Alignment.CenterVertically
            ){
                Text(
                    text = "Home",
                    style = MaterialTheme.typography.titleLarge,
                    color = MaterialTheme.colorScheme.onPrimaryContainer
                )
                Text(
                    text = "Calendário",
                    style = MaterialTheme.typography.titleLarge,
                    color = MaterialTheme.colorScheme.onPrimaryContainer
                )
                Text(
                    text = "Dicas",
                    style = MaterialTheme.typography.titleLarge,
                    color = MaterialTheme.colorScheme.onPrimaryContainer
                )
                Text(
                    text = "Rotina",
                    style = MaterialTheme.typography.titleLarge,
                    color = MaterialTheme.colorScheme.onPrimaryContainer
                )
                Icon(
                    imageVector =  Icons.Default.Person,
                    contentDescription = "Person"
                )
                Spacer(modifier = Modifier.width(16.dp))
            }
            Spacer(modifier =  Modifier
                .height(16.dp)
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ClienteFormPreview(){
    DicasAppDSATheme{
        TelaDicas(PaddingValues(0.dp), null)
    }
}