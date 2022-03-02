package com.siemens.entity;

import lombok.Data;

import java.util.Map;

/**
 * <p>Create Time: 2022年03月02日 10:53          </p>
 **/
@Data
public class UserMap {
    private Map<String,User> users;
}
