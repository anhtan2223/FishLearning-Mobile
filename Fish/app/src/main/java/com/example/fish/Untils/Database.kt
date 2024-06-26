package com.example.fish.Untils

import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class MyDB(){
    companion object{
        private val url_Default = "https://fishlearning-ce8e9-default-rtdb.asia-southeast1.firebasedatabase.app/"
        val database = Firebase.database(url_Default)
        val user        = database.getReference("User")
        val role        = database.getReference("Role")
        val label       = database.getReference("Label")
        val classInfo   = database.getReference("Class")
        val topic       = database.getReference("Topic")
        val enrollment  = database.getReference("Enrollment")
        val text        = database.getReference("TextBox")
        val document    = database.getReference("Document")
        val test        = database.getReference("DetailTest")
        val question    = database.getReference("Question")
        val answer      = database.getReference("Answer")
        val testResult  = database.getReference("TestResult")
    }
}