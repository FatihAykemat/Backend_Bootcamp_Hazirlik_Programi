package com.company;
import  java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner inp=new Scanner(System.in);
        int maks=0;
        int min=0;
        int n;
        System.out.print("kaç adet sayı gireceksiniz : ");
        n = inp.nextInt();

        for (int i=1; i<=n; i++)
        {
            System.out.println(i+". sayiyi giriniz: ");
            int sayi = inp.nextInt();

            if (i==1)
            {
                maks=sayi;
                min=sayi;
            }

            if (sayi>maks)
                maks=sayi;

            if (sayi<min)
                min=sayi;
        }

        System.out.println("girdiginiz "+n+ " sayi icinden en buyuk olani: "+maks);
        System.out.println("girdiginiz "+n+ " sayi icinden en kucuk olani: "+min);
    }
}
