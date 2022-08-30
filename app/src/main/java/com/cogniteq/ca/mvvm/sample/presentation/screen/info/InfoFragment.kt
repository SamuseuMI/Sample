package com.cogniteq.ca.mvvm.sample.presentation.screen.info

import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView
import butterknife.BindView
import butterknife.OnClick
import com.cogniteq.ca.mvvm.android.sample.R
import com.cogniteq.ca.mvvm.android.sample.R2
import com.cogniteq.ca.mvvm.sample.presentation.common.BaseFragment
import com.cogniteq.ca.mvvm.sample.util.getViewModel
import com.cogniteq.ca.mvvm.sample.util.observe

class InfoFragment : BaseFragment<InfoViewModel>(R.layout.fragment_info) {

    @BindView(R2.id.view_input_text)
    lateinit var inputTextView: AppCompatEditText

    @BindView(R2.id.view_text_info)
    lateinit var textInfoView: AppCompatTextView

    override val viewModel: InfoViewModel by getViewModel()

    override fun prepareViews() {
        viewModel.onViewPrepared()
        observeLastUpdateInfo()
    }

    @OnClick(R.id.btn_update_info)
    fun onUpdateClick() {
        viewModel.updateData(inputTextView.text.toString())
    }

    private fun observeLastUpdateInfo() {
        viewModel.infoEmitter.observe(viewLifecycleOwner) { result ->
            textInfoView.text = result
        }
    }
}