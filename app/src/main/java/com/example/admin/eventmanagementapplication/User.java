package com.example.admin.eventmanagementapplication;


import android.text.Editable;

public class User {
    public String user;
    public String pass;
    public String cpass;
    public String college;
    public String city;
    public String mobile;
    public String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(){
    }
    public String getUsername()
    {
        return user;
    }
    public void setUsername(String user)
    {
        this.user = user;
    }
    public void setPassword(String pass)
    {
        this.pass = pass;
    }
    public String getPassword()
    {
        return pass;
    }

    public String getCpass() {
        return cpass;
    }

    public void setCpass(String cpass) {
        this.cpass = cpass;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}


