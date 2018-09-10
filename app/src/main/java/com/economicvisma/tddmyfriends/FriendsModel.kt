package com.economicvisma.tddmyfriends

class FriendsModel {
    fun getFriends(): List<String> {
        return friends
    }

    private val friends = listOf("Jon", "Cristine", "Martin")

    val friendsCount: Int
    get() = friends.size
}