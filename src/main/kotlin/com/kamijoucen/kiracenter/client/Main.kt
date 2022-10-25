package com.kamijoucen.kiracenter.client

import com.kamijoucen.kiracenter.client.context.KiracenterConfiguration
import com.kamijoucen.kiracenter.client.view.CenterFrame
import java.awt.EventQueue

fun main() = EventQueue.invokeLater {
    val frame = CenterFrame().also { it.isVisible = true }
    KiracenterConfiguration.frame = frame
}