package oopChallenge;

import java.util.Random;
import java.util.Scanner;

public class Stomach {
    String[] condition = new String[]{"Ulcer ", "PUD","Constipation", "Need to be fed"};
    Random rand = new Random();

    public void name(String Name){
        System.out.printf("Name: %s%n", Name);
    }
    public void medicalCondition(){
        System.out.printf("Medical Condition: %s%n", condition[rand.nextInt(4)]);
    }
    public void Option(){
        System.out.println("\t1. Digest Food\n\t 2. Take water");
        Scanner scan = new Scanner(System.in);
        switch(scan.nextInt()){
            case 1:
                System.out.println("Digestion in process");
                break;
            case 2:
                System.out.println("Drinking water!!");
                break;
            default:
                break;
        }
    }
}
