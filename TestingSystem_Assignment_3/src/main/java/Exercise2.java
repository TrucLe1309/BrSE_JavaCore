import entity.Department;

import javax.swing.text.Position;
import java.security.acl.Group;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise2 {
    public static void main(String[] args) {
        question01();

    }
    public static class Account {
        public  int id;
        public String email;

        public String fullName;
        public Department department;
        public Position position;
        public LocalDate createDate;
        public Group[] groups;


        public String username;
        public LocalDateTime createdDate;
    }

    private static void question01() {
        Account[] accounts = new Account[5];
        for (int i = 0; i < accounts.length; i++) {
            Account account = new Account();
            account.email = String.format("Email %d", i + 1);
            account.username = String.format("Username %d", i + 1);
            account.fullName = String.format("Full name %d", i + 1);
            account.createdDate = LocalDateTime.now();
            accounts[i] = account;
            System.out.println("- Thong tin account "+ i +" la :"+"\nEmail: "+accounts[i].email + "\nUsername: "+
                    accounts[i].username+ "\nFullname: "+accounts[i].fullName+"\nCreateDate: "+ accounts[i].createdDate);
        }
    }
}
