package com.edu.TempletePattern.JDBC;

/**
 * @ClassName Member
 * @Description
 * @Author Administrator
 * @Date 2020/7/8 0008 11:08
 */
public class Member {
    private String username;
    private String password;
    private String nickName;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
