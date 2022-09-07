package com.leslie.demo.config;

import com.leslie.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserContext {
    @Autowired
    Map<String, UserService> userMap;

    public UserService getUserService(String type) {
        return userMap.get(type);
    }
}
