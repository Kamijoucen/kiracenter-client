package com.kamijoucen.kiracenter.client.view

import com.kamijoucen.kiracenter.client.context.MainPageType
import java.awt.GridLayout
import javax.swing.JPanel

class LeftMenuPanel : JPanel() {
    init {
        initComponent()
    }

    private fun initComponent() {
        this.layout = GridLayout(5, 1)
        LeftMenuButton("主页", MainPageType.MAIN_PAGE).also(this::add)
        LeftMenuButton("待办", MainPageType.TODO_PAGE).also(this::add)
        LeftMenuButton("笔记", MainPageType.NOTE_PAGE).also(this::add)
    }

}