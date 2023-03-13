package oopChallenge;

import java.util.Random;
import java.util.Scanner;

public class Skin {
    String[] condition = new String[]{"Burnt ", "Normal","Glowing", "Needs attention"};
    Random rand = new Random();

    public void name(String Name){
        System.out.printf("Name: %s%n", Name);
    }
    public void medicalCondition(){
        System.out.printf("Medical Condition: %s%n", condition[rand.nextInt(4)]);
    }
    }
