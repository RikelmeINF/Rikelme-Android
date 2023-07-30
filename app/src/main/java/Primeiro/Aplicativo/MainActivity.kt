package Primeiro.Aplicativo

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
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() { // É o que apareça no no dispositivo
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RikelmeTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    CorpoBackground(message = "BEM VINDO ", por = "RIKELME")
                }
            }
        }
    }
}

@Composable
fun CorpoBackground(message: String, por: String, ){
    Box{
        val image = painterResource(id = R.drawable.wallpaper_luffy)
        Image(
            painter = image, // preenchimento
            contentDescription = null,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(), // serve para dimensionar a imagem de fundo tanto no quesito altura e largura
            contentScale = ContentScale.Crop, // para que a imagem se redimensione para o tamanho da tela do dispositivo
        )
        Mensagem(message= message, por= por)
    }

}

@Composable
fun Mensagem(message: String, por: String) { //aqui crio uma função e entre "()" defino que tipo de dados seram recebidos
            Text( //aqui defino o texto que vai ser recebido atravez da "message" e o tamanho atraves do "fontsize"
                text = message,
                fontSize = 32.sp,
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .wrapContentHeight(align = Alignment.Top) //serve para alinhar na horizontal
                    .wrapContentWidth(align = Alignment.CenterHorizontally) // alinhar verticalmente
                    .padding(start = 0.dp, end = 0.dp, top = 0.dp, bottom = 0.dp)
            )
       //  Column(content = {// Aqui defino uma coluna
           Text( //aqui defino o texto que vai ser recebido atravez da "por" e o tamanho atraves do "fontsize"
               text = por,
               fontSize = 32.sp,
               modifier = Modifier
                   .fillMaxWidth()
                   .fillMaxHeight()
                   .wrapContentHeight(align = Alignment.Bottom) //serve para alinhar na horizontal
                   .wrapContentWidth(align = CenterHorizontally) // alinhar verticalmente
                   .padding(start = 1.dp, end = 1.dp)
           )
       }

@Preview(showBackground = true)
@Composable
fun CorpoBackgroundPreview() { //nesta linha é onde faço a chamada de visualização do aplicativo no Computador
    RikelmeTheme {
        CorpoBackground(message = "BEM VINDO", por = "RIKELME") //chamo a função text e insiro a "message"
    }
}