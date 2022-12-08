package com.nest.shoppingcartbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "userregister")
public class UserRegister {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String address;
    private String phoneno;
    private String emailId;
    private String userName;
    private String password;
    private String confirmPassword;

    public UserRegister() {
    }

    public UserRegister(int id, String name, String address, String phoneno, String emailId, String userName, String password, String confirmPassword) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneno = phoneno;
        this.emailId = emailId;
        this.userName = userName;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
