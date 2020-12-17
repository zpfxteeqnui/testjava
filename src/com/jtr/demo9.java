package com.jtr;

public class demo9 {

    public static void main(String[] args) {

      String[][] str  = new String[3][];

        str[0]=new String[]{"糖"};
        str[1]=new String[]{"菜"};
        str[2]=new String[]{"玩"};

        Person p = new Person("zpf");
        //System.out.println(p);

        String s = p.getUserName();
        System.out.println(s);

    }
}
