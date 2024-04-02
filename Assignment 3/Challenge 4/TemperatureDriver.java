/**
 * Description: This program creates an instance of Temperature and gets those values in kelvin and celsius
 * Class: Spring - COSC-1437-82703
 * Assignment3: Temperature
 * Date: 02/05/2024
 * 
 * @author Amir Jung Basnet
 * @version 1.0.0
 */

// importing Scanner
import java.util.Scanner;

public class TemperatureDriver {
    
    /**
     * @param String as args[]
     * @return None
     * @throws Nothing is implemented
     */
    public static void main(String args[]){

        double temp; // to store the input temperature
        Temperature currentTemp; // to store the Temperature

        Scanner keyboard = new Scanner(System.in); // create a scanner object
        
        // getting input fromt the user
        System.out.println("Enter the temperature in farehnheit: ");
        temp = keyboard.nextInt();

        // creating an instance of Temperature
        currentTemp = new Temperature(temp);

        // Showing the temperature in Celsius and Kelvin
        System.out.println("The temperature in Celsius is: " + currentTemp.getCelsius());
        System.out.println("The temperature in Kelvin is: " + currentTemp.getKelvin());
    }
}
