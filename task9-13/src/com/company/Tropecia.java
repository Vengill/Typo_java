package com.company;

public class Tropecia
{
    int x1, x2, x3, x4;
    int y1, y2, y3, y4;

    public Tropecia(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4)
    {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.y4 = y4;
    }

    public static boolean Isit(Tropecia tropecia)
    {
        int len1 = (int) Math.sqrt(((tropecia.x2 - tropecia.x1) * (tropecia.x2 - tropecia.x1)) +
                                    ((tropecia.y2 - tropecia.y1) * (tropecia.y2 - tropecia.y1)));
        int len2 = (int) Math.sqrt(((tropecia.x3 - tropecia.x2) * (tropecia.x3 - tropecia.x2)) +
                                    ((tropecia.y3 - tropecia.y2) * (tropecia.y3 - tropecia.y2)));
        int len3 = (int) Math.sqrt(((tropecia.x4 - tropecia.x3) * (tropecia.x4 - tropecia.x3)) +
                                    ((tropecia.y4 - tropecia.y3) * (tropecia.y4 - tropecia.y3)));
        int len4 = (int) Math.sqrt(((tropecia.x1 - tropecia.x4) * (tropecia.x1 - tropecia.x4)) +
                                    ((tropecia.y1 - tropecia.y4) * (tropecia.y1 - tropecia.y4)));

        if (len1 == len3 && len2 < len4)
            return (true);
        else
            return (false);
    }

    public static void Stor(Tropecia tropecia)
    {

        int len1 = (int) Math.sqrt(((tropecia.x2 - tropecia.x1) * (tropecia.x2 - tropecia.x1)) +
                ((tropecia.y2 - tropecia.y1) * (tropecia.y2 - tropecia.y1)));
        int len2 = (int) Math.sqrt(((tropecia.x3 - tropecia.x2) * (tropecia.x3 - tropecia.x2)) +
                ((tropecia.y3 - tropecia.y2) * (tropecia.y3 - tropecia.y2)));
        int len3 = (int) Math.sqrt(((tropecia.x4 - tropecia.x3) * (tropecia.x4 - tropecia.x3)) +
                ((tropecia.y4 - tropecia.y3) * (tropecia.y4 - tropecia.y3)));
        int len4 = (int) Math.sqrt(((tropecia.x1 - tropecia.x4) * (tropecia.x1 - tropecia.x4)) +
                ((tropecia.y1 - tropecia.y4) * (tropecia.y1 - tropecia.y4)));

        System.out.println("Правый бок: " + len1 + "Верхнее основание: " + len2 + "Левый бок: " + len3 + "Нижнее основоание: " + len4);
    }

    public static void Perim(Tropecia tropecia)
    {
        int len1 = (int) Math.sqrt(((tropecia.x2 - tropecia.x1) * (tropecia.x2 - tropecia.x1)) +
                ((tropecia.y2 - tropecia.y1) * (tropecia.y2 - tropecia.y1)));
        int len2 = (int) Math.sqrt(((tropecia.x3 - tropecia.x2) * (tropecia.x3 - tropecia.x2)) +
                ((tropecia.y3 - tropecia.y2) * (tropecia.y3 - tropecia.y2)));
        int len3 = (int) Math.sqrt(((tropecia.x4 - tropecia.x3) * (tropecia.x4 - tropecia.x3)) +
                ((tropecia.y4 - tropecia.y3) * (tropecia.y4 - tropecia.y3)));
        int len4 = (int) Math.sqrt(((tropecia.x1 - tropecia.x4) * (tropecia.x1 - tropecia.x4)) +
                ((tropecia.y1 - tropecia.y4) * (tropecia.y1 - tropecia.y4)));
        int perim = len1 + len2 + len3 + len4;

        System.out.println("Периметр: " + perim);
    }

    public static int Plosh(Tropecia tropecia)
    {
        int len2 = (int) Math.sqrt(((tropecia.x3 - tropecia.x2) * (tropecia.x3 - tropecia.x2)) +
                ((tropecia.y3 - tropecia.y2) * (tropecia.y3 - tropecia.y2)));
        int len4 = (int) Math.sqrt(((tropecia.x1 - tropecia.x4) * (tropecia.x1 - tropecia.x4)) +
                ((tropecia.y1 - tropecia.y4) * (tropecia.y1 - tropecia.y4)));
        int h = (int) Math.sqrt(((tropecia.y2 - tropecia.y1) * (tropecia.y2 - tropecia.y1)));

        int plosh = ((len2 + len4) / 2) * h;

        return plosh;
    }
}
