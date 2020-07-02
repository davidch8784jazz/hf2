package co.kr.hatchfly.hf.service;

import co.kr.hatchfly.hf.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();

    User getUserById(String userid);

    User registUser(User user);

    void modifyUser(String userid, User user);

    void removeUser(String userid);
}