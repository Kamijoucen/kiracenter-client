package com.kamijoucen.kiracenter.client.view

import com.kamijoucen.kiracenter.client.context.KiracenterConfiguration
import com.kamijoucen.kiracenter.client.context.MainPageType
import java.awt.BorderLayout
import javax.swing.JFrame
import javax.swing.JPanel
import javax.swing.WindowConstants

class CenterFrame : JFrame() {

    private val mainPanel: JPanel = JPanel(true).also {
        it.layout = BorderLayout(1, 1)
    }
    init {
        this.initStyle()
        this.initComponent()
        updateMainPage(MainPageType.MAIN_PAGE)
    }

    private fun initStyle() {
        this.size = getRatioSizeByCurrentScreen(75, 75)
        this.defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE
        this.setLocationRelativeTo(null)
    }

    private fun initComponent() {
        this.layout = BorderLayout()
        this.add(this.mainPanel, BorderLayout.CENTER)
        this.add(LeftMenuPanel(), BorderLayout.WEST)
    }

    fun updateMainPage(type : MainPageType) {
        mainPanel.removeAll()
        mainPanel.add(KiracenterConfiguration.getMainPage(type))
        mainPanel.updateUI()
    }

}
