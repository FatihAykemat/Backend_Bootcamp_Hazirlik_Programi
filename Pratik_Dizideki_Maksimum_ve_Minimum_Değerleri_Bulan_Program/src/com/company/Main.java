package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan program
        Scanner input = new Scanner(System.in);

        int x, sayi, yakinlik, enyakin, i, enyakin2 = 0, yakinlik2 = -1;
        sayi = input.nextInt();
        x = input.nextInt();
        enyakin = x;
        yakinlik = Math.abs(x - sayi);
        for (i = 0; i < 9; i++) {
            x = input.nextInt();
            if (Math.abs(x - sayi) < yakinlik) {
                yakinlik = Math.abs(x - sayi);
                enyakin = x;
            } else if (Math.abs(x - sayi) == yakinlik) {
                if (x != enyakin) {
                    yakinlik2 = yakinlik;
                    enyakin2 = x;
                }
            }
        }
        if (yakinlik2 == yakinlik)
            System.out.println("Diger en yakin sayi= " + enyakin2);
        System.out.println("En yakin sayi= " + enyakin);
        input.close();
    }
}
