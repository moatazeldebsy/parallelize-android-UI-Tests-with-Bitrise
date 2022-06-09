@file:Suppress("DEPRECATION")

package com.sample.samplecalculator.regression

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.filters.SmallTest
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import com.sample.samplecalculator.MainActivity
import com.sample.samplecalculator.R
import com.sample.samplecalculator.utils.RegressionTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@SmallTest
@RunWith(AndroidJUnit4::class)
class EnsureInputTests3 {

    @get:Rule
    var activityTestRule
            = ActivityTestRule(MainActivity::class.java)

    @Test
    @RegressionTest
    fun ensureSingleInputIsHandled() {
        Espresso.onView(ViewMatchers.withId(R.id.buttonOne)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.editText)).check(ViewAssertions.matches(ViewMatchers.withText("1")))
    }

    @Test
    @RegressionTest
    fun ensureMultipleInputIsHandled() {
        Espresso.onView(ViewMatchers.withId(R.id.buttonOne)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.buttonTwo)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.editText)).check(ViewAssertions.matches(ViewMatchers.withText("12")))
    }
}
