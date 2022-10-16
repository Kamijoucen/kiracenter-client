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
    val btn1 = JButton("aaaa")
    val btn2 = JButton("bbbb")
    this.add(btn1)
    this.add(btn2)
}