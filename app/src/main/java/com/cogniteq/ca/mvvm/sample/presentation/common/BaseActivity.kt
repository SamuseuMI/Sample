package com.cogniteq.ca.mvvm.sample.presentation.common

import android.os.Bundle
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import butterknife.ButterKnife

abstract class BaseActivity(@LayoutRes protected val layoutId: Int) : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId)
        ButterKnife.bind(this)

        attachViewModel()
    }

    fun showToast(message: String) = Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

    protected open fun attachViewModel() { }
}