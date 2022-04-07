package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sayi = new Scanner(System.in);
        int n1,n2,sec;
        System.out.println("1.Sayı'yı giriniz: ");
        n1=sayi.nextInt();
        System.out.println("2.Sayı'yı giriniz ");
        n2=sayi.nextInt();
        System.out.println("1-toplama\n2-çıkarma\n3-carpma\n4-bolme");
        System.out.println("Seçiminiz ");
        sec=sayi.nextInt();

        switch (sec)
        {
            case 1:
                System.out.println("Toplam: "+ (n1+n2));
                break;
            case 2:
                System.out.println("Cıkarma: "+(n1-n2));
                break;
            case 3:
                System.out.println("carpma : "+(n1*n2));
                break;
            case 4:
                System.out.println("bolme: "+(n1/n2));
                break;
            default:
                System.out.println("Hatalı işlem girdin");
        }
    }
}
