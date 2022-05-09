package com.example.presentation.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.example.domain.dto.datasource.user.response.DomainUserInfo
import com.example.presentation.R

class GetAllUsersRecyclerAdapter(val postList: List<DomainUserInfo>, val context: Context) :
    RecyclerView.Adapter<GetAllUsersRecyclerAdapter.ViewHolder>() {

    class ViewHolder (itemView: View?) : RecyclerView.ViewHolder(itemView!!) {

        val name = itemView?.findViewById<TextView>(R.id.item_student_name)
        val num = itemView?.findViewById<TextView>(R.id.item_student_number)

        fun bind(item: DomainUserInfo?, context: Context) {
            name?.text = item?.name
            num?.text = item?.grade.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return GetAllUsersRecyclerAdapter.ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.student_item_layout, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(postList[position],context)
    }

    override fun getItemCount(): Int {
        return postList.count()
    }
}