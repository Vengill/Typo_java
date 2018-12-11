package com.company;

import java.util.Scanner;

public class two
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        int vichit = a - b;
        int proiz = a * b;
        int delen = a / b;
        int kvada = a * a;
        int kvadb = b * b;
        System.out.println("Сумма: " + sum);
        System.out.println("Вычитание: " + vichit);
        System.out.println("Умножение: " + proiz);
        System.out.println("Деление: " + delen);
        System.out.println("Квадрат первого: " + kvada);
        System.out.println("Квадрат второго: " + kvadb);


        int changesum = sum * sum;
        int changevichit = vichit * vichit;
        int changeproiz = proiz * proiz;
        int changedelen = delen * delen;
        int changekvada = kvada * kvada;
        int changekvadb = kvadb * kvadb;
        System.out.println("Сумма(квадрат): " + changesum);
        System.out.println("Вычитание(квадрат): " + changevichit);
        System.out.println("Умножение(квадрат): " + changeproiz);
        System.out.println("Деление(квадрат): " + changedelen);
        System.out.println("Квадрат первого(квадрат): " + changekvada);
        System.out.println("Квадрат второго(квадрат): " + changekvadb);

        int[] mas1 = {sum, vichit, proiz, delen, kvada, kvadb};
        int[] mas2 = {changesum, changevichit, changeproiz, changedelen, changekvada, changekvadb};

        int[][] masses = {mas1, mas2};

        System.out.println("Введите число от 1 до 5");
        int nom = sc.nextInt();
        System.out.println("Из 1 массива: " + masses[0][nom - 1] + "Из 2 массива" + masses[1][nom - 1]);
    }
}