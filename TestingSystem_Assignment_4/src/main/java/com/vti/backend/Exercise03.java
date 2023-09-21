package com.vti.backend;

import com.vti.entity.Account;
import com.vti.entity.Position;

public class Exercise03 {
    public static void question01(){
        Account account1 = new Account();
        System.out.println("account1 = " + account1);
        account1.setId(100);
        System.out.println("account1 = " + account1);
        account1.getDepartment();
        System.out.println("account1 = " + account1);

        Account account2 = new Account(2000, "email123", "thitruc", "Truc ", "Le",new Position());
        System.out.println("account2.getDepartment() = " + account2.getDepartment());
    }


}
