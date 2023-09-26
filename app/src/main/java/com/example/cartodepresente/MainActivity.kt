package com.example.cartodepresente

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.cartodepresente.ui.theme.CartãoDePresenteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartãoDePresenteTheme {
            }
        }
    }
}
@Preview (showSystemUi = true)
@Composable
fun telaCartaoPresente(){
    Text(
        text = "Feliz Aniversário Mamãe!"
    )
    Text(
        text = "para: Daniela Milfont" )
}

