package com.jtr;

class Hello{
    //
    static
    {
        System.out.println("Hello 类的静太初始化");
    }

    {
        System.out.println("Hello 类实例初始化");
    }

    public Hello()
    {
        System.out.println("构造器");
    }
}


   class ABC extends  Hello{

    static {
        System.out.println("ABC 静态块");
    }

    {
        System.out.println("ABC 实例块");
    }

    public ABC()
    {
        super();
        System.out.println("ABC 构造器");
    }

    public ABC(String message)
    {
        this();
        System.out.println("ABC 有参构造器"+message);
    }

}
 class  BBB extends  ABC
{
    static {
        System.out.println("BBB 静态块");
    }

    {
        System.out.println("BBB 实例块");
    }

    public BBB()
    {
        super("zpf");
        System.out.println("BBB 构造器");
    }


}

public  class  InstanceOFDemo{
    public static void  main(String[] args)
    {
        new BBB();
        System.out.println("------------------");
        new BBB();
        System.out.println("----------");
    }
}