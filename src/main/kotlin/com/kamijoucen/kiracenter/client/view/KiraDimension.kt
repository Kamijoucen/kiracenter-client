package com.kamijoucen.kiracenter.client.view

import java.awt.Dimension
import java.awt.Toolkit

class KiraDimension(
    ratioWidth: Int,
    fixedWidth: Boolean,
    ratioHeight: Int,
    fixedHeight: Boolean,
    parent: Dimension = Toolkit.getDefaultToolkit().screenSize.size
) {
    val size: Dimension
    init {
        val realWidth = when (fixedWidth) {
            true -> ratioWidth
            else -> getRatioValue(parent.width, ratioWidth)
        }
        val realHeight = when (fixedHeight) {
            true -> ratioHeight
            else -> getRatioValue(parent.height, ratioHeight)
        }
        this.size = Dimension(realWidth, realHeight)
    }
}