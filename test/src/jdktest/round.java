package jdktest;

import java.util.Date;

public class round {
    public static void main(String[] args) {
        double pie = 3.14159265358979;
        double money = 442422113.243423;
        //반올림
        System.out.println(Math.round(pie)); //결과 : 3
        System.out.println(Math.round(pie*100)/100.0); //결과 : 3.14
        System.out.println(Math.round(pie*1000)/1000.0); //결과 : 3.142
        //올림
        System.out.println(Math.ceil(pie)); //결과 : 4.0
        System.out.println(Math.ceil(pie*100)/100.0); //결과 : 3.15
        System.out.println(Math.ceil(pie*1000)/1000.0); //결과 : 3.142
        //버림
        System.out.println(Math.floor(pie)); //결과 : 3.0
        System.out.println(Math.floor(pie*100)/100.0); //결과 : 3.14
        System.out.println(Math.floor(pie*1000)/1000.0); //결과 : 3.141

        System.out.println("------------------------------------------");

        System.out.println(String.format("%.2f", pie)); //결과 : 3.14
        System.out.println(String.format("%.3f", pie)); //결과 : 3.142
        System.out.println(String.format("%,.2f", money)); //결과 : 442,422,113.24

        System.out.println("------------------------------------------");

        System.out.println(String.format("%04d", 30));
        System.out.println(String.format("%, d", 1000000000));
        System.out.println(String.format("I have %.2f bugs to fix.", 44444.444));
        System.out.println(String.format("%tc", new Date() ));
        System.out.println(String.format("%tr", new Date() ));
    }
}
