package com.vti.entity;

public class Account2 {

    private String id;
    private String name;
    private int balance;

    public Account2(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    public int credit(int amount){
        return this.balance += amount;
    }
    public int debit(int amount){
        return this.balance -= amount;
    }

    public void transferTo(Account2 acc, int amount ){
        this.balance -= amount;
        acc.balance += amount;
    }
}
