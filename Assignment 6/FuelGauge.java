/**
 * Description: The FuelGauge class simulates a Fuel gauge
 * Class: Spring - COSC-1437-82703
 * Assignment6: Car-Instrument Simulator
 * Date: 03/24/2024
 * 
 * @author Amir Jung Basnet
 * @version 1.0.0
 */

public class FuelGauge {

    // declaring variables for Max_fuel level and current fuel
    private final static int MAX_FUEL = 15;
    private int currentFuel;

    /**
     *  It is no param constructor and sets the fuel to Max 
     * @param None
     * @return none
     * @throws Nothing is implemented
     */
    public FuelGauge(){
        this.currentFuel= MAX_FUEL;
    }


    /**
     *  Constructor that sets current fuel to the specified fuel if it is less than MAX_FUEL    
     * @param currentFuel as int 
     * @return none
     * @throws Nothing is implemented
     */
    public FuelGauge(int currentFuel){
        if(currentFuel > MAX_FUEL){
            this.currentFuel= MAX_FUEL;
        }
        else if(currentFuel < 0){
            this.currentFuel = 0;
        }
        else{
            this.currentFuel = currentFuel;
        }
    }

    /**
     * @param None
     * @return int currentFuel
     * @throws Nothing is implemented
     */
    public int getFuel(){
        return this.currentFuel;
    }
    
    /**
     * @param None
     * @return None
     * @throws Nothing is implemented
     */
    public void useFuel(){
        if(this.currentFuel > 0){
            this.currentFuel-- ;
        }
    } 

    /**
     * @param None
     * @return None
     * @throws Nothing is implemented
     */
    public void addFuel(){
        if (this.currentFuel < MAX_FUEL){
            this.currentFuel++ ; 
        }
    }
    
}