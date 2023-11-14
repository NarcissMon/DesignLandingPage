package com.stevdza.san.models

import com.stevdza.san.util.Constants.LOREM_IPSUM_LONG

enum class Experience(
    val number: String,
    val jobPosition: String,
    val description: String,
    val company: String,
    val comment: String,

) {
    First(
        number = "01",
        jobPosition = "Kotlin Multi-Platform Разработчик",
        description = LOREM_IPSUM_LONG,
        company = "Google, Yandex, VK, Sber",
        comment = "Очень востребованно",

    ),
    Second(
        number = "02",
        jobPosition = "Mobile Developer",
        description = LOREM_IPSUM_LONG,
        company = "VK, Yandex, OZON, Tinkoff",
        comment = "Высокая оплата",

    ),
    Third(
        number = "03",
        jobPosition = "Фрилансер",
        description = LOREM_IPSUM_LONG,
        company = "Netflix, RiotGames, EpicGames",
        comment = "Большой выбор",

    )
}