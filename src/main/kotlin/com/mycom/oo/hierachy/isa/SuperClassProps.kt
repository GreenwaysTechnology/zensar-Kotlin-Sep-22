package com.mycom.oo.hierachy.isa

open class Account {
    open fun deposit(): Int {
        return 100
    }
    val accountType:String get() = "Account Type"
}
class SavingsAccount:Account() {
    override fun deposit(): Int {
        return super.deposit() * 1000
    }
    val accType:String get() = "${super.accountType} is Savings Account"

}
fun  main(){
    val sb = SavingsAccount()
    println(sb.deposit())
    println(sb.accType)
}