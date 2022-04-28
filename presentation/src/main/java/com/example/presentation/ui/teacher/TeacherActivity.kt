package com.example.presentation.ui.teacher

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.presentation.R
import com.example.presentation.base.BaseActivity
import com.example.presentation.databinding.ActivityTeacherBinding
import com.example.presentation.ui.main.MainActivity

class TeacherActivity : BaseActivity<ActivityTeacherBinding>(R.layout.activity_teacher) {
    override fun init() {

    }

    fun goMain(view: View) {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}