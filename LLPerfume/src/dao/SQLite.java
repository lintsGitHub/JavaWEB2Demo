package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLite {
    private static Connection conn;
    static {
        String fileName = "E:/JavaWEB/LLPerfume/DataBase/LLPerfume.db";
        try {
            Class.forName("org.sqlite.JDBC");
           conn = DriverManager.getConnection("jdbc:sqlite:"+fileName);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        return conn;
    }
}
