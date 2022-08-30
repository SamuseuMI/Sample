package com.cogniteq.ca.mvvm.sample.presentation.screen.login

import butterknife.BindView
import butterknife.OnClick
import com.cogniteq.ca.mvvm.android.sample.R
import com.cogniteq.ca.mvvm.android.sample.R2
import com.cogniteq.ca.mvvm.sample.presentation.common.BaseFragment
import com.cogniteq.ca.mvvm.sample.presentation.navigation.ScreenNavigator
import com.cogniteq.ca.mvvm.sample.util.NavigatorResource
import com.cogniteq.ca.mvvm.sample.util.getViewModel
import com.cogniteq.ca.mvvm.sample.util.observe
import com.google.android.material.textfield.TextInputEditText

class LoginFragment : BaseFragment<LoginViewModel>(R.layout.fragment_login) {

    @BindView(R2.id.view_email_address)
    lateinit var emailAddressView: TextInputEditText

    @BindView(R2.id.view_password)
    lateinit var passwordView: TextInputEditText

    override val viewModel: LoginViewModel by getViewModel()

    override fun prepareViews() {
        super.prepareViews()
        observeOpenScreen()
        observeMessage()
    }

    @OnClick(R.id.btn_success)
    fun onLoginClick() = viewModel.login(emailAddressView.text.toString(), passwordView.text.toString())

    @OnClick(R.id.view_sign_up)
    fun onSignUpClick() = viewModel.onSignUpClick()

    private fun observeOpenScreen() {
        viewModel.screenEmitter.observe(viewLifecycleOwner) { screen ->
            when (screen.screen) {
                NavigatorResource.Screen.INFO -> ScreenNavigator.AuthNavigator.openInfoScreenAfterLogin(emailAddressView)
                else -> ScreenNavigator.AuthNavigator.openRegistrationScreen(emailAddressView)
            }
        }
    }

    private fun observeMessage() {
        viewModel.messageEmitter.observe(viewLifecycleOwner) {
            showToast(it)
        }
    }
}