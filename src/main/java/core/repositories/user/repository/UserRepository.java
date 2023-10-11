package core.repositories.user.repository;

import core.entities.user.User;

//import java.util.List;

public interface UserRepository {
//    List<User> getAll();
    User getById(int id);
    void add(User user);
//    void update(User user);
    void delete(User user);
}
