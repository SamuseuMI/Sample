package com.cogniteq.ca.mvvm.sample.domain.interactor

import timber.log.Timber
import java.text.SimpleDateFormat
import java.util.*

object DateUtils {

    private const val CLIENT_DATE_PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"

    fun getCurrentDate(): String = SimpleDateFormat(CLIENT_DATE_PATTERN, Locale.getDefault()).format(Date())

    fun getDiffDateToSecond(lastUpdateDate: String): Long {
        return try {
            val lastTime = SimpleDateFormat(CLIENT_DATE_PATTERN, Locale.getDefault()).parse(lastUpdateDate)
                    ?: Date()
            (System.currentTimeMillis() - lastTime.time) / 1000
        } catch (exception: Exception) {
            Timber.e(exception)
            0
        }
    }
}