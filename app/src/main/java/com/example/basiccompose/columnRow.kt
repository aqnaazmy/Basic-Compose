package com.example.basiccompose

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.basiccompose.ui.theme.BasicComposeTheme

@Composable
fun MainClmRow(modifier: Modifier = Modifier) {
    Column (modifier = Modifier.padding(15.dp)){
        Column (
            modifier = Modifier
                .border(width = 2.dp, color = Color.Red)
                .fillMaxWidth()
                .height(200.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "Hallo")
            Text(text = "Mobile")
        }
        Spacer(modifier = Modifier.padding(10.dp))
        Row (
            modifier = Modifier
                .border(width = 2.dp, color = Color.Blue)
                .fillMaxWidth()
                .height(200.dp),
            horizontalArrangement = Arrangement.Center
        ){
            Text(text = "Hallo",
                modifier = Modifier.align(Alignment.CenterVertically))
            Text(text = " Mobile",
                modifier = Modifier.align(Alignment.CenterVertically))

        }
    }

}

@Preview(showBackground = true)
@Composable
fun MainClmRowPreview() {
    BasicComposeTheme{
        MainClmRow()

    }
}