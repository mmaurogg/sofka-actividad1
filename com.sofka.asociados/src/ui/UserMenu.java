package ui;

import java.util.Scanner;

public class UserMenu {
    

    public static void showMenu() {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n\nWelcome");
        System.out.println("To continue we need know some information about you:");
        
        System.out.println("Type your complete name: ");
        String name = sc.nextLine();

        System.out.println("how old are you?");
        int age = Integer.valueOf(sc.nextLine());

        System.out.println("What is your cel number");
        String celphone = sc.nextLine();

        hello(name, age, celphone);

        System.out.println("Do you wish add another person? (press Y for yes)");
        String response = sc.nextLine();

        if( response.equalsIgnoreCase("y")){
            showMenu();
        } else {
            System.out.println("ok, Bye");
        }

        sc.close();
    }

    private static void hello ( String name, int age, String celphone) {
        System.out.println("\nWelcom Mr/Mrs: " + name + ", it's a pleasure count with a person who is " + age + " years old.");
        System.err.println("Next we will comunicate with you by celphonte at number: " + celphone +"\nHave a nice day!");
    }


}
