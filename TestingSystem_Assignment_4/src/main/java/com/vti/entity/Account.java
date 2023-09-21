package com.vti.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Account {
    private int id;
    private  String email;
    private String userName;
    private String fullName;
    private Department department;
    private  Position position;
    private LocalDate createDate;
    Group[] groups;


    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id= id;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public String getFullName() {
        return fullName;
    }

    public Department getDepartment() {
        return department;
    }

    public Position getPosition() {
        return position;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public Account(){

    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", department=" + department +
                ", position=" + position +
                ", createDate=" + createDate +
                ", groups=" + Arrays.toString(groups) +
                '}';
    }

    public Account(int id, String email, String userName, String firstName, String lastName
                   ){
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.fullName= firstName + lastName;

    }

    public  Account(int id, String email, String userName, String firstName, String lastName,
                    Position position){
        this(id, email, userName, firstName, lastName);
        this.position = position;
        this.createDate = LocalDate.from(LocalDateTime.now());
    }
    public Account(int id, String email, String username, String firstName, String lastName, Position position, LocalDateTime createdDate) {
        this(id, email, username, firstName, lastName);
        this.position = position;
        this.createDate = LocalDate.from(createdDate);
    }

}
