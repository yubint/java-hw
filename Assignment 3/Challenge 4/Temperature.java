/**
 * Description: This program creates a class named Temperature
 * Class: Spring - COSC-1437-82703
 * Assignment3: Temperature
 * Date: 02/05/2024
 * 
 * @author Amir Jung Basnet
 * @version 1.0.0
 */
public class Temperature {
    
    private double ftemp; // creating the field for temperature

    /**
     * @param double as inputFtemp 
     * @return None
     * @throws Nothing is implemented
     */
    public Temperature(double inputFtemp){
        ftemp = inputFtemp; // setting the field
    }

    /**
     * @param double as inputFtemp 
     * @return None
     * @throws Nothing is implemented
     */
    public void setFahrenheit(double inputFtemp){
        ftemp = inputFtemp; // setting the field
    }

    /**
     * @param None
     * @return Temperature in Fahrenheit
     * @throws Nothing is implemented
     */
    public double getFahrenheit(){
        return ftemp;
    }

    /**
     * @param None
     * @return Temperature in Celsius
     * @throws Nothing is implemented
     */
    public double getCelsius(){
        return (5.0/9.0) * (ftemp - 32); // return the temperature after converting it to Celsius
    }
    
    /**
     * @param None
     * @return Temperature in Kelvin
     * @throws Nothing is implemented
     */
    public double getKelvin(){
        return (((5.0/9.0) * (ftemp - 32)) + 273); // return the temperature after converting it to kelvin
    }
}
