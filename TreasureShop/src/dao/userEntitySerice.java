package dao;

import entity.User;

import java.util.List;

public class userEntitySerice implements userSerice {
    SQLiteUtil util = new SQLiteUtil();
//    添加一个用户
    public boolean addUser(User user) {
        util = new SQLiteUtil();
        String strSQL = "insert  into user (userName,userTel,userMail,userPsw,userStatus) values (?,?,?,?,?)";
        return util.update(strSQL,user.getUserName(),user.getUserTel(),user.getUserMail(),user.getUserPsw(),user.getUserStatus());
    }

    public boolean delUser(User user) {
        return false;
    }

    public List<User> userList() {
        return null;
    }

    @Override
//    改变用户的状态
    public boolean updataType( String userName ,String type) {
        String strSQL = "update user set userStatus = ? where userName = ?";
        return util.update(strSQL,type,userName);
    }

    @Override
//    检查登录进来的用户是否正确
    public boolean checkUser(String userName, String psw) {
        if(checkUserName(userName)) {
            String pswSQL = "select userID from user where userName = ? and userPsw = ?";
            int res = util.seleOrNot(pswSQL, userName, psw);
            if (res > 0) {
                return true;
            }
        }
        return false;
    }

    @Override
//    检查有没有这个用户名
    public boolean checkUserName(String userName) {
        String nameSQL = "select count(*) from user where userName = ?"; // 查出有没有该用户
        int userCount = util.seleOrNot(nameSQL, userName);
        if (userCount>0){
            return true;
        }else
        return false;
    }
//    根据用户名查用户编号
    public String checkID(String strName){
        String strSQL = "select userID from user where userName = ?";
        List<String> list = util.typeList(strSQL, strName);
        return list.get(0);
    }
}
