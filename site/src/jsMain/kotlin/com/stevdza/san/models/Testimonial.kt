package com.stevdza.san.models

import com.stevdza.san.util.Constants.LOREM_IPSUM_SHORT
import com.stevdza.san.util.Res

enum class Testimonial(
    val image: String,
    val fullName: String,
    val profession: String,
    val review: String
) {
    First(//заменить фото и имена на одногруппников
        image = Res.Image.avatar1,
        fullName = "Рина",
        profession = "Web Дизайнер",
        review = LOREM_IPSUM_SHORT
    ),
    Second(
        image = Res.Image.avatar2,
        fullName = "Илья",
        profession = "IOS Разработчик",
        review = LOREM_IPSUM_SHORT
    ),
    Third(
        image = Res.Image.avatar3,
        fullName = "Алина",
        profession = "Бизнес аналитик",
        review = LOREM_IPSUM_SHORT
    ),
    Fourth(
        image = Res.Image.avatar4,
        fullName = "Мария",
        profession = "Топ Менеджер",
        review = LOREM_IPSUM_SHORT
    ),
    Fifth(
        image = Res.Image.avatar5,
        fullName = "Александр",
        profession = "HR Рекрутер",
        review = LOREM_IPSUM_SHORT
    ),
    Sixth(
        image = Res.Image.avatar6,
        fullName = "Кирилл",
        profession = "Аналитик кибербезопасности",
        review = LOREM_IPSUM_SHORT
    )
}