package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteConn {
    private static Connection conn;

    public static void setConn(Connection conn) {
        SQLiteConn.conn = conn;
    }

   static  {
        try {
            Class.forName("org.sqlite.JDBC");
            String sqlitePath = "E:/JavaWEB/TreasureShoppingMall/Data/Treasure.db";
            setConn( DriverManager.getConnection("jdbc:sqlite:"+sqlitePath));
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConn() {
        return conn;
    }

}
