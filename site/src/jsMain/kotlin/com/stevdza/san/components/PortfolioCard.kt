package com.stevdza.san.components

import androidx.compose.runtime.Composable
import com.stevdza.san.kotlinbs.components.BSButton
import com.stevdza.san.kotlinbs.components.BSModal
import com.stevdza.san.kotlinbs.components.showModalOnClick
import com.stevdza.san.kotlinbs.forms.BSInput
import com.stevdza.san.kotlinbs.forms.BSTextArea
import com.stevdza.san.models.Portfolio
import com.stevdza.san.models.Theme
import com.stevdza.san.styles.PortfolioSectionStyle
import com.stevdza.san.util.Constants.FONT_FAMILY
import com.stevdza.san.util.Constants.LOREM_IPSUM_SHORTEST
import com.stevdza.san.util.Constants.WEBSITE
import com.stevdza.san.util.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.css.Width
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color.Companion.argb
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun PortfolioCard(
    modifier: Modifier = Modifier,
    portfolio: Portfolio,
    link: String = WEBSITE
) {
Column(
    modifier = modifier
        .id("columnParent")
        .width(Width.MaxContent)
) {
    Link(
        modifier = PortfolioSectionStyle.toModifier()
            .textDecorationLine(TextDecorationLine.None),
        path = link,
    ) {
        Column(
            modifier = modifier
                .id("columnParent")
                .width(Width.MaxContent)
        ) {
            Box(
                modifier = Modifier
                    .id("boxParent")
                    .fillMaxWidth()
                    .maxWidth(300.px)
                    .margin(bottom = 20.px)
            ) {
                Image(
                    modifier = Modifier
                        .size(300.px)
                        .objectFit(ObjectFit.Cover),
                    src = portfolio.image,
                    desc = "Portfolio Image"
                )
                Box(
                    modifier = Modifier
                        .id("Overlay")
                        .fillMaxHeight()
                        .backgroundColor(argb(a = 0.5f, r = 174, g = 160, b = 220)),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        modifier = Modifier
                            .id("linkIcon")
                            .size(32.px),
                        src = Res.Icon.link,
                        desc = "Link Icon"
                    )
                }
            }
        }
    }

    P(
        attrs = Modifier
            .id("portfolioTitle")
            .fillMaxWidth()
            .margin(topBottom = 0.px)
            .fontFamily(FONT_FAMILY)
            .fontSize(18.px)
            .fontWeight(FontWeight.Bold)
            .toAttrs()
    ) {
        Text(portfolio.title)
    }
    P(
        attrs = Modifier
            .id("portfolioDesc")
            .fillMaxWidth()
            .margin(topBottom = 0.px)
            .fontFamily(FONT_FAMILY)
            .fontSize(14.px)
            .fontWeight(FontWeight.Normal)
            .color(Theme.Secondary.rgb)
            .opacity(50.percent)
            .toAttrs()
    ) {
        Text(portfolio.description)
    }
    P(
        attrs = Modifier
            .id("portfolioDesc")
            .fillMaxWidth()
            .margin(topBottom = 0.px)
            .fontFamily(FONT_FAMILY)
            .fontSize(14.px)
            .fontWeight(FontWeight.Normal)
            .color(Theme.Secondary.rgb)
            .opacity(50.percent)
            .toAttrs()
    ) {
        BSButton(
            modifier = Modifier
                .showModalOnClick(id = "contactModal")
                .margin(top = 10.px),
            text = "Trigger",
            onClick = {}
        )
    }
}


    BSModal(
        id = "contactModal",
        title = "Contact us",
        body = {
            Column {
                BSInput(
                    modifier = Modifier
                        .fillMaxWidth()
                        .margin(bottom = 14.px),
                    value = "",
                    label = "Email Address",
                    placeholder = "Type here...",
                    onValueChange = {}
                )
                BSTextArea(
                    modifier = Modifier.fillMaxWidth(),
                    value = "",
                    label = "Message",
                    placeholder = "Type here...",
                    onValueChange = {}
                )
            }
        },
        positiveButtonText = "Send Message",
        negativeButtonText = "Close",
        onPositiveButtonClick = {},
        onNegativeButtonClick = {}
    )
}