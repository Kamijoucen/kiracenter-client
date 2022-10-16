package com.kamijoucen.kiracenter.client.view

import java.awt.Dimension
import java.awt.Toolkit

private fun checkNumberRatioRange(num: Int) {
    if (num <= 0 || num > 100) throw IllegalArgumentException("")
}

fun getRatioSizeByCurrentScreen(widthRatio: Int, heightRatio: Int) =
    getRatioSizeByParentDimension(widthRatio, heightRatio, Toolkit.getDefaultToolkit().screenSize.size)

fun getRatioSizeByParentDimension(widthRatio: Int, heightRatio: Int, prent: Dimension): Dimension {
    checkNumberRatioRange(widthRatio)
    checkNumberRatioRange(heightRatio)
    return Dimension(
        (prent.width * (widthRatio / 100F)).toInt(),
        (prent.height * (heightRatio / 100F)).toInt()
    )
}


