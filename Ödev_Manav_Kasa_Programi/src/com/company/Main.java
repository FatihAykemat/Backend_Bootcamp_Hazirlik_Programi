package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        double armutKilo,elmaKilo,domatesKilo,muzKilo,patlicanKilo;
        double armt = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;

        System.out.println("******Manav Reyonuna Hoşgeldiniz******");
        System.out.println("******Almak istedğiniz ürünün kg cinsinden miktarnı belirtiniz******");

        Scanner miktar = new Scanner(System.in);


        System.out.print("Armut Kaç Kilo? : ");
        armutKilo = miktar.nextDouble();
        System.out.print("Elma Kaç Kilo? : ");
        elmaKilo = miktar.nextDouble();
        System.out.print("Domates Kaç Kilo? : ");
        domatesKilo = miktar.nextDouble();
        System.out.print("Muz Kaç Kilo? : ");
        muzKilo = miktar.nextDouble();
        System.out.print("Patlıcan Kaç Kilo? : ");
        patlicanKilo = miktar.nextDouble();

        double toplam = (armutKilo*armt)+(domatesKilo*domates)+(muzKilo * muz)+(patlicanKilo*patlican);

        System.out.print("Toplam Tutar : " + toplam);

    }
}
