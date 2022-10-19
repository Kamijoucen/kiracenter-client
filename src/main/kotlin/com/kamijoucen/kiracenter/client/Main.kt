package com.kamijoucen.kiracenter.client

import com.kamijoucen.kiracenter.client.view.CenterFrame
import java.awt.EventQueue

fun main() = EventQueue.invokeLater {
    CenterFrame().also { it.isVisible = true }
}