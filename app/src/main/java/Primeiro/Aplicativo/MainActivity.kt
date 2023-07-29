package com.exemple.Primeiro.Aplicativo

import androidx.compose.foundation.layout.Row
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import Primeiro.Aplicativo.ui.theme.RikelmeTheme
import android.os.Message
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RikelmeTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    PrimeiraMensagem(message = "Bem vindo ao meu primeiro aplicativo", por = "rikelme")
                }
            }
        }
    }
}
@Composable
fun PrimeiraMensagem(message: String, por: String) { //aqui crio uma função e entre "()" defino que tipo de dados seram recebidos
    Column(content = { //aqui defino o formato que apareceram o texto na tela, seja coluna, lado a lado e etc
        Text(text = message, fontSize = 36.sp) //aqui defino o texto que vai ser recebido atravez da "message" e o tamanho atraves do "fontsize"
        Text(text = por, fontSize = 24.sp)
    })
}
@Preview(showBackground = true)
@Composable
fun PrimeiraMensagemPreview() { //nesta linha é onde faço a chamada de visualização do aplicativo
    RikelmeTheme {
        PrimeiraMensagem(message = "Bem vindo ao meu primeiro aplicativo", por = "Rikelme") //chamo a função text e insiro a "message"
    }
}