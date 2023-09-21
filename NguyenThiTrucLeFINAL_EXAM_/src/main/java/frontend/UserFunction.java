package frontend;

import backend.controller.UserController;
import entity.Manager;
import entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import static sun.security.jgss.GSSUtil.login;

public class UserFunction {

    private UserController controller = new UserController();

    public void showMenu() throws SQLException, IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Đăng nhập");
            System.out.println("2. Hiển thị danh sách user");
            System.out.println("3. Tìm kiếm user theo chức vụ");
            System.out.println("4. Thoát chương trình");
            System.out.println("Mời bạn chọn chức năng:");

            int menu = scanner.nextInt();
            if (menu == 1) {
                String role = login();
                if (role == null) {
                    System.out.println("Tài khoản hoặc mật khẩu không đúng.");
                } else if (role.equals("MANAGER")) {
                    showManagerMenu();
                }
                else {
                    showEmployeeMenu();
                }
            } else if (menu == 2) {
                findAll();
            } else if (menu == 3) {
                findByRole();

                System.out.println("Vui lòng chọn đúng chức năng.");
            }
        }
    }

    public void showEmployeeMenu() throws SQLException, IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Đăng xuất");
            System.out.println("2. Hiển thị danh sách user");
            System.out.println("3. Tìm kiếm user theo chuc vu");
            System.out.println("Mời bạn chọn chức năng:");

            int menu = scanner.nextInt();
            if (menu == 1) {
                return;
            } else if (menu == 2) {
                findAll();
            } else if (menu == 3) {
                findByRole();
            } else {
                System.out.println("Vui lòng chọn đúng chức năng.");
            }
        }
    }
    
        public void showManagerMenu () {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("1. Đăng xuất");
                System.out.println("2. Hiển thị danh sách user");
                System.out.println("3. Tìm kiếm user theo chức vụ");
                System.out.println("Mời bạn chọn chức năng:");

                int menu = scanner.nextInt();
                if (menu == 1) {
                    return;
                } else if (menu == 2) {
                    findAll();
                } else if (menu == 3) {
                    findByRole();

                } else {
                    System.out.println("Vui lòng chọn đúng chức năng.");
                }
            }
        }
    }
    public void findAll() throws SQLException, IOException {
        List<User> users = controller.findAll();
        System.out.println("+------+--------------------+--------------------+--------------------+");
        System.out.println("|  ID  |        NAME        |        EMAIL       |       PASSWORD     |");
        System.out.println("+------+--------------------+--------------------+--------------------+");
        if (users.isEmpty()) {
            System.out.printf("| %-4s | %-18s | %-18s | %-18s |%n", "NULL", "NULL", "NULL", "NULL");
            System.out.println("+------+--------------------+--------------------+--------------------+");
        } else {
            for (User user : users) {
                int id = user.getId();
                String name = user.getFullName();
                String email = user.getEmail();
                String password = user.getPassword();
                System.out.printf("| %-4s | %-18s | %-18s | %-18s |%n", id, name, email, password);
                System.out.println("+------+--------------------+--------------------+--------------------+");
            }
        }
    }
    public void findByRole() throws SQLException, IOException {
        List<User> users = controller.findByRole("MANEGER");
        System.out.println("+------+--------------------+--------------------+--------------------+");
        System.out.println("|  ID  |        NAME        |        EMAIL       |       PASSWORD     |");
        System.out.println("+------+--------------------+--------------------+--------------------+");
        if (users.isEmpty()) {
            System.out.printf("| %-4s | %-18s | %-18s | %-18s |%n", "NULL", "NULL", "NULL", "NULL");
            System.out.println("+------+--------------------+--------------------+--------------------+");
        } else {
            for (User user : users) {
                int id = user.getId();
                String name = user.getFullName();
                String email = user.getEmail();
                String password = user.getPassword();
                System.out.printf("| %-4s | %-18s | %-18s | %-18s |%n", id, name, email, password);
                System.out.println("+------+--------------------+--------------------+--------------------+");
            }
        }
    }

    public String login() throws SQLException, IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào email:");
        String email = scanner.next();
        System.out.println("Nhập vào password:");
        String password = scanner.next();
        return controller.login(email, password);
    }
}



