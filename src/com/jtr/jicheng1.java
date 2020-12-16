package com.jtr;

class User
{

    public  String userName;

    public  static  int gold;
}

public class jicheng {

    public static  void  main (String[] args)
    {
        System.out.println(User.gold);

        User user = new User();
        String name = user.userName;
        int count = user.gold;

        System.out.println(name+"---"+count);

        user.userName="zpf";
        user.gold=110;

        System.out.println(user.userName+"---"+user.gold);
    }

}
