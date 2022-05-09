package com.example.presentation.ui.student

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.View
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.domain.dto.datasource.user.response.DomainUserInfo
import com.example.presentation.R
import com.example.presentation.adapter.GetAllUsersRecyclerAdapter
import com.example.presentation.base.BaseFragment
import com.example.presentation.databinding.FragmentStudentShearchBinding
import com.example.presentation.ui.main.MainActivity
import com.example.presentation.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StudentShearchFragment :
    BaseFragment<FragmentStudentShearchBinding>(R.layout.fragment_student_shearch) {

    private val mainViewModel by activityViewModels<MainViewModel>()
    private lateinit var fcontext : Context

    override fun onAttach(context: Context) {
        super.onAttach(context)
        fcontext = context
    }

    override fun init() {
        observe()
        binding.fragment = this
        mainViewModel.getAllUsers()
    }

    fun goMain(view: View) {
        startActivity(Intent(activity, MainActivity::class.java))
    }

    private fun observe() {
        mainViewModel.getAllUsers.observe(this, Observer {
            setAdapter(it)
        })
    }

    private fun setAdapter(list: List<DomainUserInfo>) {
        val adapter = GetAllUsersRecyclerAdapter(list, fcontext)
        binding.rv.adapter = adapter
        binding.rv.layoutManager = LinearLayoutManager(fcontext)
    }
}