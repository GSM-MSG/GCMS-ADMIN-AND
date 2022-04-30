package com.example.presentation.ui.club

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.presentation.R
import com.example.presentation.base.BaseFragment
import com.example.presentation.databinding.FragmentClubSearchBinding
import com.example.presentation.ui.main.MainActivity

class ClubSearchFragment : BaseFragment<FragmentClubSearchBinding>(R.layout.fragment_club_search) {
    override fun init() {
        binding.fragment = this
    }

    fun goMain(view: View) {
        startActivity(Intent(activity, MainActivity::class.java))
    }
}