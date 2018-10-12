package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber x = new ComplexNumber(3, 2);
        ComplexNumber y = new ComplexNumber(2, 8);
        System.out.println(x);
        System.out.println(y);
        System.out.println(x.add(y));
        System.out.println(x.mult(y));
    }
}
