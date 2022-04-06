package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        int kilo;
        double boy;

        Scanner deger = new Scanner(System.in);

        System.out.print("Lütfen Boyunuzu Metre Cinsinden Giriniz (Örn: 1,75) : ");
        boy = deger.nextDouble();

        System.out.print("Lütfen Kilonuzu Giriniz : ");
        kilo = deger.nextInt();

        double vki = kilo / (boy*boy);
        System.out.print("Vücut Kitle İndeksiniz : " + vki);

    }
}
