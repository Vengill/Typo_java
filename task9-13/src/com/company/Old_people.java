package com.company;

public class Old_people extends People
{
    private int age;
    private int pay;

    public Old_people(String name, String gender, int height, int weight, int age, int pay) {
        super(name, gender, height, weight);
        this.age = age;
        this.pay = pay;
    }

    public Old_people(String name, String gender, int height, int weight) {
        super(name, gender, height, weight);
    }

    public int getAge() {
        return age;
    }

    public int getPay() {
        return pay;
    }
}
