package com.kamijoucen.kiracenter.client.view

import java.awt.GridLayout
import javax.swing.JButton
import javax.swing.JPanel

class LeftMenuPanel : JPanel()


fun LeftMenuPanel.init(): LeftMenuPanel {
    this.layout = GridLayout(5, 1)
    this.initButton()
    return this
}

private fun LeftMenuPanel.initButton() {
    CButton("主页").also(this::add)
    CButton("待办").also(this::add)
    CButton("笔记").also(this::add)
}