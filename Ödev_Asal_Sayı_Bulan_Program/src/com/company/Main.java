package com.company;
import java.util.Scanner;
public class Main {

    static boolean asalMi(int sayi) {
        int sayac = 0;
        for(int i = 2; i < sayi; i++)
        {
            if(sayi % i == 0) {
                sayac++;
            }
        }
        if(sayac == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();

        if(asalMi(sayi)) { // asalMi(sayi) == true
            System.out.println("Girilen sayi asal bir sayidir.");
        }
        else {
            System.out.println("Girilen sayi asal bir sayi degildir.");
        }
    }
}
