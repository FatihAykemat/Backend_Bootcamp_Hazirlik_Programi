package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int fiyat;
        Scanner sayi=new Scanner(System.in);
        System.out.println("Fiyatı Firiniz");
        fiyat=sayi.nextInt();
        if (fiyat > 1000)
        {
            fiyat=fiyat*8/100 + fiyat;
        }
        else
        {
            fiyat=fiyat*18/100 + fiyat;
        }
        System.out.println("Kdv'li Fiyat "+fiyat);
    }
}
