package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int A[] = {1,2,2,2,2,3,4,5,5,5,6,6,8,8};

        int count=0;

        Arrays.sort(A); // Dizideki elemanları küçükten büyüğe sırala

        for(int i=0; i<A.length; i++)
        {
            count=0;
            for (int j=0; j<A.length; j++)
            {
                if(A[i]==A[j])
                {
                    count++;

                }
            }

            if(i==0 && A[i+1]==A[i])
            {
                System.out.println(String.format("%d 'den %d tane var.", A[i], count));
            }

            if(i==0 && A[i+1]!=A[i])
            {
                System.out.println(String.format("%d 'den %d tane var.", A[i], count));
            }


            if(i!=0 && A[i-1]!=A[i])
            {
                System.out.println(String.format("%d 'den %d tane var.", A[i], count));
            }

        }
    }
}
