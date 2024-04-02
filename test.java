import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class test {
    public static void main(String[] args) {
        double discountRate;
        char custType = 'B';

        switch (custType) {
            case 'A':
                discountRate = 0.08; 
                break;
            case 'B':
                discountRate = 0.06;
            case 'C':
                discountRate = 0.04;
            default:
                discountRate = 0.0;
        }
        System.out.println(discountRate);
    }
}