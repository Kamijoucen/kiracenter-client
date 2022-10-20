package com.kamijoucen.kiracenter.client.view

import java.awt.Color
import javax.swing.JPanel

/**
 * 主页面板
 */
class MainPagePanel : JPanel() {
    init {
        initStyle()
    }

    private fun initStyle() {
        this.background = Color.CYAN
    }

}
