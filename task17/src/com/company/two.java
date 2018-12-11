package com.company;

import java.util.Scanner;

public class two
{
    public static void rab()
    {
        double a = 5;
        double b = 4;
        double c = 9;
        double s;
        if (a > 5)
        {
            s = a / b - c * 5;
        }
        else if (a < 5)
        {
            s = Math.cos(b) + Math.exp(c);
        }
        else
        {
            s = 12 - a;
        }
        System.out.println("s = " + s);
    }
}