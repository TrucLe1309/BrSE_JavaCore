package backend.controller;

import backend.repository.IUserRepository;
import backend.repository.UserRepository;
import entity.User;

import java.sql.SQLException;
import java.util.List;

public class UserController implements IUserController{
    private IUserRepository service = new UserRepository();
    @Override
    public List<User> findAll() throws SQLException {
        return service.findAll();
    }

    @Override
    public List<User> findByRole(String role) throws SQLException {
        return service.findByRole(role);
    }

    @Override
    public String login(String email, String password) throws SQLException {
        return service.login(email, password);
    }
}
