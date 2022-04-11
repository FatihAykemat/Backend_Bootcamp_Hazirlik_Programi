package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// While döngüsü ile EBOB-EKOK 
        int a, b, ebob, ekok;

        Scanner input = new Scanner(System.in);

        System.out.print("1. sayiyi girniz : ");
        a = input.nextInt();

        System.out.print("2. sayiyi giriniz : ");
        b = input.nextInt();
        ebob = 1;
        ekok = 1;

        int i = 1;
        while(i <= a) {
            if (a % i == 0 && b % i == 0) {
                ebob = i;
            }
            i++;
        }
        System.out.println("EBOB = " + ebob);

        while (ekok <= (a * b)) {
            if (ekok % a == 0 && ekok % b == 0) {
                System.out.println("EKOK = " + ekok);
                break;
            }
            ekok++;
        }
    }
}
