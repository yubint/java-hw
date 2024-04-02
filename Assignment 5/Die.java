/**
 * Description: The Die class simulates a die with a specified number of sides.
 * Class: Spring - COSC-1437-82703
 * Assignment5: A game of Twenty One
 * Date: 03/04/2024
 * 
 * @author Amir Jung Basnet
 * @version 1.0.0
 */
import java.util.Random;


public class Die
{
    private int sides;   // Number of sides
    private int value;   // The die's value
  
    /**
     *  The constructor performs an initial
     *  roll of the die. The number of sides
     *  for the die is passed as an argument.
     * @param int as numSides, number of sides in dice
     * @return none
     * @throws Nothing is implemented
     */
    
    public Die(int numSides)
    {
        sides = numSides;
        roll();
    }

    /**
     *  The roll method simulates the rolling of
     *  the die.
     * @param None
     * @return none
     * @throws Nothing is implemented
     */

    public void roll()
    {
        // Create a Random object.
        Random rand = new Random();
        
        // Get a random value for the die.
        value = rand.nextInt(sides) + 1;
    }

    /**
     *  The getSides method returns the 
     *  number of sides for the die.
     * @param None
     * @return number of Sides
     * @throws Nothing is implemented
     */

    public int getSides()
    {
        return sides;
    }

    /**
     *  The getValue method returns the
     *  value of the die.
     * @param None
     * @return value of the roll
     * @throws Nothing is implemented
     */

    public int getValue()
    {
        return value;
    }
}
