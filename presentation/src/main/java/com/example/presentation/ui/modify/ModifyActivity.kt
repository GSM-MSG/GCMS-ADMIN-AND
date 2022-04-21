package com.example.presentation.ui.modify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.presentation.R
import com.example.presentation.base.BaseActivity
import com.example.presentation.databinding.ActivityModifyBinding

class ModifyActivity : BaseActivity<ActivityModifyBinding>(R.layout.activity_modify) {
    override fun init() {
        binding.activity = this
    }
}