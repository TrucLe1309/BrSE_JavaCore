package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtils {

    public static void checkConnection(){
        try( Connection connection = getConnection()){
            System.out.println("Ket noi thanh cong. ");
        } catch (SQLException e) {
            System.out.println("Ket noi that bai. ");
            }
        }


    public static Connection  getConnection() throws SQLException {

        String path = "/Users/lenguyen/Documents/JAVA-CORE/FINAL_EXAM_/src/main/resources/database.properties";
        try (FileInputStream fis = new FileInputStream(path)) {
            Properties properties = new Properties();
            properties.load(fis);
            String url = properties.getProperty("url");
            return DriverManager.getConnection(url);
        } catch (IOException e) {
            System.out.println("Lỗi đọc file");
            return null;
        }


    }
}
