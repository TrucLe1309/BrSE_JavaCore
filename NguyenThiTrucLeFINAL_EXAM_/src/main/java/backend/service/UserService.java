package backend.service;

import backend.repository.IUserRepository;
import backend.repository.UserRepository;
import entity.User;

import java.sql.SQLException;
import java.util.List;

public class UserService implements IUserService{
    private IUserRepository repository = new UserRepository();
    @Override
    public List<User> findAll() throws SQLException {
        return repository.findAll();
    }

    @Override
    public List<User> findByRole(String role) throws SQLException {
        return repository.findByRole(role);
    }

    @Override
    public String login(String email, String password) throws SQLException {
        return repository.login(email, password);
    }
}
