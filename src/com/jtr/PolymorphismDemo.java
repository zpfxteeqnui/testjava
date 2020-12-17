package com.jtr;

  class  Father{
    public  int bookNumber=10;

    public void  FatherFn()
    {
        System.out.println("father 的 方法");
    }

    public void  read(){
        System.out.println("父类 read");
    }
}

public class PolymorphismDemo extends  Father{
public String bookName="Java";

    @Override
    public void read() {
        System.out.println("子类 read");
    }

    public void  childFn()
    {
        System.out.println("子类 child");
    }

    public  static  void  main (String[] args)
    {
        //Father f = new Father();
        //System.out.println(f.bookNumber);
        //f.FatherFn();
        //f.read();

        //PolymorphismDemo p =new PolymorphismDemo();
        //p.FatherFn();
        //p.read();

        Father ff = new PolymorphismDemo();
        System.out.println(((PolymorphismDemo) ff).bookName);
        ff.FatherFn();
        ff.read();
        ((PolymorphismDemo) ff).childFn();

    }
}


