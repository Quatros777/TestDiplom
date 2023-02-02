package com.example.testdiplom.entity;

import com.fasterxml.jackson.annotation.*;
import java.sql.Date;


public class User extends BaseEntity {
    @JsonInclude
    @JsonProperty("user_name")
    @JsonAlias("userName")
    private String userName;
    @JsonInclude
    @JsonProperty("user_birthday")
    @JsonAlias("userBirthday")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date userBirthday;

    @JsonInclude
    @JsonFormat(pattern = "yyyy-MM-dd")
    @JsonProperty("user_reg_date")
    @JsonAlias("userRegDate")
    private Date userRegDate;

    @JsonInclude
    @JsonProperty("user_email")
    @JsonAlias("userEmail")
    private String userEmail;


    @JsonProperty("user_password")
    @JsonAlias("userPassword")
    private String userPassword;


    @JsonProperty("avatar_path")
    @JsonInclude
    @JsonAlias("avatarPath")
    private Files avatarPath;

    @JsonInclude
    @JsonProperty("user_phone_number")
    @JsonAlias("userPhoneNumber")
    private String userPhoneNumber;

    @JsonInclude
    @JsonProperty("user_is_confirm")
    @JsonAlias("userIsConfirm")
    private Boolean userIsConfirm;

    public User(
            String oid, String userName,
            Date userBirthday, Date userRegDate, String userEmail, String userPassword, Files avatarPath,
            String userPhoneNumber, Boolean userIsConfirm
    ) {
        super(oid);
        this.userName = userName;
        this.userBirthday = userBirthday;
        this.userRegDate = userRegDate;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.avatarPath = avatarPath;
        this.userPhoneNumber = userPhoneNumber;
        this.userIsConfirm = userIsConfirm;
    }

    public User() {

    }

    public Files getAvatarPath() {
        return avatarPath;
    }

    public void setAvatarPath(Files avatarPath) {
        this.avatarPath = avatarPath;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public Date getUserRegDate() {
        return userRegDate;
    }

    public void setUserRegDate(Date userRegDay) {
        this.userRegDate = userRegDay;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Boolean getUserIsConfirm() {
        return userIsConfirm;
    }

    public void setUserIsConfirm(Boolean userIsConfirm) {
        this.userIsConfirm = userIsConfirm;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }
}
