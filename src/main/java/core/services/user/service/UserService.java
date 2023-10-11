package core.services.user.service;

import core.entities.user.User;
import core.repositories.user.repository.UserRepository;

import java.util.List;

public class UserService implements UserRepository {

    private List<User> userList;

    @Override
    public User getById(int id) {
        return null;
    }

    @Override
    public void add(User user) {

    }

    @Override
    public void delete(User user) {

    }
}
