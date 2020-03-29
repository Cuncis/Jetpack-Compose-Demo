package com.example.jetpackcomposeexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.view.MenuItem
import android.widget.Toast
import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.core.setContent
import androidx.ui.graphics.Color
import androidx.ui.layout.Center
import androidx.ui.layout.Column
import androidx.ui.layout.FlexColumn
import androidx.ui.material.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { contentView("Karang Reksa Ginolla") }
    }

    @Composable
    private fun contentView(message: String) =
            MaterialTheme {
                FlexColumn {
                    inflexible {
                        TopAppBar<MenuItem> (
                                title = { Text("Belajar") },
                                color = Color.White
                        )
                    }
                    Center {
                        Column {
                            Center { Text("Welcome!") }
                            Center {
                                Button(
                                        text = "Submit",
                                        onClick = {
                                            Toast.makeText(this@MainActivity, message, Toast.LENGTH_SHORT).show()
                                        },
                                        style = ContainedButtonStyle(color = Color.Gray)
                                )
                            }
                        }
                    }
                }
            }
}
