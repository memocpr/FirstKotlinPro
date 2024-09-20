package com.example.myfirstkotlinproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myfirstkotlinproject.ui.theme.MyFirstKotlinProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyFirstKotlinProjectTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    FirstExample(
                        firstName = "evoMR ",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    MyFirstKotlinProjectTheme {
//        Greeting("Android")
//    }
//}
@Composable
fun FirstExample(firstName: String, modifier: Modifier = Modifier) {
    val name = remember {mutableStateOf(firstName)}
    Row(verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(all = 5.dp)) {
        //string output in light gray text color
        Text(name.value, modifier = Modifier.background(Color.LightGray))

    // and a button component (onClick changes
    // the name, this will automatically
    // redraw the screen)
    Button(onClick = { name.value = "John Ford" })
    { Text("Change Name") }
} }