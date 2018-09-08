package com.economicvisma.tddmyfriends

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup

class FriendsRecViewAdapter : RecyclerView.Adapter<FriendsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): FriendsViewHolder {
        return FriendsViewHolder(View(parent.context))
    }

    override fun getItemCount(): Int {
        return 3
    }

    override fun onBindViewHolder(holder: FriendsViewHolder, position: Int) {
    }
}
