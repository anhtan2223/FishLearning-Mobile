package com.example.fish.Admin

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.fish.Model.Back
import com.example.fish.Model.User
import com.example.fish.Model.goTo
import com.example.fish.Student.ButtonNav
import com.example.fish.Student.OneLineChange
import com.example.fish.ui.theme.DisplayUI

@Composable
fun DetaiUserView(nav:NavController , view:DisplayUI)
{
    Back(nav = nav, view = view , "User")
    Column(
        modifier = Modifier.fillMaxSize() ,
        verticalArrangement = Arrangement.Center ,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ChangeUser(info = view.nowUser)
        ButtonNav(onClick = { goTo(nav ,view , "User") }, content = "Xác Nhận" , color = Color(0xFF00FC46) )
        ButtonNav(onClick = { /*TODO*/ }, content = "Khoá Tài Khoản" , color = Color(0xFFDC0F0F) , contentColor = Color.White)
    }
}
@Composable
fun ChangeUser(info : User)
{
    Card(
        modifier = Modifier
            .padding(15.dp)
            .wrapContentWidth(Alignment.CenterHorizontally) )
    {
        Spacer(modifier = Modifier.padding(top = 25.dp))
        Text(
            text = "Thông Tin Người Dùng" ,
            style = MaterialTheme.typography.titleSmall ,
            fontSize = 30.sp,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.padding(top = 15.dp))
        OneLineChange(title = "Tên", content = info.Name , false)
        OneLineChange(title = "Email", content = info.Email , false)
        OneLineChange(title = "Tài Khoản", content = info.Username , true)
        OneLineChange(title = "Mật Khẩu", content = "Cấp Mật Khẩu Mới", readOnly = false)
        Spacer(modifier = Modifier.padding(bottom = 20.dp))
    }
}