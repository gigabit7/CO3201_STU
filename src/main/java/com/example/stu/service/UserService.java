package com.example.stu.service;

import com.example.stu.dto.UserDto;
import com.example.stu.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}
