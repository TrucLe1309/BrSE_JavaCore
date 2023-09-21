package frontend;

import utils.JDBCUtils;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class UserProgram {

    public static void main(String[] args) throws SQLException, IOException {
        //JDBCUtils.checkConnection();

        UserFunction function = new UserFunction();
        //function.showMenu();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("1. Hiển thị danh sách user");
            System.out.println("2. Hiển thị danh sách manager");
            System.out.println("3. Thoát chương trình");
            System.out.println("Mời bạn chọn chức năng:");

            int menu = scanner.nextInt();
            if (menu == 1) {
                function.showEmployeeMenu();
            } else if (menu == 2) {
                function.showManager;

            } else if (menu == 3) {
                return;
            } else {
                System.out.println("Vui lòng chọn đúng chức năng.");
            }
        }
    }


    }

    }

