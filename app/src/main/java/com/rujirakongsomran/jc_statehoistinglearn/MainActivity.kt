package com.rujirakongsomran.jc_statehoistinglearn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.rujirakongsomran.jc_statehoistinglearn.ui.theme.JC_StateHoistingLearnTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JC_StateHoistingLearnTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun Topic(
    modifier: Modifier = Modifier,
    icon: Int,
    title: String,
    onTopicClicked: () -> Unit
) {
    Row(
        modifier = modifier.clickable(
            onClick = onTopicClicked
        )
    ) {
        Icon(
            painter = painterResource(icon),
            contentDescription = null
        )
        Text(text = title)
    }
}

