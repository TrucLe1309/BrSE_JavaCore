package com.vti.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Group {
    public LocalDate CreateDate;
    int id;
    String name;
    Account creator;
    LocalDate createDate;
    Account[] accounts;

    public Group() {
    }

    public Group(String name, Account creator, LocalDateTime createDate, Account[] accounts) {
        this.name = name;
        this.creator = creator;
        this.createDate = LocalDate.from(createDate);
        this.accounts = accounts;
    }

    public Group(String name, Account creator, LocalDateTime createdDate, String[] usernames) {
        this.name = name;
        this.creator = creator;
        this.createDate = createDate;
        // Convert String[] to entity.Account[]
        this.accounts = new Account[usernames.length];
        for (int i = 0; i < usernames.length; i++) {
            Account account = new Account();
            account.setUserName(usernames[i]);
            accounts[i] = account;
        }
    }

    @Override
    public String toString() {
        return "Group{" +
                "CreateDate=" + CreateDate +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", creator=" + creator +
                ", createDate=" + createDate +
                ", accounts=" + Arrays.toString(accounts) +
                '}';
    }
}
