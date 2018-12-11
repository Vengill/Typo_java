package com.company;

import java.util.Scanner;

public class three
{
    public static void main(String[] args)
    {
        int prog, user, kol = 0;
        do
        {
            if (Math.random() > 0.5)
                prog = -(int)(Math.random() * 10) - 1;
            else
                prog = (int)(Math.random() * 10) + 1;
        }
        while (prog == 0);
        System.out.println("Я загадала число от -10 до 10, отгадайте его.");
        System.out.print("Вводите ваше число: ");
        Scanner input = new Scanner(System.in);
        if( input.hasNextInt() )
        {
            do {
                kol++;
                user = input.nextInt();
                if(user == prog)
                {
                    System.out.println("Вы угадали! Кол-во попыток: " + kol);
                }
                else
                {
                    if (user >= -10 && user != 0 && user <= 10)
                    {
                        System.out.print("Вы не угадали! ");
                        if( prog < user )
                        {
                            if (prog < 0 && user > 0)
                                System.out.print("Число отрицптельное. ");

                            System.out.println("Моё число меньше.");
                        }
                        else
                        {
                            if (prog > 0 && user < 0)
                                System.out.print("Число положительное. ");

                            System.out.println("Моё число больше.");
                        }
                    }
                    else
                    {
                        System.out.println("Ваше число вообще не из нужного отрезка!");
                    }
                }
            } while( user != prog );
        }
        else
        {
            System.out.println("Ошибка. Вы не ввели целое число!");
        }
        System.out.println("До свиданья!");

    }
}
