package dao;

import Entity.Perfume;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Services implements PerfumeService {

    private Connection conn = SQLite.getConnection();
    private List<Perfume> list = new ArrayList<>();
    private Statement statement;
    private ResultSet resultSet;

    private ResultSet getResultSet(String strSQL) {
        try {
            statement = conn.createStatement();
            resultSet = statement.executeQuery(strSQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    public List<Perfume> allPerfume() {

        try {
            getResultSet("select * from Perfume");
            while (resultSet.next()) {
                list.add(new Perfume(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4),
                        resultSet.getString(5), resultSet.getString(6), resultSet.getDouble(7)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean update(String strSQL) {
        int num = 0;
        try {
            statement = conn.createStatement();
            num = statement.executeUpdate(strSQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return num > 0;
    }

    @Override
    public boolean addPerfume(Perfume perfume) {
        String strSQL = "insert into Perfume values(" + perfume.getId() + ",'" + perfume.getName() + "'," +
                "'" + perfume.getBrand() + "','" + perfume.getFragrance() + "','" + perfume.getOdor() + "','" + perfume.getPerfumer() + "'," + perfume.getPrice() + ")";
        return update(strSQL);
    }

    @Override
    public boolean delPerfume(int id) {
        String strSQL = "delete from Perfume where id = " + id;
        return update(strSQL);
    }

    @Override
    public boolean updatePerfume(Perfume perfume) {
        String strSQL = "update Perfume set name = '" + perfume.getName() + "',brand = '" + perfume.getBrand() + "',fragrance = '" + perfume.getFragrance() + "',odor= '" + perfume.getOdor() + "',perfumer = '" + perfume.getPerfumer() + "',price =" + perfume.getPrice() + " where id = " + perfume.getId();
        return update(strSQL);
    }

    public List<Perfume> selePerfume(String s) {
        String strSQL = "select * from Perfume where id like '%" + s + "%' or name= '%" + s + "%' or brand = '%" + s + "%' or fragrance = '%" + s + "%' or odor = '%" + s + "%' or perfumer = '%" + s + "%' or price = '%" + s + "%'";
        try {
            getResultSet(strSQL);
            while (resultSet.next()) {
                list.add(new Perfume(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4),
                        resultSet.getString(5), resultSet.getString(6), resultSet.getDouble(7)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
