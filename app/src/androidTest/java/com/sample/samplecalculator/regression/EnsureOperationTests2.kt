@file:Suppress("DEPRECATION")

package com.sample.samplecalculator.regression

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.filters.MediumTest
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import com.sample.samplecalculator.MainActivity
import com.sample.samplecalculator.R
import com.sample.samplecalculator.utils.RegressionTest
import com.sample.samplecalculator.utils.SmokeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@MediumTest
@RunWith(AndroidJUnit4::class)
class EnsureOperationTests2 {
    @get:Rule
    var activityTestRule
            = ActivityTestRule(MainActivity::class.java)

    @Test
    @RegressionTest
    fun ensureAdditionWorks() {
        Espresso.onView(ViewMatchers.withId(R.id.buttonOne)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.buttonTwo)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.buttonAdd)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.buttonTwo)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.buttonOne)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.buttonEqual)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.editText)).check(ViewAssertions.matches(ViewMatchers.withText("33")))
    }

    @Test
    @RegressionTest
    fun ensureSubtractionWorks() {
        Espresso.onView(ViewMatchers.withId(R.id.buttonTwo)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.buttonTwo)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.buttonSubtract)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.buttonOne)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.buttonOne)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.buttonEqual)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.editText)).check(ViewAssertions.matches(ViewMatchers.withText("11")))
    }

    @Test
    @RegressionTest
    fun ensureMultiplicationWorks() {
        Espresso.onView(ViewMatchers.withId(R.id.buttonOne)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.buttonTwo)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.buttonMultiply)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.buttonFive)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.buttonEqual)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.editText)).check(ViewAssertions.matches(ViewMatchers.withText("60")))
    }

    @Test
    @SmokeTest
    fun ensureDivisionWorks() {
        Espresso.onView(ViewMatchers.withId(R.id.buttonOne)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.buttonTwo)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.buttonDivide)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.buttonThree)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.buttonEqual)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.editText)).check(ViewAssertions.matches(ViewMatchers.withText("4")))
    }
}
