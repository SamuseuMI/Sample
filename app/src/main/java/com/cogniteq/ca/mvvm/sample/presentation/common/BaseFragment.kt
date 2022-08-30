package com.cogniteq.ca.mvvm.sample.presentation.common

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import butterknife.ButterKnife
import butterknife.Unbinder

abstract class BaseFragment<VM>(@LayoutRes val layoutId: Int) : Fragment() {

    private lateinit var unbinder: Unbinder

    abstract val viewModel: VM

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        attachViewModel()
        prepareViews()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(layoutId, container, false)
        unbinder = ButterKnife.bind(this, view)
        return view
    }

    override fun onDestroyView() {
        if (::unbinder.isInitialized) {
            unbinder.unbind()
        }
        super.onDestroyView()
    }

    protected fun showToast(message: String) {
        val baseActivity = activity
        if (baseActivity is BaseActivity) {
            baseActivity.showToast(message)
        }
    }

    /**
     * Attach a ViewModel to a View.
     * You have to extract arguments from Bundle here.
     */
    protected open fun attachViewModel() {}

    /**
     * You should attach all UI observables, Toolbar configuration here.
     * This method will be invoked after a ViewModel is attached.
     */
    protected open fun prepareViews() {}
}