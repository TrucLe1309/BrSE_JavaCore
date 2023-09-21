package backend.repository;

import entity.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserRepository {
    List<User> findAll() throws SQLException;

    List<User> findByRole(String role) throws SQLException;

    String login(String email, String password) throws SQLException;
}
