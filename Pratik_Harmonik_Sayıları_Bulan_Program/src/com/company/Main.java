package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// Harmonik Sayıları Bulan Program

        Scanner input = new Scanner(System.in);
        System.out.println("N sayısını giriniz :");
        double n = input.nextInt();
        double result = 0;
        while (n > 0) {
            result += (1 / n);
            n--;
        }

        System.out.println(result);urkaaratas
                
    }
}
