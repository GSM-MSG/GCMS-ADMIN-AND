package com.example.presentation.recycler.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.data.remote.dto.request.BasicInfoRequest
import com.example.presentation.recycler.callback.DiffCallback

class RecyclerViewAdapter : ListAdapter<BasicInfoRequest, RecyclerView.ViewHolder>(DiffCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }
}