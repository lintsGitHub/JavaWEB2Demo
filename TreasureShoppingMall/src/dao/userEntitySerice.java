package dao;

import entity.User;

import java.util.List;

public class userEntitySerice implements userSerice  {
    public boolean addUser(User user) {
        SQLiteUtil util = new SQLiteUtil();
        String strSQL = "insert  into (userID,userName,userTel,userMail,userPsw,userStatus) values (?,?,?,?,?)";
        return util.update(strSQL,user.getUserName(),user.getUserTel(),user.getUserMail(),user.getUserPsw(),user.getUserStatus());
    }

    public boolean delUser(User user) {
        return false;
    }

    public List<User> userList() {
        return null;
    }
}
