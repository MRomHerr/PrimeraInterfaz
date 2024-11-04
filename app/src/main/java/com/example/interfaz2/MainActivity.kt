package com.example.interfaz2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.interfaz2.ui.theme.Interfaz2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Interfaz2Theme {
                // Contenido de la nueva interfaz
                Interfaz2()
            }
        }
    }
}
@Preview
@Composable
fun Interfaz2() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp) // Espaciado alrededor de la caja
            .background(Color.Black, shape = RoundedCornerShape(16.dp))
            .border(4.dp, Color.Blue, shape = RoundedCornerShape(16.dp))
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            // Primer Row
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f) // Distribuye el espacio de forma equitativa
                    .background(Color.White, shape = RoundedCornerShape(16.dp))
                    .border(4.dp, Color.Magenta, shape = RoundedCornerShape(16.dp))
            ) {
                // Primera Column
                Column(
                    modifier = Modifier
                        .weight(1f) // Asegura que las columnas ocupen espacio igual
                        .padding(8.dp)
                        .background(Color.Cyan, shape = RoundedCornerShape(8.dp))
                        .padding(30.dp)
                ) {
                    Text(text = "TEXT1", fontSize = 20.sp, color = Color.Black)
                    Text(text = "TEXT2", fontSize = 20.sp, color = Color.Black)
                }

                // Segunda Column
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .padding(8.dp)
                        .background(Color.Magenta, shape = RoundedCornerShape(8.dp))
                        .padding(16.dp)
                ) {
                    Text(text = "TEXT3", fontSize = 20.sp, color = Color.White)
                    Text(text = "TEXT4", fontSize = 20.sp, color = Color.White)
                }
            }

            // Espaciador
            Spacer(modifier = Modifier.height(300.dp))

            // Segundo Row
            Row(
                modifier = Modifier
                    .padding(16.dp)
                    .weight(1f)
                    .background(Color.White, shape = RoundedCornerShape(16.dp))
                    .border(4.dp, Color.Red, shape = RoundedCornerShape(16.dp))
            ) {
                // Primera Box
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .padding(8.dp)
                        .background(Color.Green, shape = RoundedCornerShape(8.dp))
                        .padding(16.dp),
                    contentAlignment = Alignment.Center // Centra el contenido
                ) {
                    Column {
                        Text(text = "TEXT5", fontSize = 20.sp, color = Color.White)
                        Text(text = "TEXT6", fontSize = 20.sp, color = Color.White)
                    }
                }

                // Segunda Box
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .padding(8.dp)
                        .background(Color.Red, shape = RoundedCornerShape(8.dp))
                        .padding(40.dp),
                    contentAlignment = Alignment.Center // Centra el contenido
                ) {
                    Column {
                        Text(text = "TEXT7", fontSize = 20.sp, color = Color.White)
                        Text(text = "TEXT8", fontSize = 20.sp, color = Color.White)
                    }
                }
            }
        }
    }
}

@Composable
fun GreetingPreview() {
    Interfaz2Theme {
        Interfaz2() // Vista previa de la nueva interfaz
    }
}
