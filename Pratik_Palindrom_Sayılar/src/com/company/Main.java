package com.company;
import java.util.*;
public class Main {
    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, mod;

        while (temp != 0) {
            mod = temp % 10;
            reverseNumber = (reverseNumber * 10) + mod;
            temp /= 10;
        }
        return number == reverseNumber;
    }

    public static void main(String[] args) {
	// Palindrom
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        n = inp.nextInt();
        System.out.println(isPalindrom(n));

    }
}
