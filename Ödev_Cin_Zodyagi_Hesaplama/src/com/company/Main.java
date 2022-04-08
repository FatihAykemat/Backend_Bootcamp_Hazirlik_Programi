package com.company;
import  java.util.*;
public class Main {

    public static void main(String[] args) {
        String zodiac = null;
        int birthday;

        Scanner scan = new Scanner(System.in);
        System.out.print("Doğum tarihinizi giriniz :");
        birthday = scan.nextInt();

        if (birthday % 12 == 0)
        {
            zodiac = "Maymun";
        } else if (birthday % 12 == 1)
        {
            zodiac = "Horoz";
        } else if (birthday % 12 == 2)
        {
            zodiac = "Köpek";
        } else if (birthday % 12 == 3)
        {
            zodiac = "Domuz";
        } else if (birthday % 12 == 4)
        {
            zodiac = "Fare";
        } else if (birthday % 12 == 5)
        {
            zodiac = "Öküz";
        } else if (birthday % 12 == 6)
        {
            zodiac = "Kaplan";
        } else if (birthday % 12 == 7)
        {
            zodiac = "Tavşan";
        } else if (birthday % 12 == 8)
        {
            zodiac = "Ejderha";
        } else if (birthday % 12 == 9)
        {
            zodiac = "Yılan";
        } else if (birthday % 12 == 10)
        {
            zodiac = "At";
        } else if (birthday % 12 == 11)
        {
            zodiac = "Koyun";
        }
        System.out.println("Zodyağınız :"+zodiac);
    }
}
