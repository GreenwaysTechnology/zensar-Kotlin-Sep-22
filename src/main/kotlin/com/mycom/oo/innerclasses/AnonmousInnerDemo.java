package com.mycom.oo.innerclasses;

import java.awt.event.MouseAdapter;

interface Calculator {
    void add();

    void substract();

    void multiply();
}

//in order to implement
class Math implements Calculator {
    @Override
    public void add() {
        System.out.println("add");
    }

    @Override
    public void substract() {
        System.out.println("substract");
    }

    @Override
    public void multiply() {
        System.out.println("multiply");
    }
}

interface MyMouseAdapter {
    void mouseClicked();
}

class Window {
    public void addMouseListener(MyMouseAdapter mouseAdapter) {
        mouseAdapter.mouseClicked();
    }
}

public class AnonmousInnerDemo {
    public static void main(String[] args) {
        Calculator calculator = new Math();
        calculator.add();
        calculator.multiply();
        calculator.substract();

        //Anonymous inner class pattern , reduces the explicit class declaration
        Calculator mycalculator = new Calculator() {
            @Override
            public void add() {
                System.out.println("add");
            }

            @Override
            public void substract() {
                System.out.println("substract");
            }

            @Override
            public void multiply() {
                System.out.println("multiply");
            }
        };
        mycalculator.substract();
        mycalculator.add();
        mycalculator.multiply();

        //method local anonymous inner class
        Window window = new Window();

        window.addMouseListener(new MyMouseAdapter() {
            @Override
            public void mouseClicked() {
                System.out.println("Mouse Clicked");
            }
        });


    }
}
