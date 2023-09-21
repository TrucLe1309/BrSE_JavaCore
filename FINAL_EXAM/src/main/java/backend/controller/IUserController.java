package backend.controller;

import entity.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserController {
    List<User> findAll() throws SQLException;

    User findById(int id) throws SQLException;

    int deleteById(int id) throws SQLException;

    String login(String email, String password) throws SQLException;

    int create(String fullName, String email) throws SQLException;
}
