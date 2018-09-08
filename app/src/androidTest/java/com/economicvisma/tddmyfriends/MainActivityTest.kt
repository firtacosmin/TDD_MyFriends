package com.economicvisma.tddmyfriends

import android.support.test.espresso.Espresso
import android.support.test.espresso.matcher.ViewMatchers
import android.support.test.filters.LargeTest
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.economicvisma.tddmyfriends.helper.RecyclerViewItemCountAssertion
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
@LargeTest
class MainActivityTest {
    @get:Rule
    public val mActivityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    private val totalFriendCount = 3

    @Before
    fun init() {
    }

    @Test
    fun scenario1_checkIfListHasFriends() {
        Espresso.onView(ViewMatchers.withId(R.id.friend_list))
            .check(RecyclerViewItemCountAssertion(totalFriendCount))
    }

}