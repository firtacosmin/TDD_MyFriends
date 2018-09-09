package com.economicvisma.tddmyfriends

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

class FriendsViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView), IFriendsViewHolder {
    private var nameText: TextView = itemView.findViewById(R.id.friend_name)
    override var friendName: String
    set(value) {nameText.text = value}
    get() {return nameText.text.toString()}
}

interface IFriendsViewHolder {
    var friendName: String
}