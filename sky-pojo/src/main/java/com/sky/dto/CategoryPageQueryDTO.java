package com.sky.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class CategoryPageQueryDTO implements Serializable {
    private String name;
    private int page;
    private int PageSize;
    private int type;
}
