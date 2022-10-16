package com.kamijoucen.kiracenter.client

import com.kamijoucen.kiracenter.client.view.CenterFrame
import com.kamijoucen.kiracenter.client.view.LeftMenuPanel
import com.kamijoucen.kiracenter.client.view.getRatioSizeByCurrentScreen
import com.kamijoucen.kiracenter.client.view.init
import java.awt.BorderLayout
import javax.swing.JPanel
import javax.swing.WindowConstants


fun start() {
    val panel = JPanel();
    val frame = CenterFrame().also {
        it.size = getRatioSizeByCurrentScreen(80, 75)
        it.setLocationRelativeTo(null)
        it.defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE
        it.add(panel)
    }
    panel.layout = BorderLayout()
    panel.add(LeftMenuPanel().init(), BorderLayout.WEST)

    frame.isVisible = true
}