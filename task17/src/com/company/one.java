package com.company;

import java.awt.*;
import java.awt.List;
import java.io.*;
import java.util.*;

public class one
{
    public static void main(String[] args) throws IOException {
        //1
        ArrayList file = new ArrayList();
        FileReader fr = new FileReader( "C:\\Users\\user\\Desktop\\Практика\\Java\\1.txt");
        Scanner scan = new Scanner(fr);

        while (scan.hasNextLine()) {
            file.add(scan.nextLine());
        }
        fr.close();
        FileWriter fw = new FileWriter("C:\\Users\\user\\Desktop\\Практика\\Java\\1.txt");
        for (int i = file.size() - 1; i >= 0; i--)
        {
            System.out.println(file.get(i));
            fw.write(file.get(i).toString() + "\n");
        }
        fw.close();
        //2
        scan = new Scanner(System.in);
        int kar = scan.nextInt();
        Stack<Integer> stack = new Stack<>();
        stack.push(kar / 100);
        int kar2 = kar % 100;
        stack.push(kar2 / 10);
        stack.push(kar % 10);
        for (int i = 0; i < 3; i++)
        {
            System.out.println(stack.pop());
        }
        //3
        ArrayList myau = new ArrayList();
        FileReader fr2 = new FileReader( "C:\\Users\\user\\Desktop\\Практика\\Java\\1.txt");
        Scanner scan2 = new Scanner(fr2);
        int i = 0;
        while (scan2.hasNextLine())
        {
            myau.add(i, scan2.nextLine());
            i++;
        }
        fr2.close();
        for (Iterator it = myau.iterator(); it.hasNext(); )
        {
            String s = (String)it.next();
            System.out.println("Item:" + s);
        }
        //4
    }
}
