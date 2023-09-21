package frontend;

import entity.User;
import utils.JDBCUtils;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class UserProgram {

    public static void main(String[] args) throws SQLException, IOException {
        //JDBCUtils.checkConnection();

        UserFunction function = new UserFunction();
        function.showMenu();


    }

    }

