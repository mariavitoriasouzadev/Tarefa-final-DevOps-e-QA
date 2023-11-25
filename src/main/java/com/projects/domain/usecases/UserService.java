package com.projects.domain.usecases;

import com.projects.domain.User;
import com.projects.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long userId) {
        return userRepository.findById(userId);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public Optional<User> updateUser(User updatedUser) {
        Long userId = updatedUser.getId();
        if (userRepository.existsById(userId)) {
            return Optional.of(userRepository.save(updatedUser));
        }
        return Optional.empty();
    }

    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}
