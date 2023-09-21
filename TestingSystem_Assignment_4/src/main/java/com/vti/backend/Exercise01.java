package com.vti.backend;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Position;

import java.security.acl.Group;
import java.time.LocalDateTime;

public class Exercise01 {


    public static void question01() {
        Department departmentA = new Department();
        Department departmentB = new Department("Giám đốc");
    }
 public static void  question02(){
     Account accountA = new Account();
     Account accountB = new Account(1, "Anha", "abc", "Nguyen ", "Le");
     System.out.println("accountB = " + accountB);

     Account accountC  = new Account(2,"a@", "username", "Anh", "Hao", new Position());
     System.out.println("accountC = " + accountC);

     Account accountD = new Account(3, "C.@gmail.com", "CC", "Cong", "Anh", new Position(), LocalDateTime.now());
     System.out.println("accountD = " + accountD);

 }
    public static void question03() {
        /*Group groupA = new Group();
        Group groupB = new Group("Java core", new Account(), LocalDateTime.now(), new Account[]{new Account()});
        GroupC = new Group("Java core", new Account(), LocalDateTime.now(), new String[]{"linv"});
        */

    }



    }
