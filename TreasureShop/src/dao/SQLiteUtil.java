package dao;

import entity.Goods;
import entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SQLiteUtil {
    Connection conn = SQLiteConn.getConn();
    ResultSet rs;
    static PreparedStatement statement;

    //修改方法
    public boolean update(String str, String... strs) {
        try {
            statement = conn.prepareStatement(str);
            int len = strs.length;
            for (int i = 0; i < len; i++) {
                statement.setString(i + 1, strs[i]);
            }
            //statement.setString(len,strs[len]);
            int num = statement.executeUpdate();
            if (num > 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    //查询用户信息
    List<User> userlist = new ArrayList<>();

    public List<User> sele(String str, String... strs) throws SQLException {
        statement = conn.prepareStatement(str, strs);
        rs = statement.executeQuery();
        while (rs.next()) {
            userlist.add(new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
        }
        return userlist;
    }

    //查询商品信息
    List<Goods> goodsList = new ArrayList<>();

    public List<Goods> seleGoods(String str, String... strs) {
        try {
            statement = conn.prepareStatement(str);
            if (strs != null) {
                int len = strs.length;
                for (int i = 0; i < len; i++) {
                    statement.setString(i + 1, strs[i]);
                }
            }
            rs = statement.executeQuery();
            while (rs.next()) {
                goodsList.add(new Goods(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getString(5)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return goodsList;
    }


    //查询有没有数据的方法
    public int seleOrNot(String str, String... strs) {
        try {
            statement = conn.prepareStatement(str);
            int len = strs.length;
            for (int i = 0; i < len; i++) {
                statement.setString(i + 1, strs[i]);
            }
            ResultSet resultSet = statement.executeQuery();
            int count = 0;
            while (resultSet.next()) {
                count += resultSet.getInt(1);
            }
            return count;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    //查单个信息
    List<String> stringList;

    public List<String> typeList(String strSQL ,String...strs) {
         stringList = new ArrayList<>();
        try {
            int len = strs.length;
            statement = conn.prepareStatement(strSQL);
            if(len==1){
                statement.setString( 1, strs[0]);
            }else if (strs != null) {
                for (int i = 0; i < len; i++) {
                    statement.setString(i + 1, strs[i]);
                }
            }
            rs = statement.executeQuery();
            while (rs.next()) {
                stringList.add(rs.getString(1));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return stringList;
    }
}
