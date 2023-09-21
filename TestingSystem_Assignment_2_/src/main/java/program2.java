import java.time.LocalDate;

public class program2 {
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

        //------Account-------//

        Account account1 = new Account();
        account1.id = 10;
        account1.email = "account1@.com";
        account1.userName = "acccount1";
        account1.fullName = "Nguyen A";
        account1.position = position1;
        account1.department = department1;
        account1.createDate = LocalDate.of(2010, 3, 19);
        Group group1 = null;
        Group group2 = null;
        Group[] groupAccount1 = {group1, group2};
        account1.groups = groupAccount1;


        Account account2 = new Account();
        account2.id = 2;
        account2.email = "account2@.com";
        account2.userName = "acccount2";
        account2.fullName = "Nguyen V";
        account2.position = position2;
        account2.department = department2;
        account2.createDate = LocalDate.of(2010, 3, 19);
        Group group3 = null;
        Group[] groupAccount2 = {group1, group2, group3};
        account2.groups = groupAccount2;

        Account account3 = new Account();
        account3.id = 3;
        account3.email = "account3@.com";
        account3.userName = "account3";
        account3.fullName = "Nguyen K";
        account3.position = position3;
        account3.department = department3;
        account3.createDate = LocalDate.of(2010, 3, 19);
        Group[] groupAccount3 = {group1, group3};
        account3.groups = groupAccount3;




        //------Group-------//

        group1 = new Group();
        group1.id = 1;
        group1.name = "ABC";
        group1.creator = account1;
        group1.CreateDate = LocalDate.of(2011, 2, 2);

        group2 = new Group();
        group2.id = 2;
        group2.name = "BCD";
        group2.creator = account3;
        group2.CreateDate = LocalDate.of(2011, 2, 2);

        group3 = new Group();
        group3.id = 3;
        group3.name = "ABC";
        group3.creator = account1;
        group3.CreateDate = LocalDate.of(2011, 2, 2);

        Group group4 = new Group();
        group4.id = 4;
        group4.name = "DEF";
        group4.creator = account2;
        group4.CreateDate = LocalDate.of(2011, 2, 2);


    //-----QUESTION1------//
        System.out.println("-----QUESTION 01------");
        if (account2.department == null) {
            // Chay neu dung
            System.out.println("Nhan vien nay chua co phong ban");
        } else {
            // Chay neu sai
            System.out.println("Phong ban cua nhan vien nay la " + account2.department.name);

        }
    //-----QUESTION2------//
        //Kiểm tra account thứ 2
        //Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
        //Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên
        // này là Java Fresher, C# Fresher"
        //Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người
        //quan trọng, tham gia nhiều group"
        //Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là
        //người hóng chuyện, tham gia tất cả các group"
        System.out.println("-----QUESTION 02------");
        if (account2.groups == null) {
            System.out.println("Nhân viên này chưa có group");
        } else {
            int countGroups = account2.groups.length;
            if (countGroups == 1 || countGroups == 2)
                System.out.println("Group cua nhan vien nay la Java Fresher, C# Fresher");
            if (countGroups == 3)
                System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
            if (countGroups >= 4)
                System.out.println("Nhân viên này la người hóng chuyện, tham gia tất cả các group");

        }

    //-----QUESTION 3------//
    // Sử dụng toán tử ternary để làm Question 1
            System.out.println("-----QUESTION 03------");
            String message = account2.department == null ? "Nhan vien nay chua co phong ban" :
                "Phong ban cua nhan vien nay la " + account2.department.name;
            System.out.println(message);

    //-----QUESTION 4------//
        //Sử dụng toán tử ternary để làm yêu cầu sau:
        //Kiểm tra Position của account thứ 1
        //Nếu Position = Dev thì in ra text "Đây là Developer"
        //Nếu không phải thì in ra text "Người này không phải là Developer"
            System.out.println("-----QUESTION 04------");
            String question4 = account1.position.name.toString() == "DEV" ? "Đây là Developer" : "Người này không phải là Developer";
            System.out.println(question4);


            System.out.println("----QUESTION 05-----");
            question05();
            System.out.println("-----QUESTION 06-----");
            question06();


    //-----QUESTION 7------// Sử dụng switch case để làm lại Question 4
            System.out.println("-----QUESTION 07------");
            String question7 = account1.position.name.toString() ;
            switch (question7) {
            case "DEV":
                System.out.println("Đây là Developer");
                break;
            default:
                System.out.println("Người này không phải là Developer");
        }

    //FOREACH
    //-----QUESTION 8------//-- In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ
            System.out.println("-----QUESTION 08------");
            Account[] accountInfors= {account1,account2,account3};

            for (Account accountInfor:accountInfors){
                System.out.println("-Thong tin account 1 la:\n✾ "+ account1.fullName +"\n✾ " +account1.email+"\n✾ "
                                + account1.department.name );
                System.out.println("-Thong tin account 2 la:\n✾ "+ account2.fullName +"\n✾ " +account2.email+"\n✾ "
                    + account2.department.name );
                System.out.println("-Thong tin account 3 la:\n✾ "+ account3.fullName +"\n✾ " +account3.email+"\n✾ "
                    + account3.department.name );
            break;

        }

    //-----QUESTION 9------//--In ra thông tin các phòng ban bao gồm: id và name

            Department[] departments ={department1,department2,department3};
            for (Department departInfor :departments){
                System.out.println("-----QUESTION 09-----");
                System.out.println("Thong tin phong ban thu 1 la: \n✰ " + department1.id + "\n✰ " + department1.name);
                System.out.println("Thong tin phong ban thu 2 la: \n✰ " + department2.id + "\n✰ " + department2.name);
                System.out.println("Thong tin phong ban thu 3 la: \n✰ " + department3.id + "\n✰ " + department3.name);
            break;
        }

   //FOR
    //-----QUESTION 10------//--In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ theo định dạng
            Account[] accounts= {account1,account2,account3};
            System.out.println("-----QUESTION 10-----");
            for (  int i=0; i<accounts.length; i++){

                System.out.println("-Thong tin phong ban thu " + (i+1) + " la ");
                System.out.println("Email: " + accounts[i].email);
                System.out.println("Fullname: " + accounts[i].fullName);
                System.out.println("Phong ban: "+ accounts[i].department.name);


        }

    //-----QUESTION 11------//-

        System.out.println("----QUESTION 11-----");

            for(int i = 0; i<departments.length; i++){
                System.out.println("Thong tin department thu "+ (i+1) +" la: ");
                System.out.println("ID: "+ departments[i].id );
                System.out.println("Name: "+ departments[i].name );


        }
    //-----QUESTION 12------//- Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
            System.out.println("----QUESTION 12-----");
            for (int i =0; i<2; i++){
                System.out.println("-Thong tin department " + (i+1)+ " la: " );
                System.out.println("ID: " + departments[i].id);
                System.out.println("Name: " + departments[i].name);


        }
    //-----QUESTION 13------//In ra thông tin tất cả các account ngoại trừ account thứ 2
            System.out.println("----QUESTION 13-----");

            for (int i =0; i<accountInfors.length; i++){
            if(i!=1) {
                System.out.println(" ✶ Thong tin account "+ (i+1)+ " la: ");
                System.out.println(accountInfors[i].email + " \nFullname: "+ accountInfors[i].fullName+ " \nID: "
                +accountInfors[i].id +" \nUserName:  " + accountInfors[i].userName +" \nDepartment: "
                        +accountInfors[i].department.name +" \nPosition: "+ accountInfors[i].position.name +" \nCreateDate: "
                        + accountInfors[i].createDate);
            }
        }
    //-----QUESTION 14------//In ra thông tin tất cả các account có id < 4
                System.out.println("\n----QUESTION 14-----In ra thông tin tất cả các account có id < 4");
                for (int i=0;i<accountInfors.length; i++) {
                if (accountInfors[i].id < 4) {
                    System.out.println("\nThong tin cua account thu " + (i + 1) + " la ");
                    System.out.println("ID : " + accountInfors[i].id);
                    System.out.println("Email : " + accountInfors[i].email);
                    System.out.println("Username : " + accountInfors[i].userName);
                    System.out.println("Fullname : " + accountInfors[i].fullName);
                    System.out.println("Position : " + accountInfors[i].position.name);
                    System.out.println("Department : " + accountInfors[i].department.name);
                    System.out.println("CreateDate : " + accountInfors[i].createDate);
                }

            }
            Question15();
                Question15Cach2();

    //WHILE
    //Question 16: Làm lại các Question ở phần FOR bằng cách sử dụng WHILE kết hợp với lệnh break, continue
    //Question 16- ( Lam lai QUESTION 10)
            System.out.println("\nQuestion 16- ( Lam lai QUESTION 10)");
                int i = accounts.length-1;
                while (i>=0) {
                   System.out.println(accounts[i]);
                   System.out.println("-Thong tin phong ban thu " + (i + 1) + " la ");
                    System.out.println("Email: " + accounts[i].email);
                    System.out.println("Fullname: " + accounts[i].fullName);
                    System.out.println("Phong ban: " + accounts[i].department.name);
                    i--;
                }
    //Question 16- ( Lam lai QUESTION 11)
            System.out.println("\nQuestion 16 ( Lam lai QUESTION 11)");
                int a=0;
                while (a<departments.length){
                    System.out.println("Thong tin department thu "+ (a+1) +" la: ");
                    System.out.println("ID: "+ departments[a].id );
                    System.out.println("Name: "+ departments[a].name );

                a++;}

    //Question 16- ( Lam lai QUESTION 12)
            System.out.println("\nQuestion 16 ( Lam lai QUESTION 12)");
                int b=0;
                while(b<2){
                    System.out.println("-Thong tin department " + (b+1)+ " la: " );
                    System.out.println("ID: " + departments[b].id);
                    System.out.println("Name: " + departments[b].name);
                    b++;
                }
    //Question 16- ( Lam lai QUESTION 13)
        System.out.println("\nQuestion 16 ( Lam lai QUESTION 13)");
                int c=0;
                while(c < accountInfors.length){
                    if (c!=1){
                        System.out.println("Thong tin account thu "+(c+1) +" la ");
                        System.out.println("Email : " + accountInfors[c].email);
                        System.out.println("ID : "+ accountInfors[c].id);
                        System.out.println("Username : " + accountInfors[c].userName);
                        System.out.println("Fullname : " + accountInfors[c].fullName);
                        System.out.println("Department : "+ accountInfors[c].department.name);
                        System.out.println("Position : "+ accountInfors[c].position.name);
                    }
                    c++;
                }

    //Question 16- ( Lam lai QUESTION 14)
        System.out.println("\nQuestion 16 ( Lam lai QUESTION 14)");
                int m=0;
                while(m< accountInfors.length){
                    if (accountInfors[m].id<4){
                        System.out.println("Thong tin account thu "+(m+1) + " la ");
                        System.out.println(accountInfors[m].toString());
                    }
                    m++;
                }

        Lamlai15();

//DO-WHILE
        //Question 17: Làm lại các Question ở phần FOR

        System.out.println("\n-----QUESTION 17 (Lam lai 10)-----");
        int k=0;
        do {
            System.out.println("-Thong tin phong ban thu " + (k + 1) + " la ");
            System.out.println(accounts[k].toString());
        k++;}

            while (k < accounts.length) ;


//  -----QUESTION 17 (Lam lai 11)----
        System.out.println("\n-----QUESTION 17 (Lam lai 11)-----");
        int p=0;
        do {
            System.out.println("Thong tin department thu "+ (p+1) +" la: ");
            System.out.println(departments[p].toString() + "\n");
            p++;
        }
        while (p< departments.length);

//-----QUESTION 17 (Lam lai 12)-----
        System.out.println("\n-----QUESTION 17 (Lam lai 12)-----");
        int v =0;
        do{
            System.out.println("Thong tin phong ban thu"+(v+1) +" la :");
            System.out.println(departments[v].toString());
            v++;
        }
        while (v<2);

//-----QUESTION 17 (Lam lai 13)-----
        System.out.println("\n-----QUESTION 17 (Lam lai 13)-----");
        int x =0;
        do{if (x!=1){
            System.out.println("Thong tin account thu "+ (x+1) +" la :");
            System.out.println(accounts[x].toString());
           }
            x++;
        }
        while ( x<accounts.length);

//-----QUESTION 17 (Lam lai 14)-----
        System.out.println("\n-----QUESTION 17 (Lam lai 14)-----");
        int f=0;
        do {
            if(accountInfors[f].id<4){
                System.out.println("Thong tin cua account thu "+(f+1)+" la :");
                System.out.println(accountInfors[f].toString());
            }
            f++;
        }
        while (f<accountInfors.length);

  //-----QUESTION 17 (Lam lai 15)----
        System.out.println("\n-----QUESTION 17 (Lam lai 15)----");
        int i2=0;

        System.out.println("Cac so chan <=20 la:");
        do {
            if ((i2%2)==0){
                System.out.println(i2+ " ");
            }
            i2++;
        }
        while (i2<=20);

        }






    //-----QUESTION 15------//In ra các số chẵn nhỏ hơn hoặc bằng 20
            public static void Question15(){
                System.out.println("-----QUESTION 15------//In ra các số chẵn nhỏ hơn hoặc bằng 20");

            System.out.println("Cac so chan nho hon hoac bang 20 la :" );
            for(int i=0; i<=20; i++) {
                if (i % 2 == 0) {
                    System.out.println(  i );
                }
            }


            }
    //-----QUESTION 15------//Cach 2
    public static void Question15Cach2(){
        System.out.println("Question15 cach 2");
        for (int i=0; i<=20;i=i+2){
            System.out.println(i);
        };


    }


    //Question 16- ( Lam lai QUESTION 15)
    public static void Lamlai15(){
        System.out.println("\nQuestion16--- Lam lai question 15");
        System.out.println("Cac so chan nho hon hoac bang 20 la ");
        int n=0;
        while (n<=20){
            if (n%2==0){
                System.out.println( n);
            }
            n++;
        }

    }



    //SWITCH CASE
    //-----QUESTION 5------//

    //Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
    //Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
    //Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
    //Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
    //Còn lại in ra "Nhóm có nhiều thành viên"
        public static void question05() {

        Group group = new Group();
        Account account1 = new Account();
        Account account2 = new Account();
        Account account3 = new Account();
        group.accounts= new Account[]{account1,account2,account3};
            switch (group.accounts.length) {
                case 1:
                    System.out.println("Nhóm có một thành viên");
                    break;
                case 2:
                    System.out.println("Nhóm có hai thành viên");
                    break;
                case 3:
                    System.out.println("Nhóm có ba thành viên");
                    break;
                default:
                    System.out.println("Nhóm có nhiều thành viên");


            }


        }

    /* -----QUESTION 6------// */
        //Sử dụng switch case để làm lại Question 2
    public static void question06() {
        Account account = new Account();
        Group group1 = new Group();
        Group group3 = new Group();
        Group group2 = new Group();
        account.groups = new Group[]{group1, group2};

        if (account.groups == null) {
            System.out.println("Nhan vien nay chua co group");
        } else {

            switch (account.groups.length) {

                case 1:
                    System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
                    break;
                case 2:
                    System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
                    break;
                case 3:
                    System.out.println("Nhan vien nay la nguoi quan trong, tham gia nhieu group");
                    break;
                default:
                    System.out.println("Nhan vien nay la nguoi hong chuyen, tham gia tat ca ca group");
            }
        }
    }



    }



