package com.leslie.demo.service.impl;

import com.leslie.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service("teacher")
public class TeacherServiceImpl implements UserService {
    @Override
    public String task() {
        return "教书";
    }
}
