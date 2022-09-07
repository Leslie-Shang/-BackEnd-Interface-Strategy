package com.leslie.demo.service.impl;

import com.leslie.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service("student")
public class StudentServiceImpl implements UserService {
    @Override
    public String task() {
        return "学习";
    }
}