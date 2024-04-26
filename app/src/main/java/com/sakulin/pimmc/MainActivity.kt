package com.sakulin.pimmc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.sakulin.pimmc.ui.theme.PiMagicMirrorConnectorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PiMagicMirrorConnectorTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ConstraintLayout {
                        Text(
                            "Pi Magic Mirror Connector",
                            modifier = Modifier.constrainAs(createRef()) {
                                top.linkTo(parent.top)
                                bottom.linkTo(parent.bottom)
                                start.linkTo(parent.start)
                                end.linkTo(parent.end)
                            },
                            fontSize = 32.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
    }
}