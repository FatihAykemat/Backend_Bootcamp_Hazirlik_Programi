package com.company;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a, b;
        Scanner inp = new Scanner(System.in);

        System.out.println("Matris boyutunu giriniz: [a]x[b]");
        System.out.print("a: ");
        a = inp.nextInt();

        System.out.print("b: ");
        b = inp.nextInt();

        int[][] matrix = new int[a][b];
        int[][] transpose = new int[b][a];

        System.out.println("Matris elemanlarini giriniz");

        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                System.out.print("Matrisin " + (i+1) + ". satirinin " + (j+1) + ". sutununun degeri: ");
                matrix[i][j] = inp.nextInt();
            }
        }

        System.out.println("Matris: "+Arrays.deepToString(matrix));
        // Transpose
        for (int i = 0; i < b; i++){
            for (int j = 0; j < a; j++){
                transpose[i][j] = matrix[j][i];
            }
        }
        System.out.println("Matrisin transpozu: " + Arrays.deepToString(transpose));
    }
}
