/**
 * Description: This program creates a Circle object using user input and then prints Area, Diameter and Circumference
 * Class: Spring - COSC-1437-82703
 * Assignment3: Circle
 * Date: 02/05/2024
 * 
 * @author Amir Jung Basnet
 * @version 1.0.0
 */

// importing the scanner class
import java.util.Scanner;

public class CircleDriver {
    
    /**
     * @param String as args
     * @return None
     * @throws Nothing is implemented
     */
    public static void main(String args[]){
        Circle newCircle; // to create Circle object
        int radius; // to store user input

        Scanner keyboard = new Scanner(System.in); // creating a scanner object
        
        // taking input from user
        System.out.println("Enter the radius: ");
        radius = keyboard.nextInt();

        // creating Circle object
        newCircle = new Circle(radius);

        // Showing the Area, Diameter and Circumference
        System.out.println("The Circle's Area is " + newCircle.getArea());
        System.out.println("The Circle's Diameter is " + newCircle.getDiameter());
        System.out.println("The Circle's Circumference is " + newCircle.getCircumference());
    }
}
