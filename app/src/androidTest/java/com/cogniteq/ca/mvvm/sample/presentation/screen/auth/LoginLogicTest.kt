package com.cogniteq.ca.mvvm.sample.presentation.screen.auth

import android.view.View
import android.view.ViewGroup
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.filters.LargeTest
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.rule.ActivityTestRule
import com.cogniteq.ca.mvvm.android.sample.R
import com.cogniteq.ca.mvvm.sample.presentation.screen.MockConstants
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.Matchers.allOf
import org.hamcrest.TypeSafeMatcher
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4ClassRunner::class)
class LoginLogicTest {

    @JvmField
    @Rule
    val mActivityTestRule: ActivityTestRule<StartActivity> = ActivityTestRule(StartActivity::class.java)

    @Test
    fun loginLogicTest() {
        val appCompatTextView = onView(
                allOf(withId(R.id.view_sign_up), withText(MockConstants.SIGN_UP_BTN),
                        childAtPosition(
                                allOf(withId(R.id.relativeLayout),
                                        childAtPosition(withId(R.id.auth_container),
                                                0)),
                                3),
                        isDisplayed()))
        appCompatTextView.perform(click())

        val textInputEditText = onView(
                allOf(withId(R.id.view_full_name),
                        childAtPosition(
                                childAtPosition(withId(R.id.full_name), 0), 0), isDisplayed()))
        textInputEditText.perform(replaceText(MockConstants.USER_NAME), closeSoftKeyboard())

        val textInputEditText2 = onView(
                allOf(withId(R.id.view_email_address),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.email_address),
                                        0),
                                0),
                        isDisplayed()))
        textInputEditText2.perform(replaceText(MockConstants.EMAIL), closeSoftKeyboard())

        val textInputEditText3 = onView(
                allOf(withId(R.id.view_password),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.password),
                                        0),
                                0),
                        isDisplayed()))
        textInputEditText3.perform(replaceText(MockConstants.PASSWORD), closeSoftKeyboard())

        val appCompatButton = onView(
                allOf(withId(R.id.btn_success),
                        childAtPosition(
                                allOf(withId(R.id.relativeLayout),
                                        childAtPosition(
                                                withId(R.id.auth_container),
                                                0)),
                                4),
                        isDisplayed()))
        appCompatButton.perform(click())

        val textInputEditText4 = onView(
                allOf(withId(R.id.view_email_address),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.email_address),
                                        0),
                                0),
                        isDisplayed()))
        textInputEditText4.perform(replaceText(MockConstants.EMAIL), closeSoftKeyboard())

        val textInputEditText5 = onView(
                allOf(withId(R.id.view_password),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.password),
                                        0),
                                0),
                        isDisplayed()))
        textInputEditText5.perform(replaceText(MockConstants.PASSWORD), closeSoftKeyboard())

        val appCompatButton2 = onView(
                allOf(withId(R.id.btn_success),
                        childAtPosition(
                                allOf(withId(R.id.relativeLayout),
                                        childAtPosition(
                                                withId(R.id.auth_container),
                                                0)),
                                4),
                        isDisplayed()))
        appCompatButton2.perform(click())
    }

    private fun childAtPosition(parentMatcher: Matcher<View>, position: Int): Matcher<View> {
        return object : TypeSafeMatcher<View>() {
            override fun describeTo(description: Description?) {
                description?.appendText("Child at position $position in parent")
                parentMatcher.describeTo(description)
            }

            override fun matchesSafely(item: View?): Boolean {
                val parent = item?.parent
                return parent is ViewGroup && parentMatcher.matches(parent) && item == parent.getChildAt(position)
            }
        }
    }
}