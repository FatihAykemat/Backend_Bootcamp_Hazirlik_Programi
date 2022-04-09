package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// Üslü Sayı Hesaplayan Program "for döngüsü ile"
        int k,l,toplam=1;
        Scanner inp = new Scanner(System.in);


        System.out.print("Üssü giriniz : ");
        k = inp.nextInt();
        System.out.print("Üssü alınacak sayıyı Giriniz : ");
        l = inp.nextInt();

        for(int i=1;i<=k;i++){
            toplam*=l;
        }
        System.out.print(toplam);

    }
}
