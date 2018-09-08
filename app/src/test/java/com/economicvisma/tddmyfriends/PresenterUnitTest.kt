package com.economicvisma.tddmyfriends

import org.hamcrest.core.Is.`is`
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.Test

class PresenterUnitTest {

    @Before
    fun init() {

    }

    @Test
    fun testTotalFriendsCount() {
        val presenter = FriendsPresenter()
        assertThat(presenter.totalFriends, `is`(3))
    }
}