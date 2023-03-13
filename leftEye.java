package oopChallenge;

import java.util.Random;
import java.util.Scanner;

public class leftEye {
    String[] condition = new String[]{"Short Sighted", "Long Sighted","Retina ish", "Focal Disorder"};
    String[] color = new String[]{"Blue","Brown", "Dark", "Bluish Brown", "Light Brown"};
    Random rand = new Random();

    public void name(String Name){
        System.out.printf("Name: %s%n", Name);
    }
    public void medicalCondition(){
        System.out.printf("Medical Condition: %s%n", condition[rand.nextInt(4)]);
    }
    public void color(){
        System.out.println("Color: " + color[rand.nextInt(5)]);
    }
    public void Option(){
        System.out.println("\t1. CLose the Eye");
        Scanner scan = new Scanner(System.in);
        if (scan.nextInt() == 1) System.out.println("Left Eye Closed");
    }

}
