package oopChallenge;

import java.util.Random;
import java.util.Scanner;

public class Heart {
    String[] condition = new String[]{"Hypertensive", "Normal","High Blood Pressure", "Block artery"};
    int[] rate = new int[]{65, 75, 85, 96, 100};
    Random rand = new Random();

    public void name(String Name){
        System.out.printf("Name: %s%n", Name);
    }
    public void medicalCondition(){
        System.out.printf("Medical Condition: %s%n", condition[rand.nextInt(4)]);
    }
    public void rate(){
        System.out.println("Beating rate: " + rate[rand.nextInt(5)]);
    }
    public void Option(){
        System.out.println("\t1. Change heart rate: ");
        Scanner scan = new Scanner(System.in);
        if(scan.nextInt()==1){
            System.out.println("Enter a new Heart rate: ");
            System.out.println("Your new Heart rate is "+ scan.nextInt());
        }
    }
}
