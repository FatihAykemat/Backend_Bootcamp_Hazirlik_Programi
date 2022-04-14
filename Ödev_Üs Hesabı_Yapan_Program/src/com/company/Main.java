package com.company;

import java.util.*;

public class Main {

    static int usAlma(int a,int b){
        int us=1;
        for(int i=0;i<b;i++){
            us=us*a;
        }
        System.out.print(us);
        return us;
    }

    public static void main(String[] args) {
        // Üs alma programı
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b= inp.nextInt();
        usAlma(a,b);
    }
}