package com.example.presentation.ui.student

import android.content.Intent
import android.view.View
import androidx.fragment.app.activityViewModels
import com.example.presentation.R
import com.example.presentation.base.BaseFragment
import com.example.presentation.databinding.FragmentStudentShearchBinding
import com.example.presentation.ui.main.MainActivity
import com.example.presentation.viewmodel.MainViewModel

class StudentShearchFragment :
    BaseFragment<FragmentStudentShearchBinding>(R.layout.fragment_student_shearch) {

    private val mainViewModel by activityViewModels<MainViewModel>()

    override fun init() {
        binding.fragment = this

    }

    fun goMain(view: View) {
        startActivity(Intent(activity, MainActivity::class.java))
    }

    private fun initResult() {

    }
}