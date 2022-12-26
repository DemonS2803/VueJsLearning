package com.example.services;

import com.example.entities.User;
import com.example.repositories.UserRepository;
import com.example.roles.Role;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserService {

    private UserRepository userRepository;
    private static Logger log = LoggerFactory.getLogger(UserService.class);

    public User findUserById(Long id) {
        return userRepository.findUserById(id);
    }
    public List<User> findAll() {
        return userRepository.findAll();
    }
    public User findUserByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }

    public boolean save(String username, String password) {
        try {
            User user = User.builder()
                    .username(username)
                    .password(password)
//                    .role(Role.USER)
                    .build();
            userRepository.save(user);
            return true;
        } catch (Exception e) {
            log.error("user not saved in db");
            e.printStackTrace();
            return false;
        }
    }
}
