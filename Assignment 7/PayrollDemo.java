/**
 * Shows Employee number and asks the user to enter payrate and Hours for each employee number
 * 
 * Class: Spring - COSC-1437-82703
 * Assignment7: Payroll
 * Date: 04/02/2024
 * 
 * @author Amir Jung Basnet
 * @version 1.0.0
 *
 */
import java.util.Scanner;

public class PayrollDemo {

    /**
     * @param args as String[]
     * @return void
     * @throws Nothing is implemented
     */
    public static void main(String[] args) {
        // Payroll and Scanner objects
        Payroll payroll = new Payroll(); 
        Scanner keyboard = new Scanner(System.in);

        // Length of array
        final int ARRAY_LENGTH = 7;

        // retreiving data
        for(int index = 0 ; index < ARRAY_LENGTH; index++ )
        {
            System.out.println("Employee : " + payroll.getEmployeeId(index));

            do {
                System.out.print("Please Enter the Hours Worked: ");
                payroll.setHours(index, keyboard.nextInt());

                if(payroll.getHours(index) < 0){
                    System.out.println("Invalid Input! Please only Enter Non-Negative Number");
                }
            } while (payroll.getHours(index) < 0);

            do {
                System.out.print("Please Enter the Payrate: ");
                payroll.setPayRate(index, keyboard.nextDouble());

                if (payroll.getPayrate(index) < 6.00) {
                    System.out.println("Invalid Input! Payrate Must be greater than 6.00");
                }
            } while (payroll.getPayrate(index) < 6.00);

            System.out.println();

        }

        for(int index = 0; index < ARRAY_LENGTH; index ++){
            System.out.printf("Employee Id: %d \nWages: %.2f \n", payroll.getEmployeeId(index), payroll.getWages(index));;
            System.out.println();
        }
    }
}