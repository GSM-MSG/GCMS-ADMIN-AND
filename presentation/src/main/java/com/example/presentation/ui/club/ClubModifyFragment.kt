package com.example.presentation.ui.club

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.presentation.R
import com.example.presentation.base.BaseFragment
import com.example.presentation.databinding.FragmentClubModifyBinding


class ClubModifyFragment : BaseFragment<FragmentClubModifyBinding>(R.layout.fragment_club_modify) {
    override fun init() {
        binding.fragment = this
    }
}