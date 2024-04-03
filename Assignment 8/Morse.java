/**
 * Contains two Parralel arrays of Char and String with english character and String and converts between them 
 * 
 * Class: Spring - COSC-1437-82703
 * Assignment8: Morse
 * Date: 14/02/2024
 * 
 * @author Amir Jung Basnet
 * @version 1.0.0
 *
 */

public class Morse {
    private static final int ARRAY_SIZE = 40; // For both char and String arrays
    private static final char[] english = {' ', ',',
                          '.', '?', '0', '1', '2', '3',
                          '4', '5', '6', '7', '8', '9',
                          'a', 'b', 'c', 'd', 'e', 'f',
                          'g', 'h', 'i', 'j', 'k', 'l',
                          'm', 'n', 'o', 'p', 'q', 'r',
                          's', 't', 'u', 'v', 'w', 'x',
                          'y', 'z'};
    private static final String[] morse = {" ", "--..--", ".-.-.-",
              "..--..", "-----", ".----", "..---", "...--",
               "....-", ".....", "-....", "--...", "---..",
               "----.", ".-",   "-...", "-.-.", "-..",  ".",
                "..-.", "--.",  "....", "..",   ".---",
                "-.-",  ".-..", "--",   "-.",   "---",
                ".--.", "--.-", ".-.",  "...",  "-",
                "..-",  "...-", ".--",  "-..-", "-.--",
                "--.." };

    /**
     * Static Method that converts English to Morse Code
     * @param eng as String
     * @return
     */
    public static String toMorse(String eng){
        String morseCode = new String();

        for(int index = 0; index < eng.length(); index++){

            for(int j = 0; j < ARRAY_SIZE; j++){
                if (Character.toLowerCase(eng.charAt(index)) == english[j]) {
                    morseCode += morse[j];
                    morseCode += ' ';
                }
            }
        }

        return morseCode;
    }

}