package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner i= new Scanner(System.in);
        System.out.print("yıl giriniz:");
        int x= i.nextInt();
        if(x>0){
            if (x%100==0){
                if(x%400==0){
                    System.out.print(x+" artık yıldır");
                }else{
                    System.out.print(x+" artık yıl değildir");
                }
            }else{
                if(x%4==0){
                    System.out.print(x+" artık yıldır");
                }else{
                    System.out.print(x+" artık yıl değildir");
                }
            }

        }else{
            System.out.print("hatalı yıl girdiniz");
        }
    }
}
