package com.company;

public class eleven
{
    public static void main(String[] args)
    {
        People p1 = new People("Mimi", "female", 155, 50);
        Old_people p2 = new Old_people("Arnold", "male", 185, 80, 50, 50000);
        System.out.print("Имя " + p1.Get_name());
        System.out.print(" Пол " + p1.Get_gender());
        System.out.print(" Рост " + p1.Get_height());
        System.out.println(" Вес " + p1.Get_weight());

        System.out.print("Имя " + p2.Get_name());
        System.out.print(" Пол " + p2.Get_gender());
        System.out.print(" Рост " + p2.Get_height());
        System.out.print(" Вес " + p2.Get_weight());
        System.out.print(" Возрост " + p2.getAge());
        System.out.println(" Пенсия " + p2.getPay());
    }
}
