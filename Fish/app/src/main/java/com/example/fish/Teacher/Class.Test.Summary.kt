package com.example.fish.Teacher

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.example.fish.Model.Back
import com.example.fish.ui.theme.DisplayUI

@Composable
fun SummaryTestView(nav : NavController , view : DisplayUI)
{
    Back(nav = nav, view = view , "TestResult")
    Text(text = "Perry The Platypus")
}