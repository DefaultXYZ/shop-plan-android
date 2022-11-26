package xyz.shop.plan.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.em
import xyz.shop.plan.extensions.PreviewContainer

object TypographyStyle {
    val TitleLarge: TextStyle
        get() = TextStyle(
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.Normal,
            fontSize = FontSize.ExtraLarge,
            lineHeight = FontLineHeight.ExtraLarge
        )
    val TitleMedium: TextStyle
        get() = TextStyle(
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.Medium,
            fontSize = FontSize.Large,
            lineHeight = FontLineHeight.Large,
            letterSpacing = 0.15.em
        )
    val TitleSmall: TextStyle
        get() = TextStyle(
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.Medium,
            fontSize = FontSize.Medium,
            lineHeight = FontLineHeight.Medium,
            letterSpacing = 0.01.em
        )

    val BodyLarge: TextStyle
        get() = TextStyle(
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.Normal,
            fontSize = FontSize.Large,
            lineHeight = FontLineHeight.Large,
            letterSpacing = 0.15.em
        )
    val BodyMedium: TextStyle
        get() = TextStyle(
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.Normal,
            fontSize = FontSize.Medium,
            lineHeight = FontLineHeight.Medium,
            letterSpacing = 0.25.em
        )
    val BodySmall: TextStyle
        get() = TextStyle(
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.Normal,
            fontSize = FontSize.Small,
            lineHeight = FontLineHeight.Small,
            letterSpacing = 0.04.em
        )

    val LabelLarge: TextStyle
        get() = TextStyle(
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.Medium,
            fontSize = FontSize.Medium,
            lineHeight = FontLineHeight.Medium,
            letterSpacing = 0.01.em
        )
    val LabelMedium: TextStyle
        get() = TextStyle(
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.Medium,
            fontSize = FontSize.Small,
            lineHeight = FontLineHeight.Small,
            letterSpacing = 0.05.em
        )
    val LabelSmall: TextStyle
        get() = TextStyle(
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.Normal,
            fontSize = FontSize.ExtraSmall,
            lineHeight = FontLineHeight.Small,
            letterSpacing = 0.05.em
        )
}

val Typography = Typography(
    h1 = TypographyStyle.TitleLarge,
    h2 = TypographyStyle.TitleLarge,
    h3 = TypographyStyle.TitleMedium,
    h4 = TypographyStyle.TitleMedium,
    h5 = TypographyStyle.TitleSmall,
    h6 = TypographyStyle.TitleSmall,
    body1 = TypographyStyle.BodyLarge,
    body2 = TypographyStyle.BodyMedium,
    subtitle1 = TypographyStyle.BodySmall,
    subtitle2 = TypographyStyle.BodySmall,
    button = TypographyStyle.LabelLarge,
    caption = TypographyStyle.LabelMedium,
    overline = TypographyStyle.LabelSmall
)

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewType() {
    val styles = mapOf(
        "Title Large" to TypographyStyle.TitleLarge,
        "Title Medium" to TypographyStyle.TitleMedium,
        "Title Small" to TypographyStyle.TitleSmall,
        "Body Large" to TypographyStyle.BodyLarge,
        "Body Medium" to TypographyStyle.BodyMedium,
        "Body Small" to TypographyStyle.BodySmall,
        "Label Large" to TypographyStyle.LabelLarge,
        "Label Medium" to TypographyStyle.LabelMedium,
        "Label Small" to TypographyStyle.LabelSmall,
    )

    PreviewContainer {
        Surface {
            Column {
                styles.map {
                    Text(
                        it.key,
                        style = it.value,
                        modifier = Modifier.padding(PaddingSize.Medium)
                    )
                }
            }
        }
    }
}
