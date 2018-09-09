package com.economicvisma.tddmyfriends

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class FriendsRecViewAdapter(
    private val presenter: FriendsPresenter
) : RecyclerView.Adapter<FriendsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): FriendsViewHolder {
        return FriendsViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.friend_item, parent, false))
    }

    override fun getItemCount(): Int {
        return presenter.totalFriends
    }

    override fun onBindViewHolder(holder: FriendsViewHolder, position: Int) {
        if ( position == 0 )
            holder.friendName = "Jon"
        else if ( position == 1)
            holder.friendName = "Marie"
        else if ( position == 2 )
            holder.friendName = "Martin"
    }
}
