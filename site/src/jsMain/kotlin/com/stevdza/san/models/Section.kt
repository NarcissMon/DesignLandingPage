package com.stevdza.san.models

enum class Section(
    val id: String,
    val title: String,
    val subtitle: String,
    val path: String
) {
    Home(
        id = "home",
        title = "Главная",
        subtitle = "",
        path = "#home"
    ),
    About(
        id = "about",
        title = "О нас",
        subtitle = "Почему выбирают именно нас?",
        path = "#about"
    ),
    Service(
        id = "service",
        title = "Направления",
        subtitle = "Выбирайте что вам по душе",
        path = "#service"
    ),
    Portfolio(
        id = "portfolio",
        title = "Курсы",
        subtitle = "Самые популярные",
        path = "#portfolio"
    ),
    Experience(
        id = "experience",
        title = "Карьера",
        subtitle = "Актуальные профессии",
        path = "#experience"
    ),
    Contact(
        id = "contact",
        title = "Контакты",
        subtitle = "Свяжитесь с нами",
        path = "#contact"
    ),
    Testimonial(
        id = "testimonial",
        title = "Отзывы",
        subtitle = "Счастливые выпускники",
        path = "#testimonial"
    ),
    Achievements( //не отображается
        id = "achievements",
        title = "Достижения",
        subtitle = "Чего мы достигли",
        path = "#achievements"
    )
}