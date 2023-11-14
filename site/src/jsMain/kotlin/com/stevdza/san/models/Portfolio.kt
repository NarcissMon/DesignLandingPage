package com.stevdza.san.models

import com.stevdza.san.util.Res

enum class Portfolio(
    val image: String,
    val title: String,
    val description: String
) {
    One(
        image = Res.Image.portfolio1,
        title = "PRO Go: Основы программирования",
        description = "Начальный уровень"
    ),
    Two(
        image = Res.Image.portfolio2,
        title = "Программирование на Python",
        description = "Начальный уровень"
    ),
    Three(
        image = Res.Image.portfolio3,
        title = "Android разработка: Базовый курс",
        description = "Начальный уровень"
    ),
    Four(
        image = Res.Image.portfolio4,
        title = "Kotlin – быстрый старт",
        description = "Средний уровень"
    ),
    Five(
        image = Res.Image.portfolio5,
        title = "WEB Парсинг на Python",
        description = "Средний уровень"
    )
}