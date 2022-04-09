package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        //tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan program
	    int k,toplam=0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Bir sayi Giriniz : ");


        boolean teksayi = false;
        while (teksayi==false){
            k = inp.nextInt();
            if (k%2==0&&k%4==0){
                toplam+=k;
            }
            else{
                teksayi=true;
            }

        }
        System.out.print(toplam);

    }
}
