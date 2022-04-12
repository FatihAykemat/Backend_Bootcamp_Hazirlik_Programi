package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// Ödev - 1-100 Arasındaki Asal Sayıları Bulan Program
        Scanner inp= new Scanner(System.in);

        int sayac = 0;
        for(int sayi=2;sayi<=100;sayi++)
        {
            int kontrol = 0;
            for (int i = 2; i < sayi; i++)
            {
                if (sayi % i == 0)
                {
                    kontrol = 1;
                    break;
                }
            }

            if(kontrol==0)
            {
                System.out.print(sayi+"\n");
                sayac++;
            }
        }

    }
}
