package com.example.android_vizhener.ui.theme
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import com.example.android_app_sdvg.presentation.theme.backgroundDark
import com.example.android_app_sdvg.presentation.theme.backgroundDarkHighContrast
import com.example.android_app_sdvg.presentation.theme.backgroundDarkMediumContrast
import com.example.android_app_sdvg.presentation.theme.backgroundLight
import com.example.android_app_sdvg.presentation.theme.backgroundLightHighContrast
import com.example.android_app_sdvg.presentation.theme.backgroundLightMediumContrast
import com.example.android_app_sdvg.presentation.theme.errorContainerDark
import com.example.android_app_sdvg.presentation.theme.errorContainerDarkHighContrast
import com.example.android_app_sdvg.presentation.theme.errorContainerDarkMediumContrast
import com.example.android_app_sdvg.presentation.theme.errorContainerLight
import com.example.android_app_sdvg.presentation.theme.errorContainerLightHighContrast
import com.example.android_app_sdvg.presentation.theme.errorContainerLightMediumContrast
import com.example.android_app_sdvg.presentation.theme.errorDark
import com.example.android_app_sdvg.presentation.theme.errorDarkHighContrast
import com.example.android_app_sdvg.presentation.theme.errorDarkMediumContrast
import com.example.android_app_sdvg.presentation.theme.errorLight
import com.example.android_app_sdvg.presentation.theme.errorLightHighContrast
import com.example.android_app_sdvg.presentation.theme.errorLightMediumContrast
import com.example.android_app_sdvg.presentation.theme.inverseOnSurfaceDark
import com.example.android_app_sdvg.presentation.theme.inverseOnSurfaceDarkHighContrast
import com.example.android_app_sdvg.presentation.theme.inverseOnSurfaceDarkMediumContrast
import com.example.android_app_sdvg.presentation.theme.inverseOnSurfaceLight
import com.example.android_app_sdvg.presentation.theme.inverseOnSurfaceLightHighContrast
import com.example.android_app_sdvg.presentation.theme.inverseOnSurfaceLightMediumContrast
import com.example.android_app_sdvg.presentation.theme.inversePrimaryDark
import com.example.android_app_sdvg.presentation.theme.inversePrimaryDarkHighContrast
import com.example.android_app_sdvg.presentation.theme.inversePrimaryDarkMediumContrast
import com.example.android_app_sdvg.presentation.theme.inversePrimaryLight
import com.example.android_app_sdvg.presentation.theme.inversePrimaryLightHighContrast
import com.example.android_app_sdvg.presentation.theme.inversePrimaryLightMediumContrast
import com.example.android_app_sdvg.presentation.theme.inverseSurfaceDark
import com.example.android_app_sdvg.presentation.theme.inverseSurfaceDarkHighContrast
import com.example.android_app_sdvg.presentation.theme.inverseSurfaceDarkMediumContrast
import com.example.android_app_sdvg.presentation.theme.inverseSurfaceLight
import com.example.android_app_sdvg.presentation.theme.inverseSurfaceLightHighContrast
import com.example.android_app_sdvg.presentation.theme.inverseSurfaceLightMediumContrast
import com.example.android_app_sdvg.presentation.theme.onBackgroundDark
import com.example.android_app_sdvg.presentation.theme.onBackgroundDarkHighContrast
import com.example.android_app_sdvg.presentation.theme.onBackgroundDarkMediumContrast
import com.example.android_app_sdvg.presentation.theme.onBackgroundLight
import com.example.android_app_sdvg.presentation.theme.onBackgroundLightHighContrast
import com.example.android_app_sdvg.presentation.theme.onBackgroundLightMediumContrast
import com.example.android_app_sdvg.presentation.theme.onErrorContainerDark
import com.example.android_app_sdvg.presentation.theme.onErrorContainerDarkHighContrast
import com.example.android_app_sdvg.presentation.theme.onErrorContainerDarkMediumContrast
import com.example.android_app_sdvg.presentation.theme.onErrorContainerLight
import com.example.android_app_sdvg.presentation.theme.onErrorContainerLightHighContrast
import com.example.android_app_sdvg.presentation.theme.onErrorContainerLightMediumContrast
import com.example.android_app_sdvg.presentation.theme.onErrorDark
import com.example.android_app_sdvg.presentation.theme.onErrorDarkHighContrast
import com.example.android_app_sdvg.presentation.theme.onErrorDarkMediumContrast
import com.example.android_app_sdvg.presentation.theme.onErrorLight
import com.example.android_app_sdvg.presentation.theme.onErrorLightHighContrast
import com.example.android_app_sdvg.presentation.theme.onErrorLightMediumContrast
import com.example.android_app_sdvg.presentation.theme.onPrimaryContainerDark
import com.example.android_app_sdvg.presentation.theme.onPrimaryContainerDarkHighContrast
import com.example.android_app_sdvg.presentation.theme.onPrimaryContainerDarkMediumContrast
import com.example.android_app_sdvg.presentation.theme.onPrimaryContainerLight
import com.example.android_app_sdvg.presentation.theme.onPrimaryContainerLightHighContrast
import com.example.android_app_sdvg.presentation.theme.onPrimaryContainerLightMediumContrast
import com.example.android_app_sdvg.presentation.theme.onPrimaryDark
import com.example.android_app_sdvg.presentation.theme.onPrimaryDarkHighContrast
import com.example.android_app_sdvg.presentation.theme.onPrimaryDarkMediumContrast
import com.example.android_app_sdvg.presentation.theme.onPrimaryLight
import com.example.android_app_sdvg.presentation.theme.onPrimaryLightHighContrast
import com.example.android_app_sdvg.presentation.theme.onPrimaryLightMediumContrast
import com.example.android_app_sdvg.presentation.theme.onSecondaryContainerDark
import com.example.android_app_sdvg.presentation.theme.onSecondaryContainerDarkHighContrast
import com.example.android_app_sdvg.presentation.theme.onSecondaryContainerDarkMediumContrast
import com.example.android_app_sdvg.presentation.theme.onSecondaryContainerLight
import com.example.android_app_sdvg.presentation.theme.onSecondaryContainerLightHighContrast
import com.example.android_app_sdvg.presentation.theme.onSecondaryContainerLightMediumContrast
import com.example.android_app_sdvg.presentation.theme.onSecondaryDark
import com.example.android_app_sdvg.presentation.theme.onSecondaryDarkHighContrast
import com.example.android_app_sdvg.presentation.theme.onSecondaryDarkMediumContrast
import com.example.android_app_sdvg.presentation.theme.onSecondaryLight
import com.example.android_app_sdvg.presentation.theme.onSecondaryLightHighContrast
import com.example.android_app_sdvg.presentation.theme.onSecondaryLightMediumContrast
import com.example.android_app_sdvg.presentation.theme.onSurfaceDark
import com.example.android_app_sdvg.presentation.theme.onSurfaceDarkHighContrast
import com.example.android_app_sdvg.presentation.theme.onSurfaceDarkMediumContrast
import com.example.android_app_sdvg.presentation.theme.onSurfaceLight
import com.example.android_app_sdvg.presentation.theme.onSurfaceLightHighContrast
import com.example.android_app_sdvg.presentation.theme.onSurfaceLightMediumContrast
import com.example.android_app_sdvg.presentation.theme.onSurfaceVariantDark
import com.example.android_app_sdvg.presentation.theme.onSurfaceVariantDarkHighContrast
import com.example.android_app_sdvg.presentation.theme.onSurfaceVariantDarkMediumContrast
import com.example.android_app_sdvg.presentation.theme.onSurfaceVariantLight
import com.example.android_app_sdvg.presentation.theme.onSurfaceVariantLightHighContrast
import com.example.android_app_sdvg.presentation.theme.onSurfaceVariantLightMediumContrast
import com.example.android_app_sdvg.presentation.theme.onTertiaryContainerDark
import com.example.android_app_sdvg.presentation.theme.onTertiaryContainerDarkHighContrast
import com.example.android_app_sdvg.presentation.theme.onTertiaryContainerDarkMediumContrast
import com.example.android_app_sdvg.presentation.theme.onTertiaryContainerLight
import com.example.android_app_sdvg.presentation.theme.onTertiaryContainerLightHighContrast
import com.example.android_app_sdvg.presentation.theme.onTertiaryContainerLightMediumContrast
import com.example.android_app_sdvg.presentation.theme.onTertiaryDark
import com.example.android_app_sdvg.presentation.theme.onTertiaryDarkHighContrast
import com.example.android_app_sdvg.presentation.theme.onTertiaryDarkMediumContrast
import com.example.android_app_sdvg.presentation.theme.onTertiaryLight
import com.example.android_app_sdvg.presentation.theme.onTertiaryLightHighContrast
import com.example.android_app_sdvg.presentation.theme.onTertiaryLightMediumContrast
import com.example.android_app_sdvg.presentation.theme.outlineDark
import com.example.android_app_sdvg.presentation.theme.outlineDarkHighContrast
import com.example.android_app_sdvg.presentation.theme.outlineDarkMediumContrast
import com.example.android_app_sdvg.presentation.theme.outlineLight
import com.example.android_app_sdvg.presentation.theme.outlineLightHighContrast
import com.example.android_app_sdvg.presentation.theme.outlineLightMediumContrast
import com.example.android_app_sdvg.presentation.theme.outlineVariantDark
import com.example.android_app_sdvg.presentation.theme.outlineVariantDarkHighContrast
import com.example.android_app_sdvg.presentation.theme.outlineVariantDarkMediumContrast
import com.example.android_app_sdvg.presentation.theme.outlineVariantLight
import com.example.android_app_sdvg.presentation.theme.outlineVariantLightHighContrast
import com.example.android_app_sdvg.presentation.theme.outlineVariantLightMediumContrast
import com.example.android_app_sdvg.presentation.theme.primaryContainerDark
import com.example.android_app_sdvg.presentation.theme.primaryContainerDarkHighContrast
import com.example.android_app_sdvg.presentation.theme.primaryContainerDarkMediumContrast
import com.example.android_app_sdvg.presentation.theme.primaryContainerLight
import com.example.android_app_sdvg.presentation.theme.primaryContainerLightHighContrast
import com.example.android_app_sdvg.presentation.theme.primaryContainerLightMediumContrast
import com.example.android_app_sdvg.presentation.theme.primaryDark
import com.example.android_app_sdvg.presentation.theme.primaryDarkHighContrast
import com.example.android_app_sdvg.presentation.theme.primaryDarkMediumContrast
import com.example.android_app_sdvg.presentation.theme.primaryLight
import com.example.android_app_sdvg.presentation.theme.primaryLightHighContrast
import com.example.android_app_sdvg.presentation.theme.primaryLightMediumContrast
import com.example.android_app_sdvg.presentation.theme.scrimDark
import com.example.android_app_sdvg.presentation.theme.scrimDarkHighContrast
import com.example.android_app_sdvg.presentation.theme.scrimDarkMediumContrast
import com.example.android_app_sdvg.presentation.theme.scrimLight
import com.example.android_app_sdvg.presentation.theme.scrimLightHighContrast
import com.example.android_app_sdvg.presentation.theme.scrimLightMediumContrast
import com.example.android_app_sdvg.presentation.theme.secondaryContainerDark
import com.example.android_app_sdvg.presentation.theme.secondaryContainerDarkHighContrast
import com.example.android_app_sdvg.presentation.theme.secondaryContainerDarkMediumContrast
import com.example.android_app_sdvg.presentation.theme.secondaryContainerLight
import com.example.android_app_sdvg.presentation.theme.secondaryContainerLightHighContrast
import com.example.android_app_sdvg.presentation.theme.secondaryContainerLightMediumContrast
import com.example.android_app_sdvg.presentation.theme.secondaryDark
import com.example.android_app_sdvg.presentation.theme.secondaryDarkHighContrast
import com.example.android_app_sdvg.presentation.theme.secondaryDarkMediumContrast
import com.example.android_app_sdvg.presentation.theme.secondaryLight
import com.example.android_app_sdvg.presentation.theme.secondaryLightHighContrast
import com.example.android_app_sdvg.presentation.theme.secondaryLightMediumContrast
import com.example.android_app_sdvg.presentation.theme.surfaceBrightDark
import com.example.android_app_sdvg.presentation.theme.surfaceBrightDarkHighContrast
import com.example.android_app_sdvg.presentation.theme.surfaceBrightDarkMediumContrast
import com.example.android_app_sdvg.presentation.theme.surfaceBrightLight
import com.example.android_app_sdvg.presentation.theme.surfaceBrightLightHighContrast
import com.example.android_app_sdvg.presentation.theme.surfaceBrightLightMediumContrast
import com.example.android_app_sdvg.presentation.theme.surfaceContainerDark
import com.example.android_app_sdvg.presentation.theme.surfaceContainerDarkHighContrast
import com.example.android_app_sdvg.presentation.theme.surfaceContainerDarkMediumContrast
import com.example.android_app_sdvg.presentation.theme.surfaceContainerHighDark
import com.example.android_app_sdvg.presentation.theme.surfaceContainerHighDarkHighContrast
import com.example.android_app_sdvg.presentation.theme.surfaceContainerHighDarkMediumContrast
import com.example.android_app_sdvg.presentation.theme.surfaceContainerHighLight
import com.example.android_app_sdvg.presentation.theme.surfaceContainerHighLightHighContrast
import com.example.android_app_sdvg.presentation.theme.surfaceContainerHighLightMediumContrast
import com.example.android_app_sdvg.presentation.theme.surfaceContainerHighestDark
import com.example.android_app_sdvg.presentation.theme.surfaceContainerHighestDarkHighContrast
import com.example.android_app_sdvg.presentation.theme.surfaceContainerHighestDarkMediumContrast
import com.example.android_app_sdvg.presentation.theme.surfaceContainerHighestLight
import com.example.android_app_sdvg.presentation.theme.surfaceContainerHighestLightHighContrast
import com.example.android_app_sdvg.presentation.theme.surfaceContainerHighestLightMediumContrast
import com.example.android_app_sdvg.presentation.theme.surfaceContainerLight
import com.example.android_app_sdvg.presentation.theme.surfaceContainerLightHighContrast
import com.example.android_app_sdvg.presentation.theme.surfaceContainerLightMediumContrast
import com.example.android_app_sdvg.presentation.theme.surfaceContainerLowDark
import com.example.android_app_sdvg.presentation.theme.surfaceContainerLowDarkHighContrast
import com.example.android_app_sdvg.presentation.theme.surfaceContainerLowDarkMediumContrast
import com.example.android_app_sdvg.presentation.theme.surfaceContainerLowLight
import com.example.android_app_sdvg.presentation.theme.surfaceContainerLowLightHighContrast
import com.example.android_app_sdvg.presentation.theme.surfaceContainerLowLightMediumContrast
import com.example.android_app_sdvg.presentation.theme.surfaceContainerLowestDark
import com.example.android_app_sdvg.presentation.theme.surfaceContainerLowestDarkHighContrast
import com.example.android_app_sdvg.presentation.theme.surfaceContainerLowestDarkMediumContrast
import com.example.android_app_sdvg.presentation.theme.surfaceContainerLowestLight
import com.example.android_app_sdvg.presentation.theme.surfaceContainerLowestLightHighContrast
import com.example.android_app_sdvg.presentation.theme.surfaceContainerLowestLightMediumContrast
import com.example.android_app_sdvg.presentation.theme.surfaceDark
import com.example.android_app_sdvg.presentation.theme.surfaceDarkHighContrast
import com.example.android_app_sdvg.presentation.theme.surfaceDarkMediumContrast
import com.example.android_app_sdvg.presentation.theme.surfaceDimDark
import com.example.android_app_sdvg.presentation.theme.surfaceDimDarkHighContrast
import com.example.android_app_sdvg.presentation.theme.surfaceDimDarkMediumContrast
import com.example.android_app_sdvg.presentation.theme.surfaceDimLight
import com.example.android_app_sdvg.presentation.theme.surfaceDimLightHighContrast
import com.example.android_app_sdvg.presentation.theme.surfaceDimLightMediumContrast
import com.example.android_app_sdvg.presentation.theme.surfaceLight
import com.example.android_app_sdvg.presentation.theme.surfaceLightHighContrast
import com.example.android_app_sdvg.presentation.theme.surfaceLightMediumContrast
import com.example.android_app_sdvg.presentation.theme.surfaceVariantDark
import com.example.android_app_sdvg.presentation.theme.surfaceVariantDarkHighContrast
import com.example.android_app_sdvg.presentation.theme.surfaceVariantDarkMediumContrast
import com.example.android_app_sdvg.presentation.theme.surfaceVariantLight
import com.example.android_app_sdvg.presentation.theme.surfaceVariantLightHighContrast
import com.example.android_app_sdvg.presentation.theme.surfaceVariantLightMediumContrast
import com.example.android_app_sdvg.presentation.theme.tertiaryContainerDark
import com.example.android_app_sdvg.presentation.theme.tertiaryContainerDarkHighContrast
import com.example.android_app_sdvg.presentation.theme.tertiaryContainerDarkMediumContrast
import com.example.android_app_sdvg.presentation.theme.tertiaryContainerLight
import com.example.android_app_sdvg.presentation.theme.tertiaryContainerLightHighContrast
import com.example.android_app_sdvg.presentation.theme.tertiaryContainerLightMediumContrast
import com.example.android_app_sdvg.presentation.theme.tertiaryDark
import com.example.android_app_sdvg.presentation.theme.tertiaryDarkHighContrast
import com.example.android_app_sdvg.presentation.theme.tertiaryDarkMediumContrast
import com.example.android_app_sdvg.presentation.theme.tertiaryLight
import com.example.android_app_sdvg.presentation.theme.tertiaryLightHighContrast
import com.example.android_app_sdvg.presentation.theme.tertiaryLightMediumContrast

private val lightScheme = lightColorScheme(
    primary = primaryLight,
    onPrimary = onPrimaryLight,
    primaryContainer = primaryContainerLight,
    onPrimaryContainer = onPrimaryContainerLight,
    secondary = secondaryLight,
    onSecondary = onSecondaryLight,
    secondaryContainer = secondaryContainerLight,
    onSecondaryContainer = onSecondaryContainerLight,
    tertiary = tertiaryLight,
    onTertiary = onTertiaryLight,
    tertiaryContainer = tertiaryContainerLight,
    onTertiaryContainer = onTertiaryContainerLight,
    error = errorLight,
    onError = onErrorLight,
    errorContainer = errorContainerLight,
    onErrorContainer = onErrorContainerLight,
    background = backgroundLight,
    onBackground = onBackgroundLight,
    surface = surfaceLight,
    onSurface = onSurfaceLight,
    surfaceVariant = surfaceVariantLight,
    onSurfaceVariant = onSurfaceVariantLight,
    outline = outlineLight,
    outlineVariant = outlineVariantLight,
    scrim = scrimLight,
    inverseSurface = inverseSurfaceLight,
    inverseOnSurface = inverseOnSurfaceLight,
    inversePrimary = inversePrimaryLight,
    surfaceDim = surfaceDimLight,
    surfaceBright = surfaceBrightLight,
    surfaceContainerLowest = surfaceContainerLowestLight,
    surfaceContainerLow = surfaceContainerLowLight,
    surfaceContainer = surfaceContainerLight,
    surfaceContainerHigh = surfaceContainerHighLight,
    surfaceContainerHighest = surfaceContainerHighestLight,
)

private val darkScheme = darkColorScheme(
    primary = primaryDark,
    onPrimary = onPrimaryDark,
    primaryContainer = primaryContainerDark,
    onPrimaryContainer = onPrimaryContainerDark,
    secondary = secondaryDark,
    onSecondary = onSecondaryDark,
    secondaryContainer = secondaryContainerDark,
    onSecondaryContainer = onSecondaryContainerDark,
    tertiary = tertiaryDark,
    onTertiary = onTertiaryDark,
    tertiaryContainer = tertiaryContainerDark,
    onTertiaryContainer = onTertiaryContainerDark,
    error = errorDark,
    onError = onErrorDark,
    errorContainer = errorContainerDark,
    onErrorContainer = onErrorContainerDark,
    background = backgroundDark,
    onBackground = onBackgroundDark,
    surface = surfaceDark,
    onSurface = onSurfaceDark,
    surfaceVariant = surfaceVariantDark,
    onSurfaceVariant = onSurfaceVariantDark,
    outline = outlineDark,
    outlineVariant = outlineVariantDark,
    scrim = scrimDark,
    inverseSurface = inverseSurfaceDark,
    inverseOnSurface = inverseOnSurfaceDark,
    inversePrimary = inversePrimaryDark,
    surfaceDim = surfaceDimDark,
    surfaceBright = surfaceBrightDark,
    surfaceContainerLowest = surfaceContainerLowestDark,
    surfaceContainerLow = surfaceContainerLowDark,
    surfaceContainer = surfaceContainerDark,
    surfaceContainerHigh = surfaceContainerHighDark,
    surfaceContainerHighest = surfaceContainerHighestDark,
)

private val mediumContrastLightColorScheme = lightColorScheme(
    primary = primaryLightMediumContrast,
    onPrimary = onPrimaryLightMediumContrast,
    primaryContainer = primaryContainerLightMediumContrast,
    onPrimaryContainer = onPrimaryContainerLightMediumContrast,
    secondary = secondaryLightMediumContrast,
    onSecondary = onSecondaryLightMediumContrast,
    secondaryContainer = secondaryContainerLightMediumContrast,
    onSecondaryContainer = onSecondaryContainerLightMediumContrast,
    tertiary = tertiaryLightMediumContrast,
    onTertiary = onTertiaryLightMediumContrast,
    tertiaryContainer = tertiaryContainerLightMediumContrast,
    onTertiaryContainer = onTertiaryContainerLightMediumContrast,
    error = errorLightMediumContrast,
    onError = onErrorLightMediumContrast,
    errorContainer = errorContainerLightMediumContrast,
    onErrorContainer = onErrorContainerLightMediumContrast,
    background = backgroundLightMediumContrast,
    onBackground = onBackgroundLightMediumContrast,
    surface = surfaceLightMediumContrast,
    onSurface = onSurfaceLightMediumContrast,
    surfaceVariant = surfaceVariantLightMediumContrast,
    onSurfaceVariant = onSurfaceVariantLightMediumContrast,
    outline = outlineLightMediumContrast,
    outlineVariant = outlineVariantLightMediumContrast,
    scrim = scrimLightMediumContrast,
    inverseSurface = inverseSurfaceLightMediumContrast,
    inverseOnSurface = inverseOnSurfaceLightMediumContrast,
    inversePrimary = inversePrimaryLightMediumContrast,
    surfaceDim = surfaceDimLightMediumContrast,
    surfaceBright = surfaceBrightLightMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestLightMediumContrast,
    surfaceContainerLow = surfaceContainerLowLightMediumContrast,
    surfaceContainer = surfaceContainerLightMediumContrast,
    surfaceContainerHigh = surfaceContainerHighLightMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestLightMediumContrast,
)

private val highContrastLightColorScheme = lightColorScheme(
    primary = primaryLightHighContrast,
    onPrimary = onPrimaryLightHighContrast,
    primaryContainer = primaryContainerLightHighContrast,
    onPrimaryContainer = onPrimaryContainerLightHighContrast,
    secondary = secondaryLightHighContrast,
    onSecondary = onSecondaryLightHighContrast,
    secondaryContainer = secondaryContainerLightHighContrast,
    onSecondaryContainer = onSecondaryContainerLightHighContrast,
    tertiary = tertiaryLightHighContrast,
    onTertiary = onTertiaryLightHighContrast,
    tertiaryContainer = tertiaryContainerLightHighContrast,
    onTertiaryContainer = onTertiaryContainerLightHighContrast,
    error = errorLightHighContrast,
    onError = onErrorLightHighContrast,
    errorContainer = errorContainerLightHighContrast,
    onErrorContainer = onErrorContainerLightHighContrast,
    background = backgroundLightHighContrast,
    onBackground = onBackgroundLightHighContrast,
    surface = surfaceLightHighContrast,
    onSurface = onSurfaceLightHighContrast,
    surfaceVariant = surfaceVariantLightHighContrast,
    onSurfaceVariant = onSurfaceVariantLightHighContrast,
    outline = outlineLightHighContrast,
    outlineVariant = outlineVariantLightHighContrast,
    scrim = scrimLightHighContrast,
    inverseSurface = inverseSurfaceLightHighContrast,
    inverseOnSurface = inverseOnSurfaceLightHighContrast,
    inversePrimary = inversePrimaryLightHighContrast,
    surfaceDim = surfaceDimLightHighContrast,
    surfaceBright = surfaceBrightLightHighContrast,
    surfaceContainerLowest = surfaceContainerLowestLightHighContrast,
    surfaceContainerLow = surfaceContainerLowLightHighContrast,
    surfaceContainer = surfaceContainerLightHighContrast,
    surfaceContainerHigh = surfaceContainerHighLightHighContrast,
    surfaceContainerHighest = surfaceContainerHighestLightHighContrast,
)

private val mediumContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkMediumContrast,
    onPrimary = onPrimaryDarkMediumContrast,
    primaryContainer = primaryContainerDarkMediumContrast,
    onPrimaryContainer = onPrimaryContainerDarkMediumContrast,
    secondary = secondaryDarkMediumContrast,
    onSecondary = onSecondaryDarkMediumContrast,
    secondaryContainer = secondaryContainerDarkMediumContrast,
    onSecondaryContainer = onSecondaryContainerDarkMediumContrast,
    tertiary = tertiaryDarkMediumContrast,
    onTertiary = onTertiaryDarkMediumContrast,
    tertiaryContainer = tertiaryContainerDarkMediumContrast,
    onTertiaryContainer = onTertiaryContainerDarkMediumContrast,
    error = errorDarkMediumContrast,
    onError = onErrorDarkMediumContrast,
    errorContainer = errorContainerDarkMediumContrast,
    onErrorContainer = onErrorContainerDarkMediumContrast,
    background = backgroundDarkMediumContrast,
    onBackground = onBackgroundDarkMediumContrast,
    surface = surfaceDarkMediumContrast,
    onSurface = onSurfaceDarkMediumContrast,
    surfaceVariant = surfaceVariantDarkMediumContrast,
    onSurfaceVariant = onSurfaceVariantDarkMediumContrast,
    outline = outlineDarkMediumContrast,
    outlineVariant = outlineVariantDarkMediumContrast,
    scrim = scrimDarkMediumContrast,
    inverseSurface = inverseSurfaceDarkMediumContrast,
    inverseOnSurface = inverseOnSurfaceDarkMediumContrast,
    inversePrimary = inversePrimaryDarkMediumContrast,
    surfaceDim = surfaceDimDarkMediumContrast,
    surfaceBright = surfaceBrightDarkMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkMediumContrast,
    surfaceContainerLow = surfaceContainerLowDarkMediumContrast,
    surfaceContainer = surfaceContainerDarkMediumContrast,
    surfaceContainerHigh = surfaceContainerHighDarkMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkMediumContrast,
)

private val highContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkHighContrast,
    onPrimary = onPrimaryDarkHighContrast,
    primaryContainer = primaryContainerDarkHighContrast,
    onPrimaryContainer = onPrimaryContainerDarkHighContrast,
    secondary = secondaryDarkHighContrast,
    onSecondary = onSecondaryDarkHighContrast,
    secondaryContainer = secondaryContainerDarkHighContrast,
    onSecondaryContainer = onSecondaryContainerDarkHighContrast,
    tertiary = tertiaryDarkHighContrast,
    onTertiary = onTertiaryDarkHighContrast,
    tertiaryContainer = tertiaryContainerDarkHighContrast,
    onTertiaryContainer = onTertiaryContainerDarkHighContrast,
    error = errorDarkHighContrast,
    onError = onErrorDarkHighContrast,
    errorContainer = errorContainerDarkHighContrast,
    onErrorContainer = onErrorContainerDarkHighContrast,
    background = backgroundDarkHighContrast,
    onBackground = onBackgroundDarkHighContrast,
    surface = surfaceDarkHighContrast,
    onSurface = onSurfaceDarkHighContrast,
    surfaceVariant = surfaceVariantDarkHighContrast,
    onSurfaceVariant = onSurfaceVariantDarkHighContrast,
    outline = outlineDarkHighContrast,
    outlineVariant = outlineVariantDarkHighContrast,
    scrim = scrimDarkHighContrast,
    inverseSurface = inverseSurfaceDarkHighContrast,
    inverseOnSurface = inverseOnSurfaceDarkHighContrast,
    inversePrimary = inversePrimaryDarkHighContrast,
    surfaceDim = surfaceDimDarkHighContrast,
    surfaceBright = surfaceBrightDarkHighContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkHighContrast,
    surfaceContainerLow = surfaceContainerLowDarkHighContrast,
    surfaceContainer = surfaceContainerDarkHighContrast,
    surfaceContainerHigh = surfaceContainerHighDarkHighContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkHighContrast,
)

@Immutable
data class ColorFamily(
    val color: Color,
    val onColor: Color,
    val colorContainer: Color,
    val onColorContainer: Color
)

val unspecified_scheme = ColorFamily(
    Color.Unspecified, Color.Unspecified, Color.Unspecified, Color.Unspecified
)

@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable() () -> Unit
) {
  val colorScheme = when {
      dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
          val context = LocalContext.current
          if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
      }
      
      darkTheme -> darkScheme
      else -> lightScheme
  }

  MaterialTheme(
    colorScheme = colorScheme,
    typography = AppTypography,
    content = content
  )
}

