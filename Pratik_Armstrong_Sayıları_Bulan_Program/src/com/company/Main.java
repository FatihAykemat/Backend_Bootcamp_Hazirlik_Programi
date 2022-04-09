package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// Bir sayının basamak sayılarının toplamını hesaplayan program
        int k,toplam=0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz");
        k=inp.nextInt();

        while (k > 0){


            System.out.println(k % 10);
            toplam=(k%10)+toplam;
            k = k/10;

        }
        System.out.print(toplam);
    }
}
