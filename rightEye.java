package oopChallenge;

import java.util.Random;
import java.util.Scanner;

public class rightEye {
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
        System.out.println("\t1. CLose the Eye\n\t2. Leave the eye opened");
        Scanner scan = new Scanner(System.in);
        switch(scan.nextInt()) {
            case 1:
                System.out.println("Right eye closed");
                break;
            case 2:
                System.out.println("Right eye left opened");
                break;
        }
    }
}
