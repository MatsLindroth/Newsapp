package se.linerotech.myapplication.api

import se.linerotech.myapplication.api.New

data class NewsJSON(
    val news: List<New>,
    val page: Int,
    val status: String
)