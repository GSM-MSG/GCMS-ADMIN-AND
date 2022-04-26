package com.example.presentation.recycler.callback

import androidx.recyclerview.widget.DiffUtil
import com.example.data.remote.dto.request.BasicInfoRequest

class DiffCallback : DiffUtil.ItemCallback<BasicInfoRequest>() {
    override fun areItemsTheSame(oldItem: BasicInfoRequest, newItem: BasicInfoRequest): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: BasicInfoRequest, newItem: BasicInfoRequest): Boolean {
        return oldItem == newItem
    }
}