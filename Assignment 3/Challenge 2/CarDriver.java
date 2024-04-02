/**
 * Description: This program creates a car object and then accelerates it five times and brakes it five times
 * Class: Spring - COSC-1437-82703
 * Assignment3: Car
 * Date: 02/05/2024
 * 
 * @author Amir Jung Basnet
 * @version 1.0.0
 */

import java.util.Scanner;


public class CarDriver {
   
    /**
     * @param String as args
     * @return Termination code as int, 0 for normal, anything else is error
     *         condition
     * @throws Nothing is implemented
     */
    public static void main(String args[]){

        Car newCar; // for the car object
        int yearModel; // for Year Model input from user
        String make; // for the Make of the Car input from use

        Scanner keyboard = new Scanner(System.in); // creating a Scanner for input

        System.out.println("Enter the Car's Year Model");
        yearModel = keyboard.nextInt();

        // consuming the nextLine 
        keyboard.nextLine();

        System.out.println("Enter the Car's Make: ");
        make = keyboard.nextLine();

        newCar = new Car(yearModel, make);

        // accelerate and print the speed five times
        newCar.accelerate();
        System.out.println("The current speed is: " + newCar.getSpeed());
        
        newCar.accelerate();
        System.out.println("The current speed is: " + newCar.getSpeed());
        
        newCar.accelerate();
        System.out.println("The current speed is: " + newCar.getSpeed());

        newCar.accelerate();
        System.out.println("The current speed is: " + newCar.getSpeed());

        newCar.accelerate();
        System.out.println("The current speed is: " + newCar.getSpeed());

        // brake and print the current speed five times
        newCar.brake();
        System.out.println("The current speed is: " + newCar.getSpeed());
        
        newCar.brake();
        System.out.println("The current speed is: " + newCar.getSpeed());
        
        newCar.brake();
        System.out.println("The current speed is: " + newCar.getSpeed());

        newCar.brake();
        System.out.println("The current speed is: " + newCar.getSpeed());
        
        newCar.brake();
        System.out.println("The current speed is: " + newCar.getSpeed());

    }
}
