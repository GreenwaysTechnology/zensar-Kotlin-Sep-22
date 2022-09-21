package com.mycom.nullrefdemo;

public class NullDemo {
    public static void main(String[] args) {

        //during compile time the compiler checks always left side
        //during runtime  the runtime checks always right side
        String str = null;
        System.out.println(str.length());
      //  System.out.println(str.doStuff());
    }
}
