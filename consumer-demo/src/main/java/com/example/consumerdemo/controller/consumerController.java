package com.example.consumerdemo.controller;


import com.example.consumerdemo.dto.UserDto;
import com.example.consumerdemo.interfaces.UserClient;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/consumer")
public class consumerController {

    @Autowired
    private UserClient feignClient;
/*    @Autowired
    private RestTemplate restTemplate;*/

    @RequestMapping("/hello")
    @ResponseBody
    public UserDto getUser() {
        //final List<ServiceInstance> instances = discoveryClient.getInstances("user-server");
        //ServiceInstance serviceInstance = instances.get(0);
        //String url="http://"+ serviceInstance.getHost()+":"+serviceInstance.getPort()+"/user/hello";
        //String url="http://user-server/user/hello";
        //UserDto userDto = restTemplate.getForObject(url, UserDto.class);
        final UserDto userDto = feignClient.getUser();
        return userDto;
    }
}
