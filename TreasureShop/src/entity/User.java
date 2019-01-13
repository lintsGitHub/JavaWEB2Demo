package entity;

public class User {
    private int userID;
    private String userName;
    private String userTel;
    private String userMail;
    private String userPsw;
    private String userStatus;

    public User(int userID, String userName, String userTel, String userMail, String userPsw, String userStatus) {
        this.userID = userID;
        this.userName = userName;
        this.userTel = userTel;
        this.userMail = userMail;
        this.userPsw = userPsw;
        this.userStatus = userStatus;
    }

    public User() {
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getUserPsw() {
        return userPsw;
    }

    public void setUserPsw(String userPsw) {
        this.userPsw = userPsw;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }
}
