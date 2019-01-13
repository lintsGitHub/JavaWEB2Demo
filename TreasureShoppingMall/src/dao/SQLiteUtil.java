package dao;

import entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SQLiteUtil {
    Connection conn = SQLiteConn.getConn();
    //修改方法

    public boolean update(String str, String... strs) {
        try {
            PreparedStatement statement = conn.prepareStatement(str);
            for (int i = 1; i < strs.length; i++) {
                statement.setString(i, strs[i - 1]);
            }
            int num = statement.executeUpdate();
            if (num > 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    List<User> userlist = new ArrayList<>();
    ResultSet rs;

    public List<User> sele(String str, String... strs) throws SQLException {
        PreparedStatement statement = conn.prepareStatement(str, strs);
        rs = statement.executeQuery();
        while (rs.next()) {
            userlist.add(new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
        }
        return userlist;
    }
}
