package com.example.presentation.ui.club

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.presentation.R
import com.example.presentation.base.BaseFragment
import com.example.presentation.databinding.FragmentClubStudentAddBinding


class ClubStudentAddFragment : BaseFragment<FragmentClubStudentAddBinding>(R.layout.fragment_club_student_add) {
    override fun init() {
        binding.fragment = this
    }
}