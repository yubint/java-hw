/**
 * Description: The Class simulates a Game where die is rolled for user and computer and closest to 21 without exceeding it wins
 * Class: Spring - COSC-1437-82703
 * Assignment5: A game of Twenty One
 * Date: 03/04/2024
 * 
 * @author Amir Jung Basnet
 * @version 1.0.0
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TwentyOne {

    /**
     * @param String as args
     * @return none
     * @throws Nothing is implemented
     */
    public static void main(String[] args) throws IOException {
       
        int userScore = 0; // to store user Score
        int computerScore = 0; // to store computer score
        int playAgain; // to store if user wants to play again

        File inputFile = new File("input.txt"); // creating a File object of the input file
        Scanner inputMessage = new Scanner(inputFile); // creating a scanner for inputFile

        // checking for messages in inputMessage
        while (inputMessage.hasNext()) {
            System.out.println(inputMessage.nextLine());
        }
        System.out.println();

        // closing the scanner 
        inputMessage.close();

        // Creating two Die object 
        int DIESIDES = 6; 
        Die die1= new Die(DIESIDES);
        Die die2 = new Die(DIESIDES);

        // Rolling the die Until the user enters 1 
        do {
            // rolling the die for computer and adding those values
           die1.roll();
           die2.roll();
           
           computerScore += die1.getValue();
           computerScore += die2.getValue();

            // rolling the die for user and adding those values
            die1.roll();
            die2.roll();

            userScore += die1.getValue();
            userScore += die2.getValue();

            // breaking the loop when the userScore exceeds 21
            if(userScore > 21){
                break;
            }

            // Showing score and asking user if they want to continue
            System.out.println("Your score is " + userScore + ", Do you want to roll again?" +
            " Enter 1 for Yes");

            // creating scanner object for input
            Scanner keyboard = new Scanner(System.in);
            playAgain= keyboard.nextInt();
            
        } while (playAgain == 1 );
        
        // creating instance of FileWriter object
        FileWriter fwriter = new FileWriter("output.txt", true);
        PrintWriter outputFile = new PrintWriter(fwriter);

        // output Score to terminal and file
        System.out.println("The computer's Score is " + computerScore + " and Your Score is " + userScore);
        outputFile.println("The computer's Score is " + computerScore + " and Your Score is " + userScore);

        String outputMsg;
        if(userScore > 21 || userScore < computerScore){
           outputMsg = "You've Lost" ;
        }
        else{
            outputMsg = "You've Won";
        }

        // Writing the output to Terminal and the File
        System.out.println(outputMsg);
        outputFile.println(outputMsg);
        System.out.println("You can view the result in the file output.txt");
        fwriter.close();
    }
}
