package com.siemens.entity;

import lombok.Data;

/**
 * Description:
 * date: 2022 2022/2/27 16:02
 *
 * @author shaowenhao
 * @since JDK 1.8
 */

@Data
public class User {
    private long id;
    private String name;
    private  Address address;
}
