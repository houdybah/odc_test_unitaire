package org.example;

public class Main {



    public static void main(String[] args)
    {
        System.out.println("Hello World");
        SimpleCalculator calculator = new SimpleCalculator();
        int result = calculator.calculateAdd(3,5);
        System.out.println(result);
    }
}
