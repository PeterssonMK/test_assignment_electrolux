package com.example.electrolux_assignment.presentation.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class Spacing(
    val default: Dp = 0.dp,
    val xsmall: Dp = 4.dp,
    val medium: Dp = 16.dp
)

val LocalSpacing = compositionLocalOf { Spacing() }

val MaterialTheme.spacing: Spacing
    @Composable @ReadOnlyComposable get() = LocalSpacing.current