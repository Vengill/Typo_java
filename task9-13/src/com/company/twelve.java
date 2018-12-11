package com.company;

public class twelve
{
    public static void main(String[] args)
    {
        Fraction one = new Fraction(4,5);
        Fraction two = new Fraction(5,4);

        Fraction summ = Fraction.Summ(one, two);
        Fraction vichit = Fraction.Vichit(one, two);
        Fraction umnog = Fraction.Umn(one, two);
        System.out.println(summ.inT + "." + summ.floaT);
        System.out.println(vichit.inT + "." + vichit.floaT);
        System.out.println(umnog.inT + "." + umnog.floaT);
        Fraction.Srav(one, two);

        Money one2 = new Money(4,5);
        Money two2 = new Money(5,4);

        Money summ2 = Money.Summ(one2, two2);
        Money vichit2 = Money.Vichit(one2, two2);
        Money umnog2 = Money.Umn(one2, 3);
        Money del2 = Money.Del(one2, 3);
        Money umnog_f2 = Money.Umn_drob(one2, 3);
        Money del_f2 = Money.Del_drob(one2, 3);
        System.out.println(summ2.inT + "." + summ2.floaT);
        System.out.println(vichit2.inT + "." + vichit2.floaT);
        System.out.println(umnog2.inT + "." + umnog2.floaT);
        System.out.println(del2.inT + "." + del2.floaT);
        System.out.println(umnog_f2.inT + "." + umnog_f2.floaT);
        System.out.println(del_f2.inT + "." + del_f2.floaT);

        int sred = 0;
        int[] mas = new int[10];
        for (int i = 0; i < 10; i++)
        {
            Tropecia t = new Tropecia( (int)(Math.random() * 10),(int)(Math.random() * 10),(int)(Math.random() * 10),
                    (int)(Math.random() * 10),(int)(Math.random() * 10),(int)(Math.random() * 10),
                    (int)(Math.random() * 10),(int)(Math.random() * 10));
            int pl = Tropecia.Plosh(t);
            mas[i] = pl;
            sred += pl;
        }
        sred = sred / 10;
        System.out.println(sred);
        for (int i = 0; i < 10; i++)
        {
            if (sred < mas[i])
                System.out.println("Больше среднего " + i + ": " + mas[i]);
        }
    }
}
