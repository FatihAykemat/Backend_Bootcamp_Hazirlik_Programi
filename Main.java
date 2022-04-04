package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int mat,fizik, kimya, turkce, muzik;

        Scanner inp= new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz: ");
        mat = inp.nextInt();

        System.out.println("Fizik notunuzu giriniz: ");
        fizik = inp.nextInt();

        System.out.println("Kimya notunuzu giriniz: ");
        kimya = inp.nextInt();

        System.out.println("Turkce notunuzu giriniz: ");
        turkce = inp.nextInt();

        System.out.println("Muzik notunuzu giriniz: ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + muzik);
        double sonuc = toplam/5;

        boolean result = sonuc > 60;
        System.out.println("Ortalamaniz : " + sonuc);
        System.out.println("Sinifi " + (result ? "Gectiniz" : "Kaldiniz"));
    }
}
