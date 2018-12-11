package com.company;

public class therteen
{
    public static void main(String[] args)
    {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2,2,2);
        System.out.println("Растояние от центра 1 круга до второго: " + Circle.rastTwoCenters(circle1, circle2));

        Circle.crossTwoCircles(circle1, circle2);

        circle1.randMove();
        circle1.printCircle();

        System.out.println("Длина окружности равна: " + circle1.lengthCircle());
    }
}
