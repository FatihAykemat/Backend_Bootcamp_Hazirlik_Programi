package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sayi = new Scanner(System.in);
        int a,b;
        double c,cevre,alan,u;


        System.out.print("a kenarını giriniz : ");
        a=sayi.nextInt();
        System.out.print("b kenarını giriniz : ");
        b=sayi.nextInt();

        c= Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs : " + c);

        cevre=a+b+c;
        System.out.println("Uçgenin Cevresi : " + cevre);

        u = (a + b + c) / 2;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Ucgenin Alani  : " + alan);



    }
}
