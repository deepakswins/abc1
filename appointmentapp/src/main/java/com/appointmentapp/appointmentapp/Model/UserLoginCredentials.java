package com.appointmentapp.appointmentapp.Model;

public class UserLoginCredentials {
    private String userName;
    private String password;

    public UserLoginCredentials(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    private void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }
    public UserLoginCredentials()
    {

    }
}
