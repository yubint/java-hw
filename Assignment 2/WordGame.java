/**
 * Description: This program plays a word game with the user
 * Class: Spring - COSC-1437-82703
 * Assignment2: Word Game
 * Date: 01/29/2024
 * 
 * @author Amir Jung Basnet
 * @version 0.0.1
 */

public class WordGame {

    /**
     * @param String as args
     * @return Termination code as int, 0 for normal, anything else is error
     *         condition
     * @throws Nothing is implemented
     */
    public static void main(String[] args) {
        String name, // to store the name of User
                city, // to store the city of User
                college, // to store the name of a college
                profession, // to store the profession
                animal, // to store an animal
                pet; // to store the name of pet
        int age; // to store the age

        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        // Get the User's Name
        System.out.println("What is Your Name? ");
        name = keyboard.nextLine();

        // Get the User's Age
        System.out.println("What is Your Age? ");
        age = keyboard.nextInt();

        // Consuming the NextLine
        keyboard.nextLine();

        // Get the Name of a city
        System.out.println("Name a City: ");
        city = keyboard.nextLine();

        // Get the Name of a college
        System.out.println("Name a College: ");
        college = keyboard.nextLine();
        
        // Get the Name of a profession
        System.out.println("Name a Profession: ");
        profession = keyboard.nextLine();
        
        // Get the Type of an Animal
        System.out.println("Name an Animal: ");
        animal = keyboard.nextLine();
        
        // Get the Pet's Name
        System.out.println("Name your Pet: ");
        pet = keyboard.nextLine();

        // printing out the output
        System.out.println("There once was a person named " + name +
                " who lived in " + city +
                ". At the age of " + age +
                ", " + name +
                " went to college at " + college +
                ". " + name +
                " graduated and went to work as a " + profession +
                ". Then, " + name +
                " adopted a(n) " + animal +
                " named " + pet +
                ". They both lived happily ever after!");

        System.exit(0);
    }
}
