package com.example.myfirstkotlinproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.unit.sp
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
    Column {
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(all = 5.dp)) {
            Text(name.value, modifier = Modifier.background(Color.LightGray).padding(8.dp).border(width = 1.dp, color=Color.Red), fontSize = 30.sp)
            Spacer(modifier = Modifier.width(16.dp))
            Button(onClick = { name.value = "John Ford" }) {
                Text("Change Name", modifier = Modifier.fillMaxWidth())
            }
        }
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(all = 5.dp)) {
            Text(name.value, modifier = Modifier.background(Color.LightGray).padding(8.dp).border(width = 1.dp, color=Color.Red), fontSize = 30.sp)
            Button(onClick = { name.value = "John Ford" }) {
                Text("Change Name", modifier = Modifier.fillMaxWidth())
            }
        }
        Row {
            //Note that weight will work in the direction of the
            //Row / Column
            Text("Text1", fontSize= 48.sp,
                color=Color.White,
                modifier = Modifier.background(Color(0xFF41729f)))
            Spacer(modifier = Modifier.weight(1.0f))
            Text("Text2", fontSize= 36.sp,
                color=Color.White,
                modifier = Modifier.background(Color(0xFF5885af)))
            Text("Text3", fontSize= 48.sp,
                color=Color.White,
                modifier = Modifier.background(Color(0xFF274472)))
        }
        Row {
            //Note that weight will work in the direction of the
            //Row / Column
            Text("Text1", fontSize= 48.sp,
                color=Color.White,
                modifier = Modifier.background(Color(0xFF41729f)))
            Text("Text2", fontSize= 36.sp,
                color=Color.White,
                modifier = Modifier.background(Color(0xFF5885af)))
            Text("Text3", fontSize= 48.sp,
                color=Color.White,
                modifier = Modifier.background(Color(0xFF274472)))
        }
    }
}