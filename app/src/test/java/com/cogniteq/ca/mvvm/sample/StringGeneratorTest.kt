package com.cogniteq.ca.mvvm.sample

import com.cogniteq.ca.mvvm.sample.util.StringGenerator
import org.junit.Assert
import org.junit.Test

class StringGeneratorTest {

    @Test
    fun generateRandomString_isNotNull() {
        val randomValue = StringGenerator.generateRandomString()
        Assert.assertNotNull(randomValue)
    }
}