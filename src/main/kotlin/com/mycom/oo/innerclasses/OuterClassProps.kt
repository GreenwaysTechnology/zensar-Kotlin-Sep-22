package com.mycom.oo.innerclasses

class Comments {
    //outer class Prop
    private val commentType: String = "Like"

    inner class Like {
        fun getCommentType() = commentType
    }

}

fun main() {
    //println(Comments.Like().get)
    //create instance of outer through which we have to access the inner
    println(Comments().Like().getCommentType())
}