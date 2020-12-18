package com.jtr1107;

import java.util.HashSet;

public class Demo01 {
    public  static  void  main(String[] args) {

        HashSet<String> books = new HashSet<>();

        books.add("a");
        books.add("b");
        books.add("c");
        books.add("d");

        books.forEach(p-> System.out.println(p));
    }
}
