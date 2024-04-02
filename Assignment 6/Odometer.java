/**
 * Description: The Odometer class simulates a odometer with 24 economy
 * Class: Spring - COSC-1437-82703
 * Assignment6: Car-Instrument Simulator
 * Date: 03/24/2024
 * 
 * @author Amir Jung Basnet
 * @version 1.0.0
 */

public class Odometer {

    private final static int MAX_MILEAGE =  999999; // maximum mileage
    private final static int FUEL_ECONOMY = 24; // fuel economy
    private int mileage; // to store the mileage
    private FuelGauge fuelGauge; // to store fuelGauge
    private int fuelPoint ; // to store the current fuel used until 24
    
    /**
     * This constructor sets the mileage to the given mileage and the fuelGauge to the fuelGauge
     * @param int as mileage . if it is above 999999 then it is set to 0
     * @param FuelGauge as fuelGauge
     * @return None
     * @throws Nothing is implemented
     */
    public Odometer(int mileage, FuelGauge fuelGauge){
        if (mileage > 999999 || mileage < 0){
            this.mileage = 0;
        }
        else{
            this.mileage = mileage;
        }

        // passing the reference of FuelGauge as we need its modification in thsi class
        this.fuelGauge = fuelGauge;
    }

    
    /**
     * @param None
     * @return int current mileage
     * @throws Nothing is implemented
     */
    public int getMileage(){
        return this.mileage;
    }

    /**
     * @param None
     * @return None
     * @throws Nothing is implemented
     */
    public void incrementMileage(){
        this.mileage++; 
        this.fuelPoint++;

        if (this.fuelPoint > 24) {
           this.fuelGauge.useFuel();
           this.fuelPoint = 0; 
        }

        if (this.mileage > 999999 ){
            this.mileage = 0;
        }
    }
    
}
