package com.cogniteq.ca.mvvm.sample.presentation.navigation

import android.view.View
import androidx.navigation.Navigation
import com.cogniteq.ca.mvvm.sample.presentation.screen.auth.StartFragmentDirections
import com.cogniteq.ca.mvvm.sample.presentation.screen.login.LoginFragmentDirections

class ScreenNavigator {

    object AuthNavigator {

        fun navigateUp(view: View) = Navigation.findNavController(view).navigateUp()

        fun openLoginScreen(view: View) {
            val navDirections = StartFragmentDirections.actionOpenLoginScreen()
            val navController = Navigation.findNavController(view)
            navController.navigate(navDirections)
        }

        fun openRegistrationScreen(view: View) {
            val navDirections = LoginFragmentDirections.actionOpenRegistrationScreen()
            val navController = Navigation.findNavController(view)
            navController.navigate(navDirections)
        }

        fun openInfoScreen(view: View) {
            val navDirections = StartFragmentDirections.actionOpenInfoScreen()
            val navController = Navigation.findNavController(view)
            navController.navigate(navDirections)
        }

        fun openInfoScreenAfterLogin(view: View) {
            val navDirections = LoginFragmentDirections.actionOpenInfoScreen()
            val navController = Navigation.findNavController(view)
            navController.navigate(navDirections)
        }
    }
}