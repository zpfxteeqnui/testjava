package com.jtr;

public class father {
    public  String userName;
    public double money;

    public  father(String strname, double dbmoney)
    {
        this.userName=strname;
        this.money=dbmoney;
    }
}

public  class  demochild extends  father
{
    public String work;

    public  demochild(String strwork, String strname, double dbmoney)
    {
        super(strname,dbmoney);
        this.work=strwork;
    }
}
