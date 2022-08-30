package com.cogniteq.ca.mvvm.sample.util

class NavigatorResource(val screen: Screen) {

    companion object {

        fun info() = NavigatorResource(Screen.INFO)

        fun login() = NavigatorResource(Screen.LOGIN)

        fun registration() = NavigatorResource(Screen.REGISTRATION)
    }

    enum class Screen {
        INFO,
        LOGIN,
        REGISTRATION
    }
}

