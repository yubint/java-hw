/**
 * Description: This program takes year and month as input and displays the number of days in that month of year
 * Class: Spring - COSC-1437-82703
 * Assignment4: MonthDays
 * Date: 02/18/2024
 * 
 * @author Amir Jung Basnet
 * @version 1.0.0
 */
import java.util.Scanner;

public class DaysInMonth {

    /**
     * @param String as args
     * @return none
     * @throws Nothing is implemented
     */
    public static void main(String[] args) {
        
        int year; // to hold input year
        int month; // to hold input month
        int noOfDays; // to hold the number of days in a year
        Scanner keyboard; // for input

        // creating a keyboard scanner
        keyboard = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter a month(1-12): ");
        month = keyboard.nextInt();

        // clear the next line
        keyboard.nextLine();

        System.out.println("Enter a year: ");
        year = keyboard.nextInt();

        // creating an instance of MonthDays object
        MonthDays userInput = new MonthDays(month, year);
        noOfDays = userInput.getNumberOfDays();

        // Displaying the output
        System.out.printf("%d days", noOfDays);
    }
}