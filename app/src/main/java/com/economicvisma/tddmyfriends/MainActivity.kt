package com.economicvisma.tddmyfriends

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.friend_list

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        friend_list.adapter = FriendsRecViewAdapter(FriendsPresenter())
        friend_list.layoutManager = LinearLayoutManager(this)
    }
}
