package org.jetbrains.jewel.markdown.extensions.github.alerts

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

public fun AlertStyling.Companion.light(
    note: NoteAlertStyling = NoteAlertStyling.light(),
    tip: TipAlertStyling = TipAlertStyling.light(),
    important: ImportantAlertStyling = ImportantAlertStyling.light(),
    warning: WarningAlertStyling = WarningAlertStyling.light(),
    caution: CautionAlertStyling = CautionAlertStyling.light(),
): AlertStyling = AlertStyling(note, tip, important, warning, caution)

public fun AlertStyling.Companion.dark(
    note: NoteAlertStyling = NoteAlertStyling.dark(),
    tip: TipAlertStyling = TipAlertStyling.dark(),
    important: ImportantAlertStyling = ImportantAlertStyling.dark(),
    warning: WarningAlertStyling = WarningAlertStyling.dark(),
    caution: CautionAlertStyling = CautionAlertStyling.dark(),
): AlertStyling = AlertStyling(note, tip, important, warning, caution)

public fun NoteAlertStyling.Companion.light(
    padding: PaddingValues = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
    lineWidth: Dp = 3.dp,
    lineColor: Color = Color(0xFF0969DA),
    pathEffect: PathEffect? = null,
    strokeCap: StrokeCap = StrokeCap.Square,
    titleTextStyle: TextStyle = TextStyle(fontWeight = FontWeight.Medium, color = lineColor),
    titleIconPath: String? = "icons/markdown/extensions/github/alerts/alert-note.svg",
    titleIconTint: Color = lineColor,
    textColor: Color = Color.Unspecified,
): NoteAlertStyling =
    NoteAlertStyling(
        padding,
        lineWidth,
        lineColor,
        pathEffect,
        strokeCap,
        titleTextStyle,
        titleIconPath,
        titleIconTint,
        textColor,
    )

public fun NoteAlertStyling.Companion.dark(
    padding: PaddingValues = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
    lineWidth: Dp = 3.dp,
    lineColor: Color = Color(0xFF1F6EEB),
    pathEffect: PathEffect? = null,
    strokeCap: StrokeCap = StrokeCap.Square,
    titleTextStyle: TextStyle = TextStyle(fontWeight = FontWeight.Medium, color = lineColor),
    titleIconPath: String? = "icons/markdown/extensions/github/alerts/alert-note.svg",
    titleIconTint: Color = lineColor,
    textColor: Color = Color.Unspecified,
): NoteAlertStyling =
    NoteAlertStyling(
        padding,
        lineWidth,
        lineColor,
        pathEffect,
        strokeCap,
        titleTextStyle,
        titleIconPath,
        titleIconTint,
        textColor,
    )

public fun TipAlertStyling.Companion.light(
    padding: PaddingValues = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
    lineWidth: Dp = 3.dp,
    lineColor: Color = Color(0xFF1F883D),
    pathEffect: PathEffect? = null,
    strokeCap: StrokeCap = StrokeCap.Square,
    titleTextStyle: TextStyle = TextStyle(fontWeight = FontWeight.Medium, color = lineColor),
    titleIconPath: String? = "icons/markdown/extensions/github/alerts/alert-tip.svg",
    titleIconTint: Color = lineColor,
    textColor: Color = Color.Unspecified,
): TipAlertStyling =
    TipAlertStyling(
        padding,
        lineWidth,
        lineColor,
        pathEffect,
        strokeCap,
        titleTextStyle,
        titleIconPath,
        titleIconTint,
        textColor,
    )

public fun TipAlertStyling.Companion.dark(
    padding: PaddingValues = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
    lineWidth: Dp = 3.dp,
    lineColor: Color = Color(0xFF238636),
    pathEffect: PathEffect? = null,
    strokeCap: StrokeCap = StrokeCap.Square,
    titleTextStyle: TextStyle = TextStyle(fontWeight = FontWeight.Medium, color = lineColor),
    titleIconPath: String? = "icons/markdown/extensions/github/alerts/alert-tip.svg",
    titleIconTint: Color = lineColor,
    textColor: Color = Color.Unspecified,
): TipAlertStyling =
    TipAlertStyling(
        padding,
        lineWidth,
        lineColor,
        pathEffect,
        strokeCap,
        titleTextStyle,
        titleIconPath,
        titleIconTint,
        textColor,
    )

public fun ImportantAlertStyling.Companion.light(
    padding: PaddingValues = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
    lineWidth: Dp = 3.dp,
    lineColor: Color = Color(0xFF8250DF),
    pathEffect: PathEffect? = null,
    strokeCap: StrokeCap = StrokeCap.Square,
    titleTextStyle: TextStyle = TextStyle(fontWeight = FontWeight.Medium, color = lineColor),
    titleIconPath: String? = "icons/markdown/extensions/github/alerts/alert-important.svg",
    titleIconTint: Color = lineColor,
    textColor: Color = Color.Unspecified,
): ImportantAlertStyling =
    ImportantAlertStyling(
        padding,
        lineWidth,
        lineColor,
        pathEffect,
        strokeCap,
        titleTextStyle,
        titleIconPath,
        titleIconTint,
        textColor,
    )

public fun ImportantAlertStyling.Companion.dark(
    padding: PaddingValues = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
    lineWidth: Dp = 3.dp,
    lineColor: Color = Color(0xFF8957E5),
    pathEffect: PathEffect? = null,
    strokeCap: StrokeCap = StrokeCap.Square,
    titleTextStyle: TextStyle = TextStyle(fontWeight = FontWeight.Medium, color = lineColor),
    titleIconPath: String? = "icons/markdown/extensions/github/alerts/alert-important.svg",
    titleIconTint: Color = lineColor,
    textColor: Color = Color.Unspecified,
): ImportantAlertStyling =
    ImportantAlertStyling(
        padding,
        lineWidth,
        lineColor,
        pathEffect,
        strokeCap,
        titleTextStyle,
        titleIconPath,
        titleIconTint,
        textColor,
    )

public fun WarningAlertStyling.Companion.light(
    padding: PaddingValues = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
    lineWidth: Dp = 3.dp,
    lineColor: Color = Color(0xFF9A6601),
    pathEffect: PathEffect? = null,
    strokeCap: StrokeCap = StrokeCap.Square,
    titleTextStyle: TextStyle = TextStyle(fontWeight = FontWeight.Medium, color = lineColor),
    titleIconPath: String? = "icons/markdown/extensions/github/alerts/alert-warning.svg",
    titleIconTint: Color = lineColor,
    textColor: Color = Color.Unspecified,
): WarningAlertStyling =
    WarningAlertStyling(
        padding,
        lineWidth,
        lineColor,
        pathEffect,
        strokeCap,
        titleTextStyle,
        titleIconPath,
        titleIconTint,
        textColor,
    )

public fun WarningAlertStyling.Companion.dark(
    padding: PaddingValues = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
    lineWidth: Dp = 3.dp,
    lineColor: Color = Color(0xFF9E6A02),
    pathEffect: PathEffect? = null,
    strokeCap: StrokeCap = StrokeCap.Square,
    titleTextStyle: TextStyle = TextStyle(fontWeight = FontWeight.Medium, color = lineColor),
    titleIconPath: String? = "icons/markdown/extensions/github/alerts/alert-warning.svg",
    titleIconTint: Color = lineColor,
    textColor: Color = Color.Unspecified,
): WarningAlertStyling =
    WarningAlertStyling(
        padding,
        lineWidth,
        lineColor,
        pathEffect,
        strokeCap,
        titleTextStyle,
        titleIconPath,
        titleIconTint,
        textColor,
    )

public fun CautionAlertStyling.Companion.light(
    padding: PaddingValues = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
    lineWidth: Dp = 3.dp,
    lineColor: Color = Color(0xFFCF222E),
    pathEffect: PathEffect? = null,
    strokeCap: StrokeCap = StrokeCap.Square,
    titleTextStyle: TextStyle = TextStyle(fontWeight = FontWeight.Medium, color = lineColor),
    titleIconPath: String? = "icons/markdown/extensions/github/alerts/alert-caution.svg",
    titleIconTint: Color = lineColor,
    textColor: Color = Color.Unspecified,
): CautionAlertStyling =
    CautionAlertStyling(
        padding,
        lineWidth,
        lineColor,
        pathEffect,
        strokeCap,
        titleTextStyle,
        titleIconPath,
        titleIconTint,
        textColor,
    )

public fun CautionAlertStyling.Companion.dark(
    padding: PaddingValues = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
    lineWidth: Dp = 3.dp,
    lineColor: Color = Color(0xFFDA3633),
    pathEffect: PathEffect? = null,
    strokeCap: StrokeCap = StrokeCap.Square,
    titleTextStyle: TextStyle = TextStyle(fontWeight = FontWeight.Medium, color = lineColor),
    titleIconPath: String? = "icons/markdown/extensions/github/alerts/alert-caution.svg",
    titleIconTint: Color = lineColor,
    textColor: Color = Color.Unspecified,
): CautionAlertStyling {
    return CautionAlertStyling(
        padding,
        lineWidth,
        lineColor,
        pathEffect,
        strokeCap,
        titleTextStyle,
        titleIconPath,
        titleIconTint,
        textColor,
    )
}
