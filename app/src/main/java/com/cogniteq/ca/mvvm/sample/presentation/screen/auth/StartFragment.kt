package com.cogniteq.ca.mvvm.sample.presentation.screen.auth

import androidx.appcompat.widget.AppCompatImageView
import butterknife.BindView
import com.cogniteq.ca.mvvm.android.sample.R
import com.cogniteq.ca.mvvm.android.sample.R2
import com.cogniteq.ca.mvvm.sample.presentation.common.BaseFragment
import com.cogniteq.ca.mvvm.sample.presentation.navigation.ScreenNavigator
import com.cogniteq.ca.mvvm.sample.util.NavigatorResource
import com.cogniteq.ca.mvvm.sample.util.getViewModel
import com.cogniteq.ca.mvvm.sample.util.observe

class StartFragment : BaseFragment<StartViewModel>(R.layout.fragment_start) {

    @BindView(R2.id.image_logo)
    lateinit var logoImage: AppCompatImageView

    override val viewModel: StartViewModel by getViewModel()

    override fun prepareViews() {
        openLoginOrInfoScreen()
        observeOpenScreen()
    }

    private fun openLoginOrInfoScreen() = viewModel.openLoginOrInfoScreen()

    private fun observeOpenScreen() {
        viewModel.screenEmitter.observe(viewLifecycleOwner) { screen ->
            when (screen.screen) {
                NavigatorResource.Screen.INFO -> ScreenNavigator.AuthNavigator.openInfoScreen(logoImage)
                else -> ScreenNavigator.AuthNavigator.openLoginScreen(logoImage)
            }
        }
    }
}