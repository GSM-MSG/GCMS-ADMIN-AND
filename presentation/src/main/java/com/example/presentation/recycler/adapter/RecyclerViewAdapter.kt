package com.example.presentation.recycler.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.data.remote.dto.request.BasicInfoRequest
import com.example.presentation.databinding.ItemLayoutBinding
import com.example.presentation.recycler.callback.DiffCallback
import com.example.presentation.recycler.viewholder.ViewHolder

class RecyclerViewAdapter : ListAdapter<BasicInfoRequest, RecyclerView.ViewHolder>(DiffCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val viewHolder = ViewHolder(
            ItemLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
        return viewHolder
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is ViewHolder) {
            val student = getItem(position) as BasicInfoRequest
            holder.bind(student)
        }
    }
}