import java.time.LocalDate;

public class Exercise06 {
    public static void main(String[] args) {

    Question01();
    //Question02();
    //printAccount();
        Question03();
    }
    private static void Question01(){
        System.out.println("Question 1: Tạo method để in ra các số chẵn nguyên dương nhỏ hơn 10");
        for (int i=0;i<10;i++){
            if (i%2==0){
                System.out.printf(i + " ");
            }
        }
    }
    private static void Question02(){
        System.out.println("Question 2: Tạo method để in thông tin các account");
        Account account1= new Account();
        account1.id= 1;
        account1.email="a@1.com";
        account1.userName="A";
        account1.fullName="Nguyen A";
        //account1.position = PositionName.DEV;
        account1.createDate= LocalDate.now();

        Account account2= new Account();
        account2.id= 2;
        account2.email="a@2.com";
        account2.userName="B";
        account2.fullName="Nguyen A";
        //account2.position = PositionName.PM;
        account2.createDate= LocalDate.of(2022, 02, 11);

        System.out.print(account1);
        System.out.print(account2);

    }
    private static void printAccount(Account account) {
        System.out.printf("ID: %d%n Email: %s%n Username: %s%n Fullname: %s%n CreatedDate: %s%n",
                account.id,account.email, account.userName, account.fullName, account.createDate);
    }

    private static void Question03(){
        System.out.println("\nQuestion 3: Tạo method để in ra các số nguyên dương nhỏ hơn 10");
        for(int i =0;i<10;i++){
            System.out.printf(i + " ");
        }
    }
}
