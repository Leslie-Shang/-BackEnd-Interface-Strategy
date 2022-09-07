package com.leslie.demo.controller;

import com.leslie.demo.config.UserContext;
import com.leslie.demo.entity.User;
import com.leslie.demo.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @author Leslie
 * @description 用户接口
 */
@RestController
@Api(tags = "用户接口")
@RequestMapping("user")
public class UserController {
    @Autowired
    UserContext userContext;

    @PostMapping("/getTask")
    public String getTask(@RequestBody User user) {
        UserService userService = userContext.getUserService(user.getType());
        return userService.task();
    }
}
