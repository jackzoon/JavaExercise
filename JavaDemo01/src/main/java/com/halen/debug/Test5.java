package com.halen.debug;

class User {
    private String username;
    private String pwd;
    private String userType;

    public User(String username, String pwd, String userType) {
        this.username = username;
        this.pwd = pwd;
        this.userType = userType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}

public class Test5 {

    public static void main(String[] args) {
        User user = new User("张三", "123", "董事长");
        login(user);
    }

    public static void login(User user) {
        String userType = user.getUserType();
        switch (userType) {
            case "超级管理员":
                System.out.println("超级管理员逻辑");
                break;
            case "董事长":
                System.out.println("董事长逻辑");
                break;
            case "员工":
                System.out.println("员工逻辑");
                break;
        }
    }

}
