package com.company;

public class Money
{
    public int inT;
    public int floaT;

    public Money(int i, int f)
    {
        inT = i;
        floaT = f;
    }

    public static Money Summ (Money x, Money y)
    {
        int i = x.inT + y.inT;
        int f = x.floaT + y.floaT;
        if (f >= 100)
        {
            i++;
            f -= 100;
        }
        return (new Money(i, f));
    }

    public static Money Vichit (Money x, Money y)
    {
        int i = x.inT - y.inT;
        int f = x.floaT - y.floaT;
        if (f < 0)
        {
            i--;
            f += 100;
        }
        return (new Money(i, f));
    }

    public static Money Umn (Money x, int y)
    {
        int i = x.inT * y;
        int f = x.floaT * y;
        while (f >= 100)
        {
            i++;
            f -= 100;
        }
        return (new Money(i, f));
    }

    public static Money Umn_drob (Money x, double y)
    {
        int i = (int)(x.inT * y);
        int f = (int)(x.floaT * y);
        while (f >= 100)
        {
            i++;
            f -= 100;
        }
        return (new Money(i, f));
    }

    public static Money Del (Money x, int y)
    {
        int i = x.inT / y;
        int f = x.floaT / y;
        return (new Money(i, f));
    }

    public static Money Del_drob (Money x, double y)
    {
        int i = (int)(x.inT / y);
        int f = (int)(x.floaT / y);
        return (new Money(i, f));
    }

    public String toString()
    {
        return (this.inT + "-" + this.floaT);
    }
}
