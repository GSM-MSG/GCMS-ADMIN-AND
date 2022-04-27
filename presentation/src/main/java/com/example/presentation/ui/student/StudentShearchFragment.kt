package com.example.presentation.ui.student

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.data.remote.dto.request.BasicInfoRequest
import com.example.presentation.R
import com.example.presentation.base.BaseFragment
import com.example.presentation.databinding.FragmentStudentShearchBinding
import com.example.presentation.recycler.adapter.RecyclerViewAdapter

class StudentShearchFragment : BaseFragment<FragmentStudentShearchBinding>(R.layout.fragment_student_shearch) {

    private val dataSet = arrayListOf<BasicInfoRequest>().apply {
        add(BasicInfoRequest("김현승", "2208"))
        add(BasicInfoRequest("강민제", "2202"))
        add(BasicInfoRequest("오종진", "2404"))
        add(BasicInfoRequest("노혁", "2405"))
        add(BasicInfoRequest("진시윤", "2406"))
        add(BasicInfoRequest("문송", "2408"))
        add(BasicInfoRequest("김현승", "2208"))
        add(BasicInfoRequest("강민제", "2202"))
        add(BasicInfoRequest("오종진", "2404"))
        add(BasicInfoRequest("노혁", "2405"))
        add(BasicInfoRequest("진시윤", "2406"))
        add(BasicInfoRequest("문송", "2408"))
        add(BasicInfoRequest("김현승", "2208"))
        add(BasicInfoRequest("강민제", "2202"))
        add(BasicInfoRequest("오종진", "2404"))
        add(BasicInfoRequest("노혁", "2405"))
        add(BasicInfoRequest("진시윤", "2406"))
        add(BasicInfoRequest("문송", "2408"))
    }

    private val recyclerViewAdapter: RecyclerViewAdapter by lazy {
        RecyclerViewAdapter()
    }

    override fun init() {
        binding.fragment = this

        binding.rv.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
            adapter = recyclerViewAdapter
        }
        recyclerViewAdapter.submitList(dataSet)
    }
}