package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Sıcaklık Giriniz : ");
        heat=input.nextInt();

        if(heat<5){
            System.out.println("Kayak yapabilirsin");
        }else if(heat<=25){
            if(heat<=15){
                System.out.println("Sinemaya gidebilirsin");
            }
            if(heat>=10){
                System.out.println("Pikniğe gidebilirsin");
            }
        }else System.out.println("Yüzmeye gidebilirsin");

    }
}
