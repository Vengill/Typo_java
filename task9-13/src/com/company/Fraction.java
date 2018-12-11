package com.company;

public class Fraction
{
    public int inT;
    public int floaT;

    public Fraction(int i, int f)
    {
        inT = i;
        floaT = f;
    }

    public static Fraction Summ (Fraction x, Fraction y)
    {
        int i = x.inT + y.inT;
        int f = x.floaT + y.floaT;
        if (f >= 100)
        {
            i++;
            f -= 100;
        }
        return (new Fraction(i, f));
    }

    public static Fraction Vichit (Fraction x, Fraction y)
    {
        int i = x.inT - y.inT;
        int f = x.floaT - y.floaT;
        if (f < 0)
        {
            i--;
            f += 100;
        }
        return (new Fraction(i, f));
    }

    public static Fraction Umn (Fraction x, Fraction y)
    {
        int i = x.inT * y.inT;
        int f = x.floaT * y.floaT;
        while (f >= 100)
        {
            i++;
            f -= 100;
        }
        return (new Fraction(i, f));
    }

    public static void Srav (Fraction x, Fraction y)
    {
        if (x.inT > y.floaT)
            System.out.println("первый больше");
        else if (x.inT == y.inT)
        {
            if (x.floaT > y.floaT)
                System.out.println("первый больше");
            else if (x.floaT == y.floaT)
                System.out.println("равны");
            else
                System.out.println("второй больше");
        }
        else
            System.out.println("второй больше");
    }
}
