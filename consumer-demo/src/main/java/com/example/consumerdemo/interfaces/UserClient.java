package com.example.consumerdemo.interfaces;

import com.example.consumerdemo.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("user-server")
public interface UserClient {
    @RequestMapping("/user/hello")
    UserDto getUser();
}

