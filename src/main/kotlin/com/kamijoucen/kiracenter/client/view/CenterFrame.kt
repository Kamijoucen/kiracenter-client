package com.kamijoucen.kiracenter.client.view

import java.awt.BorderLayout
import javax.swing.JFrame
import javax.swing.JPanel
import javax.swing.WindowConstants

class CenterFrame : CenterComponent, JFrame() {

    private val mainPanel: JPanel = JPanel(true)
    init {
        this.initStyle()
        this.initComponent()
    }

    private fun initStyle() {
        this.size = getRatioSizeByCurrentScreen(80, 75)
        this.setLocationRelativeTo(null)
        this.defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE
    }

    private fun initComponent() {
        this.layout = BorderLayout()
        this.add(this.mainPanel)
        this.add(LeftMenuPanel(), BorderLayout.WEST)
    }

}
