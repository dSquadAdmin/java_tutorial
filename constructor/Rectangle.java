package constructor;

import java.util.Scanner;
/**
 * Created by ksv on 11/15/16.
 */
public class Rectangle {
    float length;
    float breadth;

    public Rectangle(){   // this is constructor
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length: " );
        this.length = in.nextFloat();
        System.out.print("Enter Breadth: " );
        this.breadth = in.nextFloat();
    }

    public void area(){
        System.out.println("Area = "+ (length*breadth));
    }

    public static void main(String[] args) {
        new Rectangle().area();
    }
}
