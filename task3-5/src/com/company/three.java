package com.company;

import java.util.Scanner;
import java.math.*;

public class three
{
    public static void main(String[] args)
    {
        kar1();
        kar2();
        kar3();
        kar4();
    }

    public static void kar1()
    {
        Scanner sc = new Scanner(System.in);
        float f = sc.nextFloat();
        if (f % 1 != 0)
        {
            System.out.println("НЕ ВЕРНО УУУУУУУУ");
        }
        else if (f % 2 == 0)
        {
            System.out.println("четное");
        }
        else
        {
            System.out.println("не четное");
        }
    }

    public static void kar2()
    {
        Scanner sc = new Scanner(System.in);
        float f1 = sc.nextFloat();
        float f2 = sc.nextFloat();
        if (f1 % 1 != 0)
        {
            System.out.println("НЕ ВЕРНО УУУУУУУУ(1)");
        }
        else if (f2 % 1 != 0)
        {
            System.out.println("НЕ ВЕРНО УУУУУУУУ(2)");
        }
        else
        {
            float sum = f1 + f2;
            System.out.println(sum);
        }
    }

    public static void kar3()
    {
        Scanner sc = new Scanner(System.in);
        float f1 = sc.nextFloat();
        float f2 = sc.nextFloat();
        float f3 = sc.nextFloat();
        if (Math.abs(f1) > Math.abs(f2) && Math.abs(f1) > Math.abs(f3))
        {
            System.out.println("Первое больше");
        }
        else if (Math.abs(f2) > Math.abs(f1) && Math.abs(f2) > Math.abs(f3))
        {
            System.out.println("Второе больше");
        }
        else if (Math.abs(f3) > Math.abs(f1) && Math.abs(f3) > Math.abs(f2))
        {
            System.out.println("Третье больше");
        }
        else System.out.println("Равны");
    }

    public static void kar4()
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.toLowerCase();
        StringBuilder reverses = new StringBuilder(s);
        reverses = reverses.reverse();
        String s2 = reverses.toString();
        if (s.equals(s2))
        {
            System.out.println("Полендром");
        }
        else System.out.println("Не полендром");
    }
}
