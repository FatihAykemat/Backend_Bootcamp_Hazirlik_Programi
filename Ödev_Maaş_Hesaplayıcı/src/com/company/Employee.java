package com.company;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax;
    double bonus;
    double salaryInc;
    double totalSalary;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.tax = taxCalc();
        this.bonus = addBonus();
        this.salaryInc = salaryInc();
        this.totalSalary = salaryTotal();
    }

    void printInfo() {
        System.out.println("Adi: " + this.name);
        System.out.println("Maas: " + this.salary);
        System.out.println("Calisma Saati: " + this.workHours);
        System.out.println("Baslangic Yili: " + this.hireYear);
        System.out.println("Vergi: " + this.tax);
        System.out.println("Bonus: " + String.format("%2.0f", bonus));
        System.out.println("Maas artisi: " + this.salaryInc);
        System.out.println("Vergi ve Bonuslar ile birlikte maas: " + String.format("%.2f", salaryTaxBonus()));
        System.out.println("Toplam maas: " + String.format("%.2f", this.totalSalary) + "\n");

    }

    double taxCalc() {
        if (this.salary < 32000 && this.salary >= 0) {
            double tax = (this.salary * 0.15);
            return tax;
        } else if (this.salary >= 32000 && this.salary < 70000) {
            double tax = (4800 + (this.salary - 32000) * 0.2);
            return tax;
        } else if (this.salary >= 70000 && this.salary < 250000) {
            double tax = (12400 + (this.salary - 70000) * 0.27);
            return tax;
        } else if (this.salary >= 250000 && this.salary < 880000) {
            double tax = (61000 + (this.salary - 250000) * 0.35);
            return tax;
        } else if (this.salary >= 880000) {
            double tax = (281500 + (this.salary - 880000) * 0.40);
            return tax;
        }
        return 0;
    }

    // Adaletli isletme calisanlarina bonusu random number generator ile verir. :)
    double addBonus() {
        double randomBonus = Math.random() * 1000;
        return randomBonus;
    }

    double salaryInc() {
        if (2022 - hireYear >= 5 && 2022 - hireYear < 10) {
            double salaryInc = 500;
            return salaryInc;
        }
        if (2022 - hireYear >= 10) {
            double salaryInc = 1000;
            return salaryInc;
        }
        return 0;
    }

    double salaryTaxBonus(){
        double taxBonus = this.salary - this.tax + this.bonus;
        return taxBonus;
    }

    double salaryTotal() {
        double total = this.salary + this.salaryInc + this.bonus - this.tax;
        return total;
    }
}
