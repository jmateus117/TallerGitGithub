package me.juanmateus.tallergitgithubapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import me.juanmateus.tallergitgithubapp.ui.theme.TallerGitGitHubAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GitGithub(){
    Card() {
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier =Modifier.fillMaxSize()) {
            val painter = painterResource(id = R.drawable.fotodeperfil)
            val contentDescription = "Mi foto de perfil"
            Image(painter = painter,
                contentDescription = contentDescription, modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape))
            Text(text = "Juan David Mateus Poveda",
                fontWeight = FontWeight.Bold)
            Text(text = "18 años")
            Text(text = "Ingeniero de Sistemas")

        }
    }
}

