package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[][] bLetter = new String[7][4];

        for (int i = 0; i < bLetter.length; i++) {
            for (int j = 0; j < bLetter[i].length; j++){
                if (i == 0 || i == 3 || i == 6){
                    bLetter[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    bLetter[i][j] = " * ";
                } else {
                    bLetter[i][j] = "   ";
                }
            }
        }
        for (String[] row : bLetter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
