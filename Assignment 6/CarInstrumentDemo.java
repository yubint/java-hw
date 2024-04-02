/**
 * Description: The CarInstrumentDemo Provide demo of Odometer and FuelGauge Class
 * Class: Spring - COSC-1437-82703
 * Assignment6: Car-Instrument Simulator
 * Date: 03/24/2024
 * 
 * @author Amir Jung Basnet
 * @version 1.0.0
 */

public class CarInstrumentDemo {

    /**
     * @param String as args
     * @return none
     * @throws Nothing is implemented
     */
    public static void main(String[] args) {

        // variables for fuelGauge and odometer
        FuelGauge fuelGauge;
        Odometer odometer; 

        // initializing FuelGauge with full Fuel
        fuelGauge = new FuelGauge();
        
        // initializing odometer with 0 mileage and fuelGauge
        odometer = new Odometer(0, fuelGauge);

        while (fuelGauge.getFuel() > 0 ) {
            // increment the odometer
            odometer.incrementMileage();

            // print the fuel and mileage
            System.out.printf("Fuel: %d \nMileage: %d \n", fuelGauge.getFuel(), odometer.getMileage());
            System.out.println();
        }
    }
}