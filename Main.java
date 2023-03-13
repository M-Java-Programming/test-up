package oopChallenge;

//import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Patient's name
        System.out.println("Kindly enter your name: ");
        String name = input.next();
        //Patient's age
        System.out.println("Please enter your age: ");
        int age = input.nextInt();
        //Result
        System.out.println("Test Result:");
        System.out.println("Name: " + name + "\nAge: " + age);
        int option1;
        do {
            System.out.println("Choose an Organ: \n\t1. Left Eye \n\t2. Right Eye\n\t3. Heart\n\t4. Stomach" +
                    "\n\t5. Skin\n\t6. Quit");
            int option = input.nextInt();
            switch (option) {
                case 1:
                    leftEye lefteye = new leftEye();
                    lefteye.name("Left Eye");
                    lefteye.medicalCondition();
                    lefteye.color();
                    lefteye.Option();
                    break;
                case 2:
                    rightEye righteye = new rightEye();
                    righteye.name("Right Eye");
                    righteye.medicalCondition();
                    righteye.color();
                    righteye.Option();
                    break;
                case 3:
                    Heart heart = new Heart();
                    heart.name("Heart");
                    heart.medicalCondition();
                    heart.rate();
                    heart.Option();
                    break;
                case 4:
                    Stomach stomach = new Stomach();
                    stomach.name("Stomach");
                    stomach.medicalCondition();
                    stomach.Option();
                    break;
                case 5:
                    Skin skin = new Skin();
                    skin.name("Skin");
                    skin.medicalCondition();
                    break;
                case 6:
                    System.out.println("Good bye");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
            option1 = option;
        } while (option1 <= 6);

    }
}
