package web.service;

import web.model.User;

public interface UserService {
    void updateUser(User user);

    void deleteUser(Long id);

    Object getUserById(Long id);

    void addUser(User user);

    Object findAll();
}
