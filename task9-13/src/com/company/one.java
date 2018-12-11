package com.company;

public class one
{
    public static void main(String[] args)
    {
        class1 c1 = new class1();
        class2 c2 = new class2();
        int sum = c1.Summ(5, 4);
        int del = c1.Del(5, 4);
        int vichit = c2.Vichit(5, 4);
        int proiz = c2.Proiz(5, 4);
        System.out.println("Вызван метод Summ() из класса class1 " + sum);
        System.out.println("Вызван метод Del() из класса class1 " + del);
        System.out.println("Вызван метод Vichit() из класса class2 " + vichit);
        System.out.println("Вызван метод Proiz() из класса class2 " + proiz);
    }
}
