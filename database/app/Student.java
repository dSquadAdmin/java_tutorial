package database.app;

import database.sql.SQLConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by ksv on 12/1/16.
 */
public class Student {
    public static final String insert = "INSERT INTO student(name, address) VALUES(?,?)";
    public static final String del = "DELETE FROM student WHERE id=?";
    public static final String update = "UPDATE student SET name=?, password=? WHERE id=?";

    int id;
    String name;
    String address;
}
