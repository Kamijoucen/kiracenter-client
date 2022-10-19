package com.kamijoucen.kiracenter.client.view

import java.awt.GridLayout
import javax.swing.JPanel

class LeftMenuPanel : JPanel() {
    init {
        initComponent()
    }

    private fun initComponent() {
        this.layout = GridLayout(5, 1)
        CButton("主页").also(this::add)
        CButton("待办").also(this::add)
        CButton("笔记").also(this::add)
    }

}