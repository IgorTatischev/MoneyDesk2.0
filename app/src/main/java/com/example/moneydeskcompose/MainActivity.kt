package com.example.moneydeskcompose

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.moneydeskcompose.navigation.NavGraph
import com.example.moneydeskcompose.ui.theme.MoneyDeskComposeTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MoneyDeskComposeTheme {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = { Text(text = "dsfsdf")},
                            backgroundColor = Color.Blue,
                            contentColor = Color.White,
                            elevation = 12.dp
                        )
                    },
                    content = {
//                      padding ->Column(modifier = Modifier.padding(padding)
                        Surface (
                            modifier = Modifier.fillMaxSize(),
                            color = MaterialTheme.colors.background

                        ){
                            NavGraph()
                            //
                        }
                    }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MoneyDeskComposeTheme {
        //TODO
    }
}