package com.example.presentation.ui.student

import android.content.Intent
import android.view.View
import com.example.presentation.R
import com.example.presentation.base.BaseFragment
import com.example.presentation.databinding.FragmentStudentShearchBinding
import com.example.presentation.ui.main.MainActivity

class StudentShearchFragment : BaseFragment<FragmentStudentShearchBinding>(R.layout.fragment_student_shearch) {
    override fun init() {
        binding.fragment = this
    }

    fun goMain(view: View) {
        startActivity(Intent(activity, MainActivity::class.java))
    }
}