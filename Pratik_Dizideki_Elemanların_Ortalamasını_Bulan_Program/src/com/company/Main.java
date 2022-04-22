package com.company;

public class Main {

    public static void main(String[] args) {
	// Dizideki sayıların harmonik ortalamasını hesaplayan program
        double[] list = {15, 6, 7, 12, 7, 9 , 3};
        double harmonic = 0.0;
        for (int i = 0; i < list.length; i++){
            harmonic = harmonic + (1 / list [i]);
        }

        double harmonikort = list.length / harmonic;
        System.out.println("Harmonik ortalama " + String.format("%.4f", harmonikort) );
    }
}
