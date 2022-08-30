package com.cogniteq.ca.mvvm.sample.domain.interactor.info

import com.cogniteq.ca.mvvm.sample.data.repository.info.InfoRepository
import com.cogniteq.ca.mvvm.sample.data.sql.model.InfoEntity
import com.cogniteq.ca.mvvm.sample.domain.BaseInteractor
import com.cogniteq.ca.mvvm.sample.domain.InteractorResult
import com.cogniteq.ca.mvvm.sample.domain.interactor.DateUtils
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class SaveDataInteractor(private val infoRepository: InfoRepository) : BaseInteractor<SaveDataInteractor.Param, Boolean>() {

    override fun invoke(coroutineScope: CoroutineScope, param: Param, result: (InteractorResult<Boolean>) -> Unit) {
        coroutineScope.launch {
            result.invoke(withContext<InteractorResult<Boolean>>(coroutineContext) {
                return@withContext try {
                    val info = InfoEntity(param.info, DateUtils.getCurrentDate())
                    if (infoRepository.getAllData().isNotEmpty()) {
                        infoRepository.update(info)
                    } else {
                        infoRepository.save(info)
                    }

                    InteractorResult.Result(true)
                } catch (exception: Exception) {
                    InteractorResult.Failure(exception)
                }
            })
        }
    }

    data class Param(val info: String)
}