package com.cogniteq.ca.mvvm.sample.util

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.cogniteq.ca.mvvm.sample.presentation.common.BaseFragment
import org.koin.android.ext.android.getKoin
import org.koin.androidx.viewmodel.ViewModelParameter
import org.koin.androidx.viewmodel.koin.getViewModel
import org.koin.core.parameter.ParametersDefinition

inline fun <reified T: ViewModel> BaseFragment<T>.getViewModel(): Lazy<T> = lazy {
    getKoin().getViewModel(viewModelParameters = ViewModelParameter(clazz = T::class, viewModelStore = viewModelStore))
}

inline fun <reified T: ViewModel> BaseFragment<T>.getViewModel(noinline parameters: ParametersDefinition? = null): Lazy<T> = lazy {
    getKoin().getViewModel(viewModelParameters = ViewModelParameter(clazz = T::class, viewModelStore = viewModelStore, parameters = parameters))
}

fun <T> LiveData<T>.observe(owner: LifecycleOwner, emmit: (T) -> Unit) {
    this.observe(owner, Observer {
        emmit.invoke(it)
    })
}