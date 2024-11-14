package com.example.OnlineCinema.Controller;

import com.example.OnlineCinema.domain.User;
import com.example.OnlineCinema.dto.UserDTO;
import com.example.OnlineCinema.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    private final ModelMapper modelMapper;

    @Autowired
    public UserController(UserService userService, ModelMapper modelMapper) {
        this.userService = userService;
        this.modelMapper = modelMapper;
    }

    @PostMapping
    public void createUser(@RequestBody UserDTO userDTO) {
        userService.createUser(modelMapper.map(userDTO, User.class));
    }

    @GetMapping("/{id}")
    public UserDTO getUserById(@PathVariable int id) {
        return modelMapper.map(userService.getUserById(id), UserDTO.class);
    }
}
