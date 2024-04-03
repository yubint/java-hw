/**
 * Converts the input String of English to Morse Code
 * 
 * Class: Spring - COSC-1437-82703
 * Assignment8: MorseDemo
 * Date: 14/02/2024
 * 
 * @author Amir Jung Basnet
 * @version 1.0.0
 *
 */
import java.util.Scanner;

public class MorseDemo {

    public static void main(String[] args) {

        String input = new String(); // for storing input
        String morse = new String(); // for storing morse
        // Creating a keyboard
        Scanner keyboard = new Scanner(System.in);

        // Taking input String
        System.out.println("Enter a English Sentence or Word: ");
        input = keyboard.nextLine();

        morse = Morse.toMorse(input);
        
        System.out.println("The Morse code is: \n");
        System.out.println(morse);

    }
}
