package com.kamijoucen.kiracenter.client.context

import com.kamijoucen.kiracenter.client.view.MainPagePanel
import javax.swing.JPanel

object KiracenterConfiguration {

    private val mainPageList: Map<MainPageType, JPanel> = HashMap<MainPageType, JPanel>().apply {
        this[MainPageType.MAIN_PAGE] = MainPagePanel();
    }

    fun getMainPage(type: MainPageType) = mainPageList[type]!!

}