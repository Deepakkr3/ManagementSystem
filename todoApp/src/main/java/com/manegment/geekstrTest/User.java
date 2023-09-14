package com.manegment.geekstrTest;

public class User {
  private int userId;
  private String name;
  private  String userName;
  private String address;
  private String mobNo;

    public User(int userId, String name, String userName, String address, String mobNo) {
        this.userId = userId;
        this.name = name;
        this.userName = userName;
        this.address = address;
        this.mobNo = mobNo;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }
}
