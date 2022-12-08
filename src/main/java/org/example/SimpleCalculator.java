package org.example;

public class SimpleCalculator {

    public int calculateAdd(int num1, int num2)
    {
        return num1 + num2;
    }

    public int calculateSoustract(int num1, int num2)
    {
        return num1 - num2;
    }

    public int calculateMultipli(int num1, int num2)
    {
        return num1 * num2;
    }

    public boolean isEven(int value)
    {
        if(value % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
