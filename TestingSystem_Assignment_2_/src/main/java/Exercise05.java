import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        System.out.println("-----Exercise 5: Input from console-----");
        //Question01();
        //Question02();
        //Question03();
        //Question04();
        //Question05();
        //Question06();
        Question07();
    }

    private static final Scanner scanner = new Scanner(System.in);

    private static void Question01() {
        System.out.println("Moi ban nhap vao 3 so nguyen: ");
        System.out.println("Moi ban nhap vao so thu 1: ");
        int a = scanner.nextInt();
        System.out.println("Moi ban nhap vao so thu 2: ");
        int b = scanner.nextInt();
        System.out.println("Moi ban nhap so thu 3: ");
        int c = scanner.nextInt();
        System.out.printf("Ban vua nhap vao 3 so nguyen la: %d, %d va %d %n", a, b, c);

    }

    private static void Question02() {
        // float va double đều là số thực
        // float: 4byte  < double: 8byte
        // double chứa giá tri chính xác hơn float
        System.out.println("Question 2:\n" +
                "Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình");
        System.out.println("Moi ban nhap vao 3 so thuc: ");
        System.out.println("Moi ban nhap vao so thuc thu 1: ");
        double a = scanner.nextDouble();
        System.out.println("Moi ban nhap vao so thuc thu 2: ");
        double b = scanner.nextDouble();
        System.out.println("Moi ban nhap vao so thuc thu 3: ");
        double c = scanner.nextDouble();
        System.out.printf("Ba so thuc ban vua nhap vao la %f, %f, %f%n", a, b, c);


    }

    private static void Question03() {
        System.out.println("Question 3:\n" +
                "Viết lệnh cho phép người dùng nhập họ và tên");
        System.out.println("\nNhập vào họ và tên");

        String fullName = scanner.nextLine();
        System.out.printf("Bạn vừa nhập vào họ và tên là: %s.%n", fullName);

    }

    private static void Question04() {
        System.out.println("Question 4:\n" +
                "Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ");
        System.out.println("\nNhap vao ngay sinh cua ban:(yyyy-MM-dd) ");
        String birthdate = scanner.next();
        LocalDate birthday = LocalDate.parse(birthdate);
        System.out.println("birthday = " + birthday);
        System.out.printf("Ngay sinh cua ban la: %s%n", birthday);

    }

    private static void Question05() {
        System.out.println("Question 5:\n");
        System.out.println("\n Nhap vao thong tin account: ");
        Account account = new Account();
        System.out.println("Nhap ID: ");
        account.id = scanner.nextInt();
        System.out.println("Nhap email: ");
        account.email = scanner.next();
        System.out.println("Nhap username: ");
        account.userName = scanner.next();
        System.out.println("Nhap fullName: ");
        scanner.nextLine();
        account.fullName = scanner.nextLine();
        System.out.println("Nhap position: Nhap vao cac so tu 1 den 4 tuong ung voi : " +
                "\n1. Dev\n2. Test\n3.Scrum_Master\n4. PM");
        int positionNumber = scanner.nextInt();
        switch (positionNumber) {
            case 1:
                Position position = new Position();
                position.name = PositionName.DEV;
                account.position=position;
                break;
            case 2:
                Position position1 = new Position();
                position1.name = PositionName.TEST;
                account.position=position1;
                break;
            case 3:
                Position position3 = new Position();
                position3.name = PositionName.SCRUM_MASTER;
                account.position= position3;
                break;
            case 4:
                Position position2 = new Position();
                position2.name = PositionName.PM;
                account.position=position2;
                break;


        }
        System.out.printf("Thong tin account vua nhap la: \n- ID: %d\n- Email: %s\n- Username: %s\n" +
                "- Fullname: %s\n- Position: %s%n", account.id, account.email, account.userName, account.fullName, account.position.name
        );


    }
    private static void Question06(){
        System.out.println("Question 6: Viết lệnh cho phép người dùng tạo department (viết thành method)");
        System.out.println("\nNhap vao thong tin Department: ");
        Department department = new Department();
        System.out.println("Nhap ID: ");
        department.id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap ten phong ban: ");
        department.name= scanner.next();
        System.out.printf("Thong tin department ban vua nhap la: ID: %d, Name %s ", department.id, department.name);

    }
    private static void Question07(){
        System.out.println("Question 7: Nhập số chẵn từ console");

        while (true){
            System.out.println("- Nhap vao mot so chan: ");
            int n= scanner.nextInt();
            if(n%2 ==0){
                System.out.printf("Ban vua nhap vao mot so chan la: %d%n",n);
            }
            else {
                System.out.printf("So %d ban vua nhap khong phai la so chan.",n);
                System.out.println("\nMoi ban nhap lai.");
            }
        }
    }
}
