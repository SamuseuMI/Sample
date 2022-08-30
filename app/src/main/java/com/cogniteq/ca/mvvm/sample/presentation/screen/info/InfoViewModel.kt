package com.cogniteq.ca.mvvm.sample.presentation.screen.info

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.viewModelScope
import com.cogniteq.ca.mvvm.sample.domain.interactor.info.GetLastUpdateInteractor
import com.cogniteq.ca.mvvm.sample.domain.interactor.info.SaveDataInteractor
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import timber.log.Timber

class InfoViewModel(application: Application, private val saveDataInteractorKotlinImpl: SaveDataInteractor, private val getLastUpdateFlowInteractor: GetLastUpdateInteractor) : AndroidViewModel(application) {

    private val _infoEmitter: MediatorLiveData<String> = MediatorLiveData()

    val infoEmitter: LiveData<String> = _infoEmitter

    fun onViewPrepared() {
        viewModelScope.launch {
            getLastUpdateFlowInteractor.execute()
                    .collect { data ->
                        _infoEmitter.value = data
                    }
        }
    }

    fun updateData(newData: String) {
        saveDataInteractorKotlinImpl.invoke(viewModelScope, SaveDataInteractor.Param(newData)) {
            it.getResult({
            }, { exception ->
                Timber.e(exception)
            })
        }
    }
}