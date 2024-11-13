package com.project.shop_spring_2024.services.User;

import com.project.shop_spring_2024.dtos.UserDTO;
import com.project.shop_spring_2024.exceptions.DataNotFoundException;
import com.project.shop_spring_2024.models.User;

public interface IUserService {
    User createUser(UserDTO userDTO) throws DataNotFoundException;
    String login(String phoneNumber, String password);
}
