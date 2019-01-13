package dao;

import entity.User;

import java.util.List;

public interface userSerice {
    boolean addUser(User user);
    boolean delUser(User user);
    List<User> userList();

}
