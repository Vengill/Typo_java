package com.company;
import java.util.Scanner;

public class one
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        float m = sc.nextFloat();
        if (Math.abs(n - 10) > Math.abs(m - 10))
        {
            System.out.println("Второе число ближе");
        }
        else if (Math.abs(n - 10) < Math.abs(m - 10))
        {
            System.out.println("Первое число ближе");
        }
        else
            System.out.println("Равно");
    }
}
