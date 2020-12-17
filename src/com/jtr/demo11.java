package com.jtr;

class  Animal2{
    public  double weight;
    public void  sayHello(){
        System.out.println("我是一个动特：我重："+weight);
    }
    public  void  bark(){
        System.out.println("父，咬");
    }
}

class  Dog extends  Animal2
{
    public  void  sayHello(){
        System.out.println("我是banban"+this.weight);
    }
    public  void  bark(){
        System.out.println("狗，咬");
    }
}

public class demo11 extends  Animal2{

    public  static  void  main(String[] args)
    {
        Dog d = new Dog();
        d.bark();
    }

}
