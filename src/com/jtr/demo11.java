package com.jtr;

class  Animal{
    public  double weight;
    public void  sayHello(){
        System.out.println("我是一个动特：我重："+weight);
    }
}

class  Banban extends  Animal
{
    public  void  sayHello(){
        System.out.println("我是banban"+this.weight);
    }
}

public class demo10 extends  Animal {

    public  static  void  main(String[] args)
    {
        Animal a = new Banban();
        a.weight=200.0;
        a.sayHello();
    }

}
