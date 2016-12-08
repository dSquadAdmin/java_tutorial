package database.sql;

import java.sql.*;

/**
 * Created by ksv on 11/29/16.
 */
public class SQLConnection {
    private String database;
    private String uri;
    private String user;
    private String password;

    private Connection connection = null;

    public SQLConnection(){
        this.database = "BTS";
        this.uri = "jdbc:mysql://localhost:3306/"+this.database;
        this.user = "root";
        this.password="";
    }

    public SQLConnection(String database) throws ClassNotFoundException{
        this.database = database;
        this.uri = "jdbc:mysql://localhost:3306/"+this.database;
        this.user = "root";
        this.password="";
        Class.forName("com.mysql.jdbc.Driver");
    }

    public boolean connect(){
        try{
            this.connection = DriverManager.getConnection(this.uri, user, password);
            System.out.println("Databse connected ..!!");
            return true;
        }catch (SQLException sqlException){
            System.out.println(sqlException.getMessage());
            return false;
        }
    }


    public void close(){
       try{
           if(connection!=null){
               connection.close();
           }
       }
       catch (SQLException e){
       }
    }

    public void displayData(){
        try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM student");
            while (rs.next()){
                System.out.println(rs.getInt("id") +"\t"
                        + rs.getString("name")+"\t"+
                        rs.getString("address"));
            }
        }catch (SQLException e){
            System.out.println("Connection may be null!");
        }
    }

    public void insertData(String name, String address){
        try{
            Statement statement = connection.createStatement();
            String update = "INSERT INTO student(id, name, address)"
                    +"VALUES (id,'"+name+"','"+address+"');";
            statement.executeUpdate(update);
        }catch (SQLException e){
        }
    }

    public PreparedStatement getPreparedStatement(String query){
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return preparedStatement;
    }
}
