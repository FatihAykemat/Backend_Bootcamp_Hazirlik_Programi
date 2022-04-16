package com.company;

public class Teacher {
    String name;
    String mnpo;
    String branch;

    Teacher(String name, String branch, String mnpo){

        this.name = name;
        this.mnpo = mnpo;
        this.branch = branch;

    }


    void print(){
        System.out.println("Adı : " + this.name);
        System.out.println("Telefonu : " + this.mnpo);
        System.out.println("Bölümü : " + this.branch);
    }
}
