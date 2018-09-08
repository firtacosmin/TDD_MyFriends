package com.economicvisma.tddmyfriends

import android.support.test.filters.LargeTest
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
@LargeTest
class MainActivityTest {
    @get:Rule
    public val mActivityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)


    @Before
    fun init() {
    }

}