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
import android.os.Message
import androidx.compose.material3.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RikelmeTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                }
            }
        }
    }
}
@Composable
fun PrimeiraMensagem(message: String) {
    Text(text = message)
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RikelmeTheme {
        PrimeiraMensagem(message = "Bem vindo ao meu primeiro aplicativo")
    }
}