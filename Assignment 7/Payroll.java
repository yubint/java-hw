/**
 * Contains seven employee ids in an array, an hours worked array, a pay rate array, and
 * a gross wages array. Contains a method to get the gross wage of the corresponding employee
 * when an employee id is given.
 * 
 * Class: Spring - COSC-1437-82703
 * Assignment7: Payroll
 * Date: 04/02/2024
 * 
 * @author Amir Jung Basnet
 * @version 1.0.0
 *
 */
public class Payroll {
	private int[] employeeId = { 5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489 };
	private int[] hours = new int[7];
	private double[] payrate = new double[7];
	private double[] wages = new double[7];
	
	
	public int getEmployeeId(int index)
	{
		return employeeId[index];
	}
	
	public int[] getHours()
	{
		return hours;
	}
	
	public int getHours(int index)
	{
		return hours[index];
	}
	
	public double[] getPayrate()
	{
		return payrate;
	}
	
	public double getPayrate(int index)
	{
		return payrate[index];
	}
	
	/**
	 * Finds the wage of an employee and returns it.
	 * 
	 * @param id The employee's ID
	 * @return The wage of the employee whose ID was given. Returns -1 if no employee was found.
     * @throws Nothing is implemented
	 */
	public double getWageById(int id)
	{
		for (int index = 0; index < 7; index++)
		{
			if (id == employeeId[index])
			{
				return wages[id];
			}
		}
		
		return -1;
	}
	
	public double[] getWages()
	{
		return wages;
	}
	
	public double getWages(int index)
	{
		return wages[index];
	}
	
	public void setEmployeeId(int index, int employeeId)
	{
		this.employeeId[index] = employeeId; 
	}
	
    /**
     * Set the hours at an index and Updates the wages of that index accordingly
     * 
     * @param index Index of the Employee
     * @param hours Hours worked by the employee
     * @return void
     * @throws Nothing is implemented
     */
	public void setHours(int index, int hours)
	{
		this.hours[index] = hours;
        this.wages[index] = this.payrate[index] * hours;
	}

    /**
     * Set the Payrate at an index and Updates the wages of that index accordingly
     * 
     * @param index Index of the Employee
     * @param payRate Payrate of the Employee
     * @return void
     * @throws Nothing is implemented
     */
	public void setPayRate(int index, double payRate)
	{
		this.payrate[index] = payRate;
        this.wages[index] = this.hours[index] * payRate;
	}
	
}