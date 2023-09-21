package backend.repository;

import entity.User;
import utils.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IUserRepository {


        @Override
        public List<User> findAll() throws SQLException {
            String sql = "SELECT * FROM `user`";
            try (
                    Connection connection = JDBCUtils.getConnection();
                    Statement stmt = connection.createStatement();
                    ResultSet rs = stmt.executeQuery(sql)
            ) {

                List<User> users = new ArrayList<>();
                while (rs.next()) {
                    User user = new User();
                    user.setId(rs.getInt("id"));
                    user.setFullName(rs.getString("full_Name"));
                    user.setEmail(rs.getString("email"));
                    users.add(user);
                }
                return users;
            }
        }


    @Override
    public List<User> findByRole(String role) throws SQLException {
        String sql = "SELECT * FROM `user`WHERE `role` = ?";
        try (
                Connection connection = JDBCUtils.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql);

        ) {
            pStmt.setString(1, role);
            try (ResultSet rs = pStmt.executeQuery()) {

                List<User> users = new ArrayList<>();
                while (rs.next()) {
                    User user = new User();
                    user.setId(rs.getInt("id"));
                    user.setFullName(rs.getString("full_Name"));
                    user.setEmail(rs.getString("email"));
                    users.add(user);
                }
                return users;
            }
        }
    }

    @Override
    public String login(String email, String password) throws SQLException {
        String sql = "SELECT * FROM `user` WHERE email = ? AND `password` =?";
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement pStmt = connection.prepareStatement(sql)

        ) {
            pStmt.setString(1,email );
            pStmt.setString(2,password );
            try (ResultSet rs = pStmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getString("role" );
                }
                return null;

            }
        }
    }

}
