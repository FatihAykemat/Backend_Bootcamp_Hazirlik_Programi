package com.company;
import  java.util.*;
public class Main {

    public static void main(String[] args) {
	// Fibonacci
        Scanner reader = new Scanner(System.in);
        int n1=0,n2=1,n3,i,n;
        System.out.print("N Sayısını Girin : ");
        n = reader.nextInt();
        System.out.print(n1+" "+n2);

        for(i=2;i<n;++i)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
        System.out.println();
    }
}
