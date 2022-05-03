package com.example.presentation.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.presentation.R
import com.example.presentation.base.BaseActivity
import com.example.presentation.databinding.ActivityMainBinding
import com.example.presentation.ui.club.ClubActivity
import com.example.presentation.ui.student.StudentActivity
import com.example.presentation.ui.teacher.TeacherActivity

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    override fun init() {
        binding.activity = this
    }

    fun goClub(view: View){
        startActivity(Intent(this, ClubActivity::class.java))
        finish()
    }

    fun goStudent(view: View){
        startActivity(Intent(this,StudentActivity::class.java))
        finish()
    }

    fun goTeacher(view: View) {
        startActivity(Intent(this, TeacherActivity::class.java))
        finish()
    }
}