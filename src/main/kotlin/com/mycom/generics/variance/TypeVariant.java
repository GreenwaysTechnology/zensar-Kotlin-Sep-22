package com.mycom.generics.variance;

import java.util.ArrayList;
import java.util.List;

public class TypeVariant {
    public static void main(String[] args) {

        //List of String is not a SubType of List<Object>
        List<String> str = new ArrayList<String>();
        //List<Object> obj= str;

        //Object o = new String();

    }
}
