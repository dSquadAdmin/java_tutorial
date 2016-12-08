package database.app;

import database.sql.SQLConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 * Created by ksv on 12/1/16.
 */
public class StudentService extends Student{
    SQLConnection connection = null;
    public StudentService(){
        connection = new SQLConnection();
        connection.connect();
    }

    private void enterInfo(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Name: "); this.name = in.nextLine();
        System.out.print("Enter Address: "); this.address = in.nextLine();
        in.close();
    }

    private void setId() {
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Enter ID: ");
            this.id = in.nextInt();
        }
        catch (Exception e){
            setId();
        }
    }

    public void insert(){
        try{
            PreparedStatement statement = connection.getPreparedStatement(this.insert);
            statement.setString(1, this.name);
            statement.setString(2, this.address);
            statement.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void update(){
        try{
            PreparedStatement statement = connection.getPreparedStatement(this.update);
            this.setId();
            this.enterInfo();
            statement.setString(1, this.name);
            statement.setString(2, this.address);
            statement.setInt(3, this.id);
            statement.execute();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void delete(){
        try{
            PreparedStatement statement = connection.getPreparedStatement(this.del);
            this.setId();
            statement.setInt(1, this.id);
            statement.execute();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void getInformation(){

    }

}
