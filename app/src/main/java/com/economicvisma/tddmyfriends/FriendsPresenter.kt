package com.economicvisma.tddmyfriends

class FriendsPresenter {
    private val model: FriendsModel = FriendsModel()
    var totalFriends: Int = model.friendsCount
}