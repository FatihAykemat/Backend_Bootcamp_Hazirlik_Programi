package com.company;

public class Match {
    Fighter f1;
    Fighter f2;
    int maxWeight;
    int minWeight;
    double chance;

    public Match(Fighter f1,Fighter f2,int maxWeight,int minWeight){
        this.f1 = f1;
        this.f2 =f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;

    }
    boolean isCheck(){
        return (this.f1.weight <= this.maxWeight && this.f1.weight >= this.minWeight) && (this.f2.weight <= this.maxWeight && this.f2.weight >= this.minWeight);
    }
    boolean isWin(){
        if(f1.health==0){
            System.out.print("The winner => "+ this.f2.name);
            return true;
        }else if(f2.health==0){
            System.out.print("The winner => "+ this.f1.name);
            return true;
        }else{
            return false;
        }
    }
    void score(){
        System.out.println("------------");
        System.out.println(this.f1.name + "Remaining life \t:"+f1.health);
        System.out.println(this.f2.name + "Remaining life \t:"+f2.health);
    }
    double chance(){
        double chance = Math.random() * 100;
        return chance = this.chance;
    }
    public void run() {
        if(this.chance < 50){
            Fighter ex;
            ex = this.f1;
            this.f1 = this.f2;
            this.f2 = ex;

        }
        if(isCheck()){
            while(this.f1.health > 0 && this.f2.health > 0){
                System.out.println("------------ NEW ROUND ---------------");
                this.f1.health = this.f2.hit(f2);
                if (isWin()){
                    break;
                }
                this.f2.health = this.f1.hit(f2);
                if (isWin()){
                    break;
                }

                score();
            }

        }
        else{
            System.out.println("Athletes are not in the appropriate range...");
        }
    }
}
