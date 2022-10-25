package com.kamijoucen.kiracenter.client.view.page

import java.awt.Color
import java.awt.GridLayout
import javax.swing.JPanel

/**
 * 主页面板
 */
class MainPagePanel : JPanel() {
    init {
        initStyle()
    }

    private fun initStyle() {
        this.layout = GridLayout(1, 1)
        this.background = Color.CYAN
    }

}
