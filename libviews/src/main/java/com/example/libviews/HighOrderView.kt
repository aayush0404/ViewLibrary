package com.example.libviews

data class View(var width: Int, var height: Int, var color: String = "white", var visible: Boolean = true)

fun setDimensions(view: View, width: Int, height: Int) {
    view.width = width
    view.height = height
}

fun setColor(view: View, color: String) {
    view.color = color
}

fun setVisibility(view: View, visible: Boolean) {
    view.visible = visible
}
