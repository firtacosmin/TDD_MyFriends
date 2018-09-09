package com.economicvisma.tddmyfriends

class FriendsPresenter {
    private val model: FriendsModel = FriendsModel()

    var totalFriends: Int = model.friendsCount

    fun drawFriendAtPosition(
        viewHolder: IFriendsViewHolder,
        position: Int
    ) {
        if ( position == 0 )
            viewHolder.friendName = "Jon"
        else if ( position == 1 )
            viewHolder.friendName = "Marie"
        else viewHolder.friendName = "Martin"
    }
}