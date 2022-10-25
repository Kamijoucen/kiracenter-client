package com.kamijoucen.kiracenter.client.context

import com.kamijoucen.kiracenter.client.view.CenterFrame
import com.kamijoucen.kiracenter.client.view.page.MainPagePanel
import com.kamijoucen.kiracenter.client.view.page.NotePagePanel
import com.kamijoucen.kiracenter.client.view.page.TodoPagePanel
import javax.swing.JPanel

object KiracenterConfiguration {

    private val mainPageList: Map<MainPageType, JPanel> = HashMap<MainPageType, JPanel>().apply {
        this[MainPageType.MAIN_PAGE] = MainPagePanel()
        this[MainPageType.NOTE_PAGE] = NotePagePanel()
        this[MainPageType.TODO_PAGE] = TodoPagePanel()
    }

    fun getMainPage(type: MainPageType) = mainPageList[type]!!

    var frame: CenterFrame? = null
}