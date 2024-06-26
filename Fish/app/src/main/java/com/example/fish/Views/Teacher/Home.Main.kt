package com.example.fish.Views.Teacher

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.fish.Untils.Back
import com.example.fish.Untils.goTo
import com.example.fish.Views.Student.OneClass
import com.example.fish.ui.theme.DisplayUI

@Composable
fun TeacherHomeScreen( nav: NavController, view : DisplayUI)
{
    val listClass = view.myClass
    Back(nav = nav, view = view , goTo = "Account")
    LazyColumn()
    {
        items(listClass){
            OneClass(info = it) {
                goTo(nav, view, "DetailClass")
                view.selectClass(it)
            }
        }
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp) ,
        contentAlignment = Alignment.BottomEnd
    ){
        FloatingActionButton(
            shape = CircleShape,
            onClick = { goTo(nav , view , "NewClass" ) }
        )
        {
            Icon(imageVector = Icons.Filled.Add, contentDescription = null)
        }
    }
}