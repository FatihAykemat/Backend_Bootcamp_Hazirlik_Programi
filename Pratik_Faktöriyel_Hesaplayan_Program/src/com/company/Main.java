package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	//Java ile kombinasyon hesaplayan program


        int k,j;
        int kfak=1,jfak=1;
        Scanner inp = new Scanner(System.in);

        System.out.print("n Sayisini Giriniz : ");
        k = inp.nextInt();
        System.out.print("r Sayisini Giriniz : ");
        j = inp.nextInt();

        if(k>j){
            for(int i=1;i<=k;i++){
                kfak=kfak*i;
            }
            //System.out.println(kfak);

            for(int i=1;i<=j;i++){
                jfak=jfak*i;
            }
            //System.out.println(jfak);

            int m=k-j;
            int mfak=1;

            for(int i=1;i<=m;i++){
                mfak=mfak*i;
            }
            //System.out.println(mfak);

            int kombinasyon=kfak/(jfak*(mfak));
            System.out.println(kombinasyon);
        }else System.out.println("n sayisi r sayisinden büyük olmalıdır");


    }
}
