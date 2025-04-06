package com.example.sample.screen
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.sample.ui.theme.SampleTheme

@Composable
fun ch() {

    Text(
        text = "ch",
        fontSize =30.sp
    )
}

@Preview(showBackground = true)
@Composable
fun chPreview() {
    SampleTheme {
        ch()
    }
}