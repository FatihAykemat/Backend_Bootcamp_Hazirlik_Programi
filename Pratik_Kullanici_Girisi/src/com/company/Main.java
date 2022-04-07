package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.print("kullanıcı adı oluşturun:");
        String userName, password;
        userName= inp.next();
        System.out.print("şifrenizi sadece harf olarak girin:");
        password= inp.next();
        String u1,p1;
        u1= userName;
        p1=password;
        System.out.print("kaydınız başarıyla oluşturuldu...\nkullanıcı adınızı giriniz:");
        String u2,p2;
        u2= inp.next();
        System.out.print("sifrenizi giriniz:");
        p2= inp.next();




        if (u1.equals(u2) && p1.equals(p2)){
            System.out.print("başarıyla giriş yapıldı...");
        }
        else if (!(u1.equals(u2))&& p1.equals(p2) ){
            System.out.print("kullanıcı adınız yanlış lütfen tekrar deneyiniz.");

        }
        else if(u1.equals(u2)&& !(p1.equals(p2))){
            System.out.print("şifreniz yanlış,yeni sifre olustur (evet/hayır)");
            String c = inp.next();
            switch(c){
                case "evet":
                    System.out.print("yeni şifrenizi giriniz:");
                    String p3= inp.next();
                    p3= p1;
                    System.out.print("şifreniz başarıyla değiştirildi");
                    break;
                case "hayır":
                    System.out.print("cıkıs yapılıyor");
                    break;
                default:
                    System.out.print("yanlış secim");
            }

        }else {
            System.out.print("Hatalı giriş.");
        }
    }
}
