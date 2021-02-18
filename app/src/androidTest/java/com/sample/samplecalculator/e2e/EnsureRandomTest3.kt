@file:Suppress("DEPRECATION")

package com.sample.samplecalculator.e2e

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.MediumTest
import androidx.test.rule.ActivityTestRule
import com.sample.samplecalculator.MainActivity
import com.sample.samplecalculator.R
import com.sample.samplecalculator.utils.E2ETest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@MediumTest
@RunWith(AndroidJUnit4::class)
class EnsureRandomTest3 {

    @get:Rule
    var activityTestRule
            = ActivityTestRule(MainActivity::class.java)
    @Test
    @E2ETest
    fun testZeroMultiplication() {
        Espresso.onView(ViewMatchers.withId(R.id.buttonTwo)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.buttonMultiply)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.buttonZero)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.buttonEqual)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.editText)).check(ViewAssertions.matches(ViewMatchers.withText("0")))
    }

    @Test
    @E2ETest
    fun testZeroDivision() {
        Espresso.onView(ViewMatchers.withId(R.id.buttonTwo)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.buttonDivide)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.buttonZero)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.buttonEqual)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.editText)).check(ViewAssertions.matches(ViewMatchers.withText("∞")))
    }
}
