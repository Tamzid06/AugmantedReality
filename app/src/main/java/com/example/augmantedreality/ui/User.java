package com.example.augmantedreality.ui;


import java.util.ArrayList;

public class User {
    private String username; // Initialized by Constructor
    private String email; // Initialized by Constructor
    private String password; // Initialized by Constructor
    private String phone; // Initialized by Constructor
    private String birthday; // Initialized by Constructor
    private String id; // Initialized by Constructor
    private ArrayList<Integer> result ;
    private int totalMarks;
    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)

    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }
    public User(String username, String email, String password, String phone, String birthday,String id) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.birthday = birthday;
        this.id = id;
        result = new ArrayList<Integer>(15);
    }

    public ArrayList<Integer> getResult() {
        return result;
    }

    public void setResult(ArrayList<Integer> result) {
        this.result = result;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

}
