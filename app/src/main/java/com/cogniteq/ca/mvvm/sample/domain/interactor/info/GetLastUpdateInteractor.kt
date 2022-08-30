package com.cogniteq.ca.mvvm.sample.domain.interactor.info

import com.cogniteq.ca.mvvm.sample.data.repository.info.InfoRepository
import com.cogniteq.ca.mvvm.sample.domain.BaseFlowInteractor
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.transform
import kotlinx.coroutines.flow.transformLatest

class GetLastUpdateInteractor(private val infoRepository: InfoRepository) : BaseFlowInteractor<String>() {

    override suspend fun execute(): Flow<String> {
        return infoRepository.getAll().transformLatest {
            if (it.isNotEmpty()) {
                emit(it[0].lastUpdateDate)
            }else{
                emit("")
            }
        }
    }
}