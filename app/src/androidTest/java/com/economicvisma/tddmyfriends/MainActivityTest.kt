package com.economicvisma.tddmyfriends

import android.support.test.espresso.Espresso
import android.support.test.espresso.Espresso.onData
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers
import android.support.test.espresso.matcher.ViewMatchers.hasDescendant
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.filters.LargeTest
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.economicvisma.tddmyfriends.helper.RecyclerViewItemCountAssertion
import com.economicvisma.tddmyfriends.helper.RecyclerViewItemTextAssertion
import com.economicvisma.tddmyfriends.helper.TestUtils.withRecyclerView
import org.hamcrest.CoreMatchers.allOf
import org.hamcrest.CoreMatchers.anything
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

    @Test
    fun scenario2_checkIfTheFriendOnPos0IsJon() {
        onView(withRecyclerView(R.id.friend_list).
            atPosition(0)).
            check(matches(hasDescendant(withText("Jon"))))
    }

    @Test
    fun scenario2_checkIfTheFriendOnPos1IsMarie() {
        onView(withRecyclerView(R.id.friend_list).
            atPosition(1)).
            check(matches(hasDescendant(withText("Marie"))))
    }

    @Test
    fun scenario2_checkIfTheFriendOnPos2IsMartin() {
        onView(withRecyclerView(R.id.friend_list).
            atPosition(2)).
            check(matches(hasDescendant(withText("Martin"))))
    }
}