package total;
import java.time.LocalDate;

public class program {
    public static void main(String[] args) {
        //------Department--------//
        Department department1 = new Department();
        department1.id = 1;
        department1.name = "Chủ tịch";

        Department department2 = new Department();
        department2.id = 2;
        department2.name = "Giám đốc";

        Department department3 = new Department();
        department3.id = 3;
        department3.name = "Nhân sự";

        Department department4 = new Department();
        department4.id = 4;
        department4.name = "Tài chính";

        //------Position--------//
        Position position1 = new Position();
        position1.id = 1;
        position1.name = PositionName.DEV;

        Position position2 = new Position();
        position2.id = 2;
        position2.name = PositionName.PM;

        Position position3 = new Position();
        position3.id = 3;
        position3.name = PositionName.TEST;


        Position position4 = new Position();
        position4.id = 4;
        position4.name = PositionName.SCRUM_MASTER;

        //------Account-------//

        Account account1 = new Account();
        account1.id = 1;
        account1.email = "account1@.com";
        account1.userName = "acccount1";
        account1.fullName = "Nguyen A";
        account1.position = position1;
        account1.department = department1;
        account1.createDate = LocalDate.of(2010, 3, 19);

        Account account2 = new Account();
        account2.id = 2;
        account2.email = "account2@.com";
        account2.userName = "acccount2";
        account2.fullName = "Nguyen V";
        account2.position = position2;
        account2.department = department2;
        account2.createDate = LocalDate.of(2010, 3, 19);

        Account account3 = new Account();
        account3.id = 3;
        account3.email = "account3@.com";
        account3.userName = "account3";
        account3.fullName = "Nguyen K";
        account3.position = position3;
        account3.department = department3;
        account3.createDate = LocalDate.of(2010, 3, 19);

        //------Group-------//

        Group group1 = new Group();
        group1.id = 1;
        group1.name = "ABC";
        group1.creator = account1;
        group1.CreateDate = LocalDate.of(2011, 2, 2);

        Group group2 = new Group();
        group2.id = 2;
        group2.name = "BCD";
        group2.creator = account3;
        group2.CreateDate = LocalDate.of(2011, 2, 2);

        Group group3 = new Group();
        group3.id = 3;
        group3.name = "ABC";
        group3.creator = account1;
        group3.CreateDate = LocalDate.of(2011, 2, 2);

        Group group4 = new Group();
        group4.id = 4;
        group4.name = "DEF";
        group4.creator = account2;
        group4.CreateDate = LocalDate.of(2011, 2, 2);


        if (account2.department == null) {
            // Chay neu dung
            System.out.println("Nhan vien nay chua co phong ban");
        } else {
            //Chay neu sai
            System.out.println("Phong ban cua nhan vien nay la Dev");
        }

    }
}
