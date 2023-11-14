package com.stevdza.san.components

import androidx.compose.runtime.Composable
import com.stevdza.san.kotlinbs.components.BSButton
import com.stevdza.san.kotlinbs.components.BSModal
import com.stevdza.san.kotlinbs.components.showModalOnClick
import com.stevdza.san.kotlinbs.forms.BSInput
import com.stevdza.san.kotlinbs.forms.BSTextArea
import com.stevdza.san.models.Service
import com.stevdza.san.models.Theme
import com.stevdza.san.styles.ServiceCardStyle
import com.stevdza.san.util.Constants
import com.stevdza.san.util.Constants.FONT_FAMILY
import com.stevdza.san.util.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun ServiceCard(service: Service) {
    Column(
        modifier = ServiceCardStyle.toModifier()
            .maxWidth(300.px)
            .margin(all = 20.px)
            .padding(all = 20.px)
    ) {
        Box(
            modifier = Modifier
                .id("iconBox")
                .padding(all = 10.px)
                .margin(bottom = 20.px)
                .border(
                    width = 2.px,
                    style = LineStyle.Solid,
                    color = Theme.Primary.rgb
                )
                .borderRadius(
                    topLeft = 20.px,
                    topRight = 20.px,
                    bottomLeft = 20.px,
                    bottomRight = 0.px
                )
        ) {
            Image(
                modifier = Modifier.size(40.px),
                src = service.icon,
                desc = service.imageDesc
            )
        }
        P(
            attrs = Modifier
                .fillMaxWidth()
                .margin(top = 0.px, bottom = 10.px)
                .fontFamily(FONT_FAMILY)
                .fontSize(18.px)
                .fontWeight(FontWeight.Bold)
                .toAttrs()
        ) {
            Text(service.title)
        }
        P(
            attrs = Modifier
                .fillMaxWidth()
                .margin(top = 0.px, bottom = 0.px)
                .fontFamily(FONT_FAMILY)
                .fontSize(14.px)
                .fontWeight(FontWeight.Normal)
                .toAttrs()
        ) {
            Text(service.description)

        }
        P(
            attrs = Modifier
                .fillMaxWidth()
                .margin(top = 10.px, bottom = 0.px)
                .fontFamily(FONT_FAMILY)
                .fontSize(14.px)
                .fontWeight(FontWeight.Normal)
                .toAttrs()
        ) {
            BSButton(
                modifier = Modifier
                    .showModalOnClick(id = "contactModal"),
                text = "Подробнее",
                onClick = {}
            )
        }
    }
    BSModal(
        id = "contactModal",
        title = "Информация",
        body = {
            Column {

                Text(Constants.LOREM_IPSUM_LONG)
                Image(
                    modifier = Modifier
                        .margin(top = 10.px, bottom = 10.px)
                        .size(300.px)
                        .objectFit(ObjectFit.Cover),
                    src = Res.Image.portfolio1,
                    desc = "Portfolio Image"
                )
                BSTextArea(
                    modifier = Modifier
                        .fillMaxWidth(),
                    value = "",
                    label = "Мнение",
                    placeholder = "Напишите мнение об этом направлении",
                    onValueChange = {}
                )
            }
        },
        positiveButtonText = "Отправить",
        negativeButtonText = "Отменить",
        onPositiveButtonClick = {},
        onNegativeButtonClick = {}
    )
}