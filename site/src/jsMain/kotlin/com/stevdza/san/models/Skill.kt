package com.stevdza.san.models

import org.jetbrains.compose.web.css.CSSSizeValue
import org.jetbrains.compose.web.css.CSSUnit
import org.jetbrains.compose.web.css.percent

enum class Skill(
    val title: String,
    val percentage: CSSSizeValue<CSSUnit.percent>
) {
    Creative(
        title = "Актуальность",
        percentage = 90.percent
    ),
    Accountable(
        title = "Понятное объяснение материала",
        percentage = 90.percent
    ),
    HardWorking(
        title = "Доступ навсегда",
        percentage = 100.percent
    ),
    Value(
        title = "Подходит для любых ценовых категорий",
        percentage = 85.percent
    ),
    Delivery(
        title = "Процент окончания курсов",
        percentage = 85.percent
    )
}