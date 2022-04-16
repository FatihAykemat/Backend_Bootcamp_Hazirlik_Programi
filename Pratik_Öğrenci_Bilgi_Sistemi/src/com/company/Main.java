package com.company;

public class Main {

    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut hoca" , "TRH" , "555");
        Teacher t2 = new Teacher("Graham bell", "FZK", "11235");
        Teacher t3 = new Teacher("külyutmaz", "BIO", "1186");

        Course tarih = new Course("Tarih" , "101" , "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik" , "102" , "FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji" , "103" , "BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("İnek Şaban","123", "4",tarih,fizik,biyo);
        s1.addBulkExamNote(100,40,70,23,50,100);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi","124","4",tarih,fizik,biyo);
        s2.addBulkExamNote(50,30,70,40,50,40);
        s2.isPass();

    }
}
