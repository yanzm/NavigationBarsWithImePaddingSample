package net.yanzm.navigationbarswithimepaddingsample

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ListItem
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.ui.Modifier

class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterialApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Column {
                    ListItem(
                        modifier = Modifier.clickable {
                            startActivity(
                                Intent(
                                    this@MainActivity,
                                    BoxActivity::class.java
                                )
                            )
                        }
                    ) {
                        Text("BoxActivity")
                    }
                    ListItem(
                        modifier = Modifier.clickable {
                            startActivity(
                                Intent(
                                    this@MainActivity,
                                    BoxActivity2::class.java
                                )
                            )
                        }
                    ) {
                        Text("BoxActivity2")
                    }
                    ListItem(
                        modifier = Modifier.clickable {
                            startActivity(
                                Intent(
                                    this@MainActivity,
                                    BoxWithConstraintsActivity::class.java
                                )
                            )
                        }
                    ) {
                        Text("BoxWithConstraintsActivity")
                    }
                    ListItem(
                        modifier = Modifier.clickable {
                            startActivity(
                                Intent(
                                    this@MainActivity,
                                    BoxWithConstraintsActivity2::class.java
                                )
                            )
                        }
                    ) {
                        Text("BoxWithConstraintsActivity2")
                    }
                }
            }
        }
    }
}
