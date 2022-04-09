package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        //0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan program
        Scanner a =new Scanner(System.in);
        int toplam=0;
        int ort =0;
        System.out.print("sayı giriniz:");
        int say = a.nextInt();
        System.out.print("3 ve 4 e bölünebilen sayılar:");
        for(int i=1;i<=say;i++){
            if(i%4==0&&i%3==0) {
                toplam += i;
                ort+= i-(i-1);
                System.out.print(i+" ");
            }

        }double hesap= toplam/ort;
        System.out.println(toplam);

        System.out.println(ort);


    }
}
