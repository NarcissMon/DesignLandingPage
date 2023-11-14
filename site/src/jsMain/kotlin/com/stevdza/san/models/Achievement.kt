package com.stevdza.san.models

import com.stevdza.san.util.Res

enum class Achievement(
    val icon: String,
    val number: Int,
    val description: String
) {
    Completed(
        icon = Res.Icon.checkmark,
        number = 30,
        description = "Готовых Курсов"
    ),
    Active(
        icon = Res.Icon.shield,
        number = 12,
        description = "В Разработке"
    ),
    Satisfied(
        icon = Res.Icon.happy,
        number = 100,
        description = "Довольных Учеников"
    ),
    Team(
        icon = Res.Icon.user,
        number = 10,
        description = "Преподавателей"
    )
}