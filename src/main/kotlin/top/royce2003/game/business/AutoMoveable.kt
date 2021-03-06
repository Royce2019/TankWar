package top.royce2003.game.business

import top.royce2003.game.enums.Direction
import top.royce2003.game.model.View

interface AutoMoveable:View {

    val currentDirection:Direction
    val speed:Int


    fun autoMove()
}