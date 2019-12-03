package com.example.userdemo.controller;


import com.example.userdemo.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/hello")
    @ResponseBody
    public UserDto getUser() {
        UserDto userDto = new UserDto();
        userDto.setId(1);
        userDto.setName("nihoa");
        return userDto;
    }
}
