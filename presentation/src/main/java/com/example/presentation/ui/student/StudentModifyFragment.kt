package com.example.presentation.ui.student

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.presentation.R
import com.example.presentation.base.BaseFragment
import com.example.presentation.databinding.FragmentStudentModifyBinding


class StudentModifyFragment : BaseFragment<FragmentStudentModifyBinding>(R.layout.fragment_student_modify) {
    override fun init() {
        binding.fragment = this
    }
}