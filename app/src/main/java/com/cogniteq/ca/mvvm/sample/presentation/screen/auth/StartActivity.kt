package com.cogniteq.ca.mvvm.sample.presentation.screen.auth

import androidx.lifecycle.ViewModelProvider
import com.cogniteq.ca.mvvm.android.sample.R
import com.cogniteq.ca.mvvm.sample.presentation.common.BaseActivity
import com.cogniteq.ca.mvvm.sample.presentation.screen.info.InfoFragment

class StartActivity : BaseActivity(R.layout.activity_start) {

    override fun onBackPressed() {
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.auth_container)

        if (navHostFragment == null) {
            super.onBackPressed()
            return
        }

        val fragments = navHostFragment.childFragmentManager.fragments

        if (fragments.isNotEmpty() && fragments[0] is InfoFragment) {
            this.finish()
        } else {
            super.onBackPressed()
        }
    }
}