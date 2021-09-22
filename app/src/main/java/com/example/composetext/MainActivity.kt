package com.example.composetext

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.composetext.ui.theme.ComposeTextTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    ComposeTextTheme {
        val fontFamily = FontFamily(
            Font(R.font.merriweather_regular, FontWeight.Normal),
            /*Font(R.font.merriweather_italic, FontWeight.Normal),*/
            Font(R.font.merriweather_black, FontWeight.Black),
            /*Font(R.font.merriweather_black_italic, FontWeight.Black),*/
            Font(R.font.merriweather_light, FontWeight.Light),
            /*Font(R.font.merriweather_light_italic, FontWeight.Light),*/
            Font(R.font.merriweather_bold, FontWeight.Bold),
            /*Font(R.font.merriweather_bold_italic, FontWeight.Bold),*/
            /*Font(R.font.bonheur_royale_regular, FontWeight.Normal)*/
        )
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFF101010))
            ) {
                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = Color.Green,
                                fontSize = 50.sp
                            )
                        ) {
                            append("J")
                        }
                        append("etpack")
                        withStyle(
                            style = SpanStyle(
                                color = Color.Green,
                                fontSize = 50.sp
                            )
                        ) {
                            append("C")
                        }
                        append("ompose")
                    },
                    color = Color.White,
                    fontSize = 30.sp,
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Italic,
                    textAlign = TextAlign.Center,
                    textDecoration = TextDecoration.Underline,
                )
            }
        }
    }
}

@Preview(showBackground = true, name = "Light Mode")
@Preview(showBackground = true, name = "Night Mode", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun DefaultPreview() {
    MyApp()
}