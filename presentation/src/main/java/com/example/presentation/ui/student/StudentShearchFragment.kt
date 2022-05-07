package com.example.presentation.ui.student

import android.content.Intent
import android.util.Log
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
        initResult()
    }

    fun goMain(view: View) {
        startActivity(Intent(activity, MainActivity::class.java))
    }

    private fun initResult() {
        mainViewModel.getAllUsers()

        val email = mainViewModel.getAllUsers.value?.get(0)
        val name = mainViewModel.getAllUsers.value?.get(1)
        val grade = mainViewModel.getAllUsers.value?.get(2)

        Log.d("TAG", "email: $email, name: $name, grade: $grade")
    }
}