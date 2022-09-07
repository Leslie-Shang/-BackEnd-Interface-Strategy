package com.leslie.demo.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @author Leslie
 * @description 用户实体类
 */
@Data
@ApiModel("用户")
public class User {

    private String type;

    private String task;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}
