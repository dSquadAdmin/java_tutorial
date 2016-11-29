package interfaces;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by ksv on 11/23/16.
 */
public class Student implements Information {   // interfaces must be implemented
    private String name;
    private String address;
    private String grade;
    private String collegeID;

    public Student(){
        this.displayInfo();
    }

    @Override
    public void getInformation() {
        System.out.println("Students' Name: "+ this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Class: " + this.grade );
        System.out.println("College ID No.: "+ this.collegeID);
    }

    @Override
    public void setInformation() {
        try{
            Scanner in = new Scanner(System.in);
            System.out.print("Students' Name: ");
            this.name = in.next();
            System.out.print("Address: ");
            this.address = in.next();
            System.out.print("Class: ");
            this.grade = in.next();
            System.out.print("College ID No. : ");
            this.collegeID = in.next();
        }catch (InputMismatchException e){
            e.printStackTrace();
        }
    }


    @Override
    public void displayInfo(){ // default method can be overridden
        System.out.println("This is from implemented class");   
    }


    public static void main(String[] args) {
        Student student = new Student();
        student.setInformation();
        student.displayInfo();
        student.getInformation();
    }
}
