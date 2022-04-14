package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a number:");
        int a = scan.nextInt();
        int i = 0;
        int b = a;
        System.out.print(number(a, i, b));
    }


    static int number(int a, int i, int b) {
        int temp = 0;

        if (i != 0) {
            if (a == b) {
                return a;
            }
        }
        if (a > 0) {
            if (b % 5 == 0) {
                int s = 1;
                while (s <= b / 5) {

                    System.out.print(" "+a + " ");
                    temp = number(a - 5, i++, b);
                    return temp;
                }
                s++;
            } else {
                int s = 1;
                while (s <= b / 5 + 1) {

                    System.out.print(" "+a + " ");
                    temp = number(a - 5, i++, b);
                    return temp;
                }s++;
            }}

        if (a <= 0) {
            System.out.print(" "+a + " ");
            if (b % 5 == 0) {
                for (int s = 0; s < (b / 5); s++) {

                    a += 5;
                    if(a==b){
                        break;
                    }else {
                        System.out.print(" "+a + " ");
                    }
                }
            } else {
                for (int s = 0; s <= b / 5 ; s++) {

                    a += 5;
                    if(a==b){
                        break;
                    }else{
                        System.out.print(" "+a+" ");
                    }}
            }
        }return b;

    }}