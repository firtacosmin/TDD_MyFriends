package com.economicvisma.tddmyfriends

import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
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

    @Test
    fun testGetFriendNameOnPos0() {
        val presenter = FriendsPresenter()
        val viewHolder: IFriendsViewHolder = mock()
        presenter.drawFriendAtPosition(viewHolder, 0)
        verify(viewHolder).friendName = "Jon"
    }

    @Test
    fun testGetFriendNameOnPos1() {
        val presenter = FriendsPresenter()
        val viewHolder: IFriendsViewHolder = mock()
        presenter.drawFriendAtPosition(viewHolder, 1)
        verify(viewHolder).friendName = "Marie"
    }

    @Test
    fun testGetFriendNameOnPos2() {
        val presenter = FriendsPresenter()
        val viewHolder: IFriendsViewHolder = mock()
        presenter.drawFriendAtPosition(viewHolder, 2)
        verify(viewHolder).friendName = "Martin"
    }
}