package com.stevdza.san.models

import com.stevdza.san.util.Constants.LOREM_IPSUM_SHORTEST
import com.stevdza.san.util.Res

enum class Service(
    val icon: String,
    val imageDesc: String,
    val title: String,
    val description: String
) {
    Android(
        icon = Res.Icon.android,
        imageDesc = "Android Icon",
        title = "Android Разработка",
        description = LOREM_IPSUM_SHORTEST
    ),
    IOS(
        icon = Res.Icon.apple,
        imageDesc = "Apple Icon",
        title = "iOS Разработка",
        description = LOREM_IPSUM_SHORTEST
    ),
    Web(
        icon = Res.Icon.web,
        imageDesc = "Desktop Icon",
        title = "Web Разработка",
        description = LOREM_IPSUM_SHORTEST
    ),
    Design(
        icon = Res.Icon.design,
        imageDesc = "Pen Icon",
        title = "UX/UI Дизайн",
        description = LOREM_IPSUM_SHORTEST
    ),
    Business(
        icon = Res.Icon.business,
        imageDesc = "Chart Icon",
        title = "Бизнес Аналитика",
        description = LOREM_IPSUM_SHORTEST
    ),
    SEO(
        icon = Res.Icon.seo,
        imageDesc = "Megaphone Icon",
        title = "SEO/Интернет-маркетинг",
        description = LOREM_IPSUM_SHORTEST
    )
}