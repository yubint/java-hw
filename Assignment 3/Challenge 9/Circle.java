/**
 * Description: This program creates a class named Circle
 * Class: Spring - COSC-1437-82703
 * Assignment3: Circle
 * Date: 02/05/2024
 * 
 * @author Amir Jung Basnet
 * @version 1.0.0
 */
public class Circle {
    // initializing fields
    private double radius; 
    private final double PI = 3.14159;

    
    /**
     * @param double as r
     * @return None
     * @throws Nothing is implemented
     */
    public Circle(double r){
        radius = r; //setting radius to r
    }

    /**
     * @param double as r
     * @return None
     * @throws Nothing is implemented
     */
    public void setRadius(double r){
        radius = r; // setting radius to r
    }

    /**
     * @param None
     * @return radius of the circle
     * @throws Nothing is implemented
     */
    public double getRadius(){
        return radius; 
    }

    /**
     * @param None
     * @return Area of the circle
     * @throws Nothing is implemented
     */
    public double getArea(){
        return PI * radius * radius;
    }

    /**
     * @param None
     * @return Diameter of the circle
     * @throws Nothing is implemented
     */
    public double getDiameter(){
        return radius / 2;
    }

    /**
     * @param None
     * @return Circumference of the Circle
     * @throws Nothing is implemented
     */
    public double getCircumference(){
        return 2 * PI * radius;
    }
}
