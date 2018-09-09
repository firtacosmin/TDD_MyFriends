package com.economicvisma.tddmyfriends.helper

import android.support.v7.widget.RecyclerView
import android.support.test.espresso.NoMatchingViewException
import android.support.test.espresso.ViewAssertion
import android.support.test.espresso.matcher.ViewMatchers.assertThat
import android.view.View
import android.widget.TextView
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.isA


class RecyclerViewItemCountAssertion(private val expectedCount: Int) : ViewAssertion {
    override fun check(view: View, noViewFoundException: NoMatchingViewException?) {
        if (noViewFoundException != null) {
            throw noViewFoundException
        }
        val recyclerView = view as RecyclerView
        val adapter = recyclerView.adapter
        assertThat(adapter!!.itemCount, `is`(expectedCount))
    }
}

class RecyclerViewItemTextAssertion(private val text: String) : ViewAssertion {
    override fun check(view: View, noViewFoundException: NoMatchingViewException?) {
//        if (noViewFoundException != null) {
//            throw noViewFoundException
//        }

        (view as? TextView)?.let {
            assertThat(it.text.toString(), `is`(text))
        } ?: assert(false)
    }
}