package com.uq.uqchartroom.service;

import com.uq.uqchartroom.entities.User;
import com.uq.uqchartroom.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author pyt
 * @Date 2019/4/2 15:19
 * @Version
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return  userRepository.findAll();
    }

    public User save(User user){
        return userRepository.save(user);
    }
}
