package com.jtr;

public class demo5 {

    private String userName;

    public  demo5(){
        System.out.println("无参数构造器");
    }

    public  demo5(String name){
        System.out.println("有参数构造器");
        this.userName=name;
    }

    public  static  void  main(String[] args)
    {
       demo5 d = new demo5("zpf");
        System.out.println(d.userName);
    }
}
