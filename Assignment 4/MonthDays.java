/**
 * Description: This program creates a class named MonthDays 
 * Class: Spring - COSC-1437-82703
 * Assignment4: MonthDays
 * Date: 02/18/2024
 * 
 * @author Amir Jung Basnet
 * @version 1.0.0
 */

public class MonthDays {

    private int month; // to store the month
    private int year; // to store the year

    /**
     * @param int as inputMonth- The Month of the year
     * @param String as inputYear- The Year
     * @return none
     * @throws Nothing is implemented
     */
    public MonthDays(int inputMonth, int inputYear){
        // setting month and year to input values
        month = inputMonth;
        year = inputYear;
    }

    /**
     * @param None
     * @return int as the no of days in the month of the year
     * @throws Nothing is implemented
     */
    public int getNumberOfDays(){
        int noOfDays; // to store the number of days

        // for months with 31 days
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            noOfDays = 31;
        }
        // for February
        else if(month == 2){

            // checking if year is divisible by 100 and 400
            if ((year % 100 == 0) && (year % 400 == 0)){
                noOfDays = 29; // it is a leap year
            }
            // checking if year is divisible by 4
            else if(year % 4 == 0){
                noOfDays = 29; // it is a leap year
            }
            // if it is not leap year
            else{
                noOfDays = 28;
            }

        }
        // for months with 30 days
        else if(month == 4 || month == 6 || month == 9 || month == 11){
            noOfDays = 30;
        }
        // if the month is invalid
        else{
            noOfDays = 0;
        }

        // return number of Days
        return noOfDays;
    }
}

