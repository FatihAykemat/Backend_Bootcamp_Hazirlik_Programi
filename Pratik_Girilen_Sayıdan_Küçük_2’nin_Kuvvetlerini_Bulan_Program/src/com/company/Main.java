package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        //4 ve 5 in kuvvetini ekrana yazdıran program
        int k;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayi Giriniz : ");
        k = inp.nextInt();
        for(int i=1; i<=k;i++){
            if(i % 4 == 0 && i % 5 == 0) {
                System.out.println(i + " sayisi 4 ve 5 in katıdır");
            }
        }
    }
}
