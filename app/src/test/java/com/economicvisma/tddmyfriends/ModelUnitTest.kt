package com.economicvisma.tddmyfriends

import org.hamcrest.core.Is.`is`
import org.junit.Assert.assertThat
import org.junit.Test

class ModelUnitTest {

    @Test
    fun getTheTotalNumberOfFriends() {
        assertThat(FriendsModel().friendsCount, `is`(3))
    }
}