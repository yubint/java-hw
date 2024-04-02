/**
 * Description: This program creates a class named Car 
 * Class: Spring - COSC-1437-82703
 * Assignment3: Car
 * Date: 02/05/2024
 * 
 * @author Amir Jung Basnet
 * @version 1.0.0
 */
public class Car {

    private int yearModel; // to store the Year Model
    private String make; // to store the Make of the car
    private int speed; // to store the speed of the car

    /**
     * @param int as inputYearModel - The Car's year model
     * @param String as inputMake - Make of the Car
     * @return None
     * @throws Nothing is implemented
     */
    public Car(int inputYearModel, String inputMake){
        
        // setting the fields 
        yearModel = inputYearModel;
        make = inputMake;
        speed = 0;
    }

    /**
     * @param None
     * @return Year of the Model 
     * @throws Nothing is implemented
     */
    public int getYear(){
        return yearModel;
    }

    /**
     * @param None
     * @return Make of the Car
     * @throws Nothing is implemented
     */
    public String getMake(){
        return make;
    }

    /**
     * @param None
     * @return Current speed of the car
     * @throws Nothing is implemented
     */
    public int getSpeed(){
        return speed;
    }

    /**
     * @param None
     * @return None
     * @throws Nothing is implemented
     */
    public void accelerate(){

        // increasing the speed by 5
        speed += 5;
    }

    /**
     * @param None
     * @return None
     * @throws Nothing is implemented
     */
    public void brake(){

        // increasing the speed by 5
        speed -= 5;
    }
}