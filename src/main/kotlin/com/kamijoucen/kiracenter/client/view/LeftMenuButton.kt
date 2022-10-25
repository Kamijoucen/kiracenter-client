package com.kamijoucen.kiracenter.client.view

import com.kamijoucen.kiracenter.client.context.KiracenterConfiguration
import com.kamijoucen.kiracenter.client.context.MainPageType
import javax.swing.JButton

class LeftMenuButton(text: String, private val type: MainPageType) : JButton(text){
    init {
        initListener()
    }

    private fun initListener() {
        this.addActionListener { KiracenterConfiguration.frame!!.updateMainPage(type) }
    }

}