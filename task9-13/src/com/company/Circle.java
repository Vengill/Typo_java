package com.company;

import java.util.Random;
import java.util.Scanner;

public class Circle
{
    private double x; // абсцисса центра
    private double y; // ордината центра
    private double r; // радиус

    public void printCircle()
    {
        System.out.println("Окружность с центром ("+x+";"+y+") и радиусом "+r);
    }
    public void moveCircle(double a, double b)
    {
        x = x + a;
        y = y + b;
    }
    public void zoomCircle(double r)
    {
        this.r = this.r * r;
    }
    public Circle()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Введите координату x центра окружнатси");
        x = scanner.nextInt();
        System.out.println();
        System.out.print("Введите координату y центра окружнатси");
        y = scanner.nextInt();
        System.out.println();
        System.out.print("Введите радиус окружнатси");
        r = scanner.nextInt();
        System.out.println();
    }
    public Circle(double a, double b, double s)
    {
        x = a;
        y = b;
        r = s;
    }
    // метод вычисляющий площадь круга
    private double squareCircle()
    {
        double s = Math.PI * r * r;
        return s;
    }
    // метод проверяющий равны ли окружности по площадям
    public boolean equalsCircle(Circle cir)
    {
        return this.squareCircle() == cir.squareCircle();
    }

    public float lengthCircle ()
    {
        return (float)(2 * Math.PI * r);
    }

    public void randMove ()
    {
        Random r = new Random(System.currentTimeMillis());
        boolean vpis;
        int x;
        int y;
        do
        {
            x = r.nextInt(100) - 99;
            y = r.nextInt(100) - 99;
            vpis = (x + this.r) <= 99 && (x - this.r) >= -99 && (y + this.r) <= 99 && (y - this.r) >= -99;
        }
        while (vpis);
        this.x = x;
        this.y = y;
    }

    static public float rastTwoCenters(Circle circle1, Circle circle2)
    {
        float rast = (float) Math.sqrt(((circle2.x - circle1.x) * (circle2.x - circle1.x)) +
                ((circle2.y - circle1.y) * (circle2.y - circle1.y)));
        return rast;
    }

    static public boolean crossTwoCircles(Circle circle1, Circle circle2)
    {
        float rast = Circle.rastTwoCenters(circle1, circle2);
        if (rast <= (circle1.r + circle2.r)) {
            System.out.println("Пересекаются");
            return (true);
        }
        else {
            System.out.println("Не пересекаются");
            return (false);
        }
    }
}
