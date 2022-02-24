package kr.aaaron.jwt_demo.service;

import kr.aaaron.jwt_demo.domain.Role;
import kr.aaaron.jwt_demo.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
