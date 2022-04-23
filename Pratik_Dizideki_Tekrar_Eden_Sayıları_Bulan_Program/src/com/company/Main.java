package com.company;
import java.util.*;





public class Main {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int sum = 0, index = 0, emp, counter = 0;
        double avarage;
        System.out.print("Kaç elamanlı bir dizi istiyorsunuz: ");
        emp = input.nextInt();
        int[] simpleArray = new int[emp];
        int[] repetitive = new int[emp];
        for (int i = 0; i < emp; i++) {
            counter++;
            System.out.print(counter + ". elamanı girin: ");
            int x = input.nextInt();
            simpleArray[i] = x;
        }
        System.out.print("Diziniz: ");
        System.out.println(Arrays.toString(simpleArray));

        for (int i = 0; i < simpleArray.length; i++) {
            for (int j = 0; j < simpleArray.length; j++) {
                if (i != j && simpleArray[i] == simpleArray[j]) {
                    if (isFind(repetitive,simpleArray[i]) == false){
                        repetitive[index++] = simpleArray[j];
                        break;
                    }
                }
            }
        }
        System.out.print("Dizideki tekrar eden sayılar: ");
        System.out.print("[");
        for (int i : repetitive){
            if (i != 0){
                System.out.print(i + ",");
            }
        }
        System.out.println("]");
    }
}
