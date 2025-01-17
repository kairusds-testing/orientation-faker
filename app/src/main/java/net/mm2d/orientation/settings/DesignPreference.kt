/*
 * Copyright (c) 2021 大前良介 (OHMAE Ryosuke)
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/MIT
 */

package net.mm2d.orientation.settings

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import net.mm2d.orientation.control.Orientation

@Parcelize
data class DesignPreference(
    val foreground: Int,
    val background: Int,
    val foregroundSelected: Int,
    val backgroundSelected: Int,
    val base: Int?,
    val iconize: Boolean,
    val shape: IconShape,
    val shouldShowSettings: Boolean,
    val orientations: List<Orientation>
) : Parcelable
