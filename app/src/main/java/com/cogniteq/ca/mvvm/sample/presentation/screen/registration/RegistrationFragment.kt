package com.cogniteq.ca.mvvm.sample.presentation.screen.registration

import butterknife.BindView
import butterknife.OnClick
import com.cogniteq.ca.mvvm.android.sample.R
import com.cogniteq.ca.mvvm.android.sample.R2
import com.cogniteq.ca.mvvm.sample.presentation.common.BaseFragment
import com.cogniteq.ca.mvvm.sample.presentation.navigation.ScreenNavigator
import com.cogniteq.ca.mvvm.sample.util.getViewModel
import com.cogniteq.ca.mvvm.sample.util.observe
import com.google.android.material.textfield.TextInputEditText

class RegistrationFragment : BaseFragment<RegistrationViewModel>(R.layout.fragment_registration) {

    @BindView(R2.id.view_full_name)
    lateinit var fullNameView: TextInputEditText

    @BindView(R2.id.view_email_address)
    lateinit var emailAddressView: TextInputEditText

    @BindView(R2.id.view_password)
    lateinit var passwordView: TextInputEditText

     override val viewModel: RegistrationViewModel by getViewModel()

    override fun attachViewModel() {
        viewModel.navigateUp.observe(viewLifecycleOwner) {
            ScreenNavigator.AuthNavigator.navigateUp(fullNameView)
        }

        viewModel.showMessage.observe(viewLifecycleOwner) {
            showToast(getString(it))
        }
    }

    @OnClick(R.id.btn_success)
    fun onRegistrationClick() = viewModel.saveAuthData(emailAddressView.text.toString(), passwordView.text.toString())
}