package com.company;

public class People
{
    private String name;
    private String gender;
    private int height;
    private int weight;

    public People(String name, String gender, int height, int weight)
    {
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    public String Get_name ()
    {
        return this.name;
    }

    public String Get_gender ()
    {
        return this.gender;
    }

    public int Get_height ()
    {
        return this.height;
    }

    public int Get_weight ()
    {
        return this.weight;
    }

    public void Hello (String hi) { System.out.println(hi); }
    public void Bie (String bie) { System.out.println(bie); }
    public void Congratulation (String cong) { System.out.println(cong); }

}
