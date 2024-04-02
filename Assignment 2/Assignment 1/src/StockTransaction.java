/**
 * Description: This program calculates the Purchase amount, Comission, Sales Amount , Sales Comission and Total profit for a Stock Transaction
 * Class: Spring - COSC-1437-82703
 * Assignment2: Stock Transaction
 * Date: 01/29/2024
 * 
 * @author Amir Jung Basnet
 * @version 0.0.1
 */
public class StockTransaction {
    
    /**
     * @param String as args
     * @return Termination code as int, 0 for normal, anything else is error
     *         condition
     * @throws Nothing is implemented
     */
    public static void main(String args[]){

        // Declaring variables and storing values in them
        int purchaseUnit = 1000, 
            salesUnit = 1000,
            purchaseComissionPercent = 2,
            salesComissionPercent = 2;

        double purchasePrice = 32.87,
               salesPrice = 33.92;

        double purchaseAmount, // to store the Total amount paid for purchase of stock
                salesAmount, // to store the Total Amount received after sales of Stock
                purchaseComission, //to store Comission paid during purchase
                salesComission, // to store Comission paid during sales
                profit; // to store Final Profit

        // Calculating Purchase and Sales Amount
        purchaseAmount = purchaseUnit * purchasePrice;
        salesAmount = salesUnit * salesPrice;
        
        // Calculating Comission Amount
        purchaseComission = purchaseComissionPercent * purchaseAmount / 100;
        salesComission = salesComissionPercent * salesAmount / 100;

        // Calculating Profit
        profit = salesAmount - purchaseAmount - purchaseComission - salesComission;

        // Displaying the Information to the User
        System.out.println("The amount Joe Paid for the Stock is: " + purchaseAmount);
        System.out.println("The Comission Paid during the Purchase of Stock is: " + purchaseComission);
        System.out.println("The amount Joe sold the Stock for is: " + salesAmount);
        System.out.println("The Comission Paid during the Sale of Stock is: " + salesComission);
        System.out.println("The Profit that Joe made is: " + profit);
        
        System.exit(0);
    }
}
