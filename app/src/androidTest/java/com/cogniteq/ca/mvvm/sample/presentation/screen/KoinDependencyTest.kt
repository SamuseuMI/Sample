package com.cogniteq.ca.mvvm.sample.presentation.screen

import org.junit.Test
import org.koin.java.KoinJavaComponent.getKoin
import org.koin.test.check.checkModules

class KoinDependencyTest {

    @Test
    fun checkDependencyGraph() {
        getKoin().checkModules()
    }
}