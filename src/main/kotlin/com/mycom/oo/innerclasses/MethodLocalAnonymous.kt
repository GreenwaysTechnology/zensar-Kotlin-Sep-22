package com.mycom.oo.innerclasses

interface MouseAdapterNew {
    fun mouseClicked()
}
class WindowMobile {
    fun addMouseListener(mouseAdapter: MouseAdapterNew) {
        mouseAdapter.mouseClicked()
    }
}


fun main(){
    //method local anonmous inner class
    val window = WindowMobile()

    window.addMouseListener(object : MouseAdapterNew {
        override fun mouseClicked() {
            println("Mouse Clicked")
        }
    })
}