package com.economicvisma.tddmyfriends

class FriendsPresenter {
    private val model: FriendsModel = FriendsModel()

    var totalFriends: Int = model.friendsCount

    fun drawFriendAtPosition(
        viewHolder: IFriendsViewHolder,
        position: Int
    ) {
        viewHolder.friendName = model.getFriends()[position]
    }
}