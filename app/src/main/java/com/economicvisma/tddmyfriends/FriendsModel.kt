package com.economicvisma.tddmyfriends

class FriendsModel {
    private val friends = listOf("Jon", "Cristine", "Martin")

    val friendsCount: Int
    get() = friends.size
}