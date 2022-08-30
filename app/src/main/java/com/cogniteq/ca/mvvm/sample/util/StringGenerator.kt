package com.cogniteq.ca.mvvm.sample.util

import java.util.*

class StringGenerator {

    companion object {

        private const val STRING_LENGTH = 16
        private const val LOWER_BORDER = 32
        private const val CHAR_RANGE = 96

        @JvmStatic
        fun generateRandomString(): String {
            val builder = StringBuilder()
            for (i in 0..(Random().nextInt(STRING_LENGTH))) {
                builder.append((Random().nextInt(CHAR_RANGE) + LOWER_BORDER).toChar())
            }
            return builder.toString()
        }
    }
}