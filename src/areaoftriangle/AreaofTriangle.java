/*
 * William Z.
 * This is a program to calculate the area of a triangle.
 */

package areaoftriangle;
import static java.lang.Math.*;
import javax.swing.*;

/**
 *
 * @author wizwa9381
 */
public class AreaofTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Stating reason for this program's existence.
        System.out.println("This program will calculate the area of a scalene triangle.");
        //Variables.
        double s;
        double a;
        double b;
        double c;
        double area;
        //Getting user's  measurements and calculating s.
        a = Integer.parseInt(JOptionPane.showInputDialog("What one of the lengths of a side of your triangle?"));
        b = Integer.parseInt(JOptionPane.showInputDialog("What another one of the lengths of a side of your triangle?"));
        c = Integer.parseInt(JOptionPane.showInputDialog("What the final length of the last side of your triangle?"));
        s = (a+b+c)/2;
        //Printing out side lengths.
        System.out.println("1st length: "+a);
        System.out.println("2nd length: "+b);
        System.out.println("3rd length: "+c);
        //Calculating area.
        area = sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The area of your triangle is: "+area+"units squared.");
    }
    
}
