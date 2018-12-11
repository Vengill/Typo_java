package com.company;

public class Main
{
    public static void main(String[] args) throws IndexLowerZeroException
    {
        int[] mas = {1, 2, 3, 4, 5};

        sum(1999999999, 199999999);
        multiplication(1999999999, 10);
        division(1999999999, 0);
        array(mas, 0);
    }

    private static void sum(int x, int y) throws IllegalArgumentException
    {
        try
        {
            long a = (long)x + y;
            if (a > Integer.MAX_VALUE)
            {
                throw new IllegalArgumentException ("Недопутимое значение");
            }
            else
            {
                System.out.println("Сумма = " + a);
            }
        }
        catch (IllegalArgumentException  e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("Код блока finally, он всегда выполняется в конце конструкции. Конец работы try-catch");
        }
    }

    private static void multiplication(int x, int y) throws IllegalArgumentException
    {
        try
        {
            double a = (double) x * y;
            if (a > Integer.MAX_VALUE)
            {
                throw new IllegalArgumentException ("Недопутимое значение");
            }
            else
            {
                int b = (int)a;
                System.out.println("Произведение = " + b);
            }
        }
        catch (IllegalArgumentException  e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("Код блока finally, он всегда выполняется в конце конструкции. Конец работы try-catch");
        }
    }

    private static void division(int x, int y) throws ArithmeticException
    {
        try
        {
            int a = x / y;
            System.out.println("Частное = " + a);
        }
        catch (ArithmeticException e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("Код блока finally, он всегда выполняется в конце конструкции. Конец работы try-catch");
        }
    }

    private static void array(int[] mas, int n) throws IndexLowerZeroException, ArrayIndexOutOfBoundsException
    {
        try
        {
            if (n < 1)
                throw new IllegalArgumentException("n меньше 1");
            for (int i = 0; i < n; i++)
            {
                System.out.print(mas[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println();
            System.out.println("Обращение по недопустимому индексу массива");
        }
        catch (IllegalArgumentException e)
        {
            throw new IndexLowerZeroException(e);
        }
        catch (Exception e)
        {
            System.out.println("Не предусмотренная ошибка");
        }
        finally
        {
            System.out.println("Код блока finally, он всегда выполняется в конце конструкции. Конец работы try-catch");
        }
    }
}

class IndexLowerZeroException extends Exception
{
    public IndexLowerZeroException(Throwable e)
    {
        initCause(e);
    }
}