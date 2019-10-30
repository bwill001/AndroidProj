package com.example.androidapp.data.accountInfo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

class UserAccount {
    private int acctID;
    private String accountType;

    private String username;
    private String password;

    private String creationDate;

    private String firstName;
    private String lastName;
    private String birthday;
    private String address;
    private String email;
    private String phoneNumber;
    static int numOfAccounts;

    protected UserAccount(String username, String password, String fname, String lname, String address,
                          String email, String phone) {
        this.username = username;
        this.password = password;
        this.firstName = fname;
        this.lastName = lname;
        this.address = address;
        this.email = email;
        this.phoneNumber = phone;
        this.accountType = "Standard Account";

        //account id corresponds to order of creation
        UserAccount.numOfAccounts++;
        this.acctID = numOfAccounts;

        DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
        this.creationDate = df.format(Calendar.getInstance().getTime());
    }

    public int getAcctID() {
        return acctID;
    }

    public void setAcctID(int acctID) {
        this.acctID = acctID;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

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

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
