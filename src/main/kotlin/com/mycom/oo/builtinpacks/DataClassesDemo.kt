package com.mycom.oo.builtinpacks

data class User(val name:String,val age:Int)
fun main(){
    var user = User("Subramanian",18);
    println(user.toString())
    
}