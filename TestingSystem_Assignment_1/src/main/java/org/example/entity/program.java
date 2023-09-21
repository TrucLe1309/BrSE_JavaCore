package org.example.entity;

import java.time.LocalDate;

public class program {
    public static void main(String[] args) {
        //------Department--------//
        Department department1 = new Department();
        department1.id=1;
        department1.name = "Chủ tịch";

        Department department2 = new Department();
        department2.id =2;
        department2.name = "Giám đốc";

        Department department3 = new Department();
        department3.id =3;
        department3.name = "Nhân sự";

        //------Position--------//
        Position position1= new Position();
        position1.id = 1;
        position1.name = PositionName.DEV;

        Position position2= new Position();
        position2.id= 2;
        position2.name = PositionName.PM;

        Position position3= new Position();
        position3.id= 3;
        position3.name = PositionName.TEST;

        //------Account-------//

        Account account1= new Account();
        account1.id = 1;
        account1.email= "account1@.com";
        account1.userName= "acccount1";
        account1.fullName= "Nguyen A";
        account1.position=position1;
        account1.department=department1;
        account1.createDate= LocalDate.of(2010, 3, 19);

        Account account2= new Account();
        account2.id = 2;
        account2.email= "account2@.com";
        account2.userName= "acccount2";
        account2.fullName= "Nguyen V";
        account2.position=position2;
        account2.department=department2;
        account2.createDate= LocalDate.of(2010, 3, 19);

        Account account3= new Account();
        account3.id = 3;
        account3.email= "account3@.com";
        account3.userName= "account3";
        account3.fullName= "Nguyen K";
        account3.position=position3;
        account3.department=department3;
        account3.createDate= LocalDate.of(2010, 3, 19);

        // Câu 3:Trong file Program.java,
        // hãy in ít nhất 1 giá trị của mỗi đối tượng ra
        System.out.println("Thông tin phòng ban thứ 1.");
        System.out.println("ID = " + department1.id);
        System.out.println("Name="+department1.name);

        System.out.println("Thong tin chuc vu thu 1");
        System.out.println("ID="+position1.id);
        System.out.println("Name="+position1.name);

        System.out.println("Thong tin nguoi dung thu 1");
        System.out.println("ID =" + account1.id);
        System.out.println("email=" + account1.email);
        System.out.println("Username="+ account1.userName);
        System.out.println("fullName=" + account1.fullName);
        System.out.println("Department="+ account1.department.name);
        System.out.println("Position="+ account1.position.name);
        System.out.println("Created Date="+ account1.createDate);

    }
}

