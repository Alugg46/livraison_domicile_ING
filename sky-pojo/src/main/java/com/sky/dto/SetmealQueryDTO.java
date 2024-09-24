package com.sky.dto;

import lombok.Data;

import java.io.Serializable;
@Data
public class SetmealQueryDTO implements Serializable {
    private Long categoryId;
    private String name;
    private int page;
    private int pageSize;
    private Integer status;
}
