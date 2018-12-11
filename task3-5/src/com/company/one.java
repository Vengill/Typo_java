package com.company;
import java.util.Scanner;

public class one
{
    public static void main(String[] args)
    {
        int i1 = 1;
        int i2 = 2;
        int i3 = 3;
        int i4 = 4;
        int i5 = 5;

        String[] fio = {"Венгерович Михаил Григориевич", "Дмитрук Олеся Ростиславовна"};
        System.out.println("папа - " + fio[0]);
        System.out.println("мама - " + fio[1]);

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(s);

        int[] mas = new int[5];
        for (int i = 0; i < 5; i++)
        {
            mas[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++)
        {
            System.out.print(mas[i]);
        }

        String s1 = String.valueOf(i1);
        int ii = Integer.parseInt(s1);
        double d = ii;
        int iii = (int)d;
    }
}
