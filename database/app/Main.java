package database.app;

import database.sql.SQLConnection;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by ksv on 11/29/16.
 */
public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        //studentService.insert();
        studentService.delete();
    }
}
