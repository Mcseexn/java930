package com.example.test;

public class TestJava {

    private static int age = 10;
    static String name = "lsx";

    public static void main(String[] args) {

        if ("lsx".equals(name)) {
            age = 11;
        } else {
            age = 12;
        }
        System.out.println("年龄为："+age);
    }
}
