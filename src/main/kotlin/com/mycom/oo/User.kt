package com.mycom.oo

class User {
    var name: String? = null
        set(value) {
            //backing fields
            field = "Mr/Mrs $value"
        }
        //        get() {
//            return field?.uppercase()
//        }
        //function expression syntax
        //get() = field?.uppercase()
        get() = field?.uppercase()


    var firstName: String? = null
    var lastName: String? = null

    //computed Property syntax
    var fullName: String = ""
        //        get() {
//            return "${this.firstName} ${this.lastName}"
//        }
        get() = "${this.firstName} ${this.lastName}"


    var age: Int? = null
        set(value) {
            //Age must be greater than 18
            if (value?.compareTo(18)!! < 0) {
                throw Exception("Age must be greater than 18")
            } else {
                field = value
            }
        }
}