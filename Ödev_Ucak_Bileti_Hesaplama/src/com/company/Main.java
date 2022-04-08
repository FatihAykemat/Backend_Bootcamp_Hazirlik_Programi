package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        int tip;
        double mesafe=0,yas;
        double fiyat,tarife=0.10;
        double indirim1=0.10;
        double indirim2=0.20;
        double indirim3=0.30;

	    Scanner inp = new Scanner(System.in);

        System.out.print("Gideceğiniz Mesafeyi Giriniz : ");
        mesafe = inp.nextInt();

        System.out.print("Yasinizi Giriniz : ");
        yas = inp.nextInt();

        System.out.print("Yolculuk Tipi Seciniz (1 Tek yön--2 Gidis Dönüs : )");
        tip = inp.nextInt();

        fiyat = mesafe*tarife;

        if(yas>0 && mesafe>0){
            if(yas<12){
                fiyat=fiyat-(fiyat*0.5);
                switch (tip){

                    case 1:
                           System.out.print("Bilet fiyatiniz : "+fiyat);
                           break;
                    case 2:
                           fiyat=fiyat-(fiyat*0.2);
                           System.out.print("Bilet fiyatiniz : "+fiyat);
                           break;
                    default:System.out.print("Hatali Veri Girdiniz");
                }

            }else if(yas>=12 && yas<24){
                fiyat=fiyat-(fiyat*0.1);
                switch (tip){
                    case 1:
                        System.out.print("Bilet fiyatiniz : "+fiyat);
                        break;
                    case 2:
                        fiyat=fiyat-(fiyat*0.2);
                        System.out.print("Bilet fiyatiniz : "+fiyat);
                        break;
                    default:System.out.print("Hatali Veri Girdiniz");
                }
            }else if(yas>65){
                fiyat=fiyat-(fiyat*0.3);
                switch (tip){
                    case 1:
                        System.out.print("Bilet fiyatiniz : "+fiyat);
                        break;
                    case 2:
                        fiyat=fiyat-(fiyat*0.2);
                        System.out.print("Bilet fiyatiniz : "+fiyat);
                        break;
                    default:System.out.print("Hatali Veri Girdiniz");
                }

            }

        }else System.out.print("Hatali Bilgi Girdiniz");

    }
}
