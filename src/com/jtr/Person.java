package com.jtr;

public class Person {
    public String userName;
    public  int age;
    public char sex;

    public  Person()
    {

    }

    public Person(String name)
    {
        System.out.println(name);
        this.userName=name;
    }

    public  String getUserName(){
        return  this.userName;
    }

    public int getAge(){
        return  this.age;
    }

    public  void setUserName(String name)
    {
        this.userName=name;
    }

    public void  setAge(int age)
    {
        this.age=age;
    }
}


