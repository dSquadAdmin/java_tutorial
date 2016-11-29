package abstractandfinal;


import inheritance.classinheritance.employee.*;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by ksv on 11/22/16.
 */
public class Manager extends Employee {
    public Manager(){
        super();
        this.post = "MANAGER";
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void setName(String firstName, String lastName, char sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
    }

    @Override
    public void setPost(String post){
        this.post = post;
    }

    @Override
    public void setSalary(long salary){
        this.salary = salary;
    }

    public void enterInformation(){
        try{
            Scanner in = new Scanner(System.in);
            System.out.print("Enter First Name:");
            String name = in.next();
            System.out.print("Enter Last Name:");
            String lName = in.next();
            System.out.print("Sex: ");
            char sex = in.next().charAt(0);

            System.out.print("Address: ");
            String address = in.next();

            this.setName(name, lName, sex);
            this.setAddress(address);
            this.setSalary(new Salary().MANAGER_SALARY);
        }
        catch(InputMismatchException e){
            e.printStackTrace();
        }
    }

    public void displayInfo(){
        System.out.println("Name: "+ firstName + " " + lastName);
        System.out.println("Sex: "+ sex);
        System.out.println("Salary: "+ salary);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.enterInformation();
        manager.displayInfo();
    }
}
