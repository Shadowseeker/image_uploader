/*
package org.imageuploader.service;

import org.imageuploader.domain.CustomUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Collection;
import java.util.List;

*/
/**
 * @author Georgia Papp
 *//*

public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserById(String id) {
        return userRepository.findOne(id);
    }


    public User getUserByEmail(String email) {
        return userRepository.findOneByEmail(email);
    }


    public Collection<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User create(String userName, String password, String role) {
        User user = new User();
        user.setUsername(userName);
        user.setPassword(new BCryptPasswordEncoder().encode(password));
        return userRepository.save(user);
    }
}
*/
