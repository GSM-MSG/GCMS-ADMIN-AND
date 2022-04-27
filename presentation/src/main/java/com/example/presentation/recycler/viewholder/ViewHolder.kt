package com.example.presentation.recycler.viewholder

import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.data.remote.dto.request.BasicInfoRequest
import com.example.presentation.databinding.ItemLayoutBinding
import com.google.android.material.snackbar.Snackbar

class ViewHolder(private val binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(data: BasicInfoRequest) {
        binding.run {
            userName.text = data.name
            userNumber.text = data.student_ID

            modifyBtn.setOnClickListener {
                Snackbar.make(it, "이름: ${data.name}", Snackbar.LENGTH_SHORT).show()
            }
        }
    }
}