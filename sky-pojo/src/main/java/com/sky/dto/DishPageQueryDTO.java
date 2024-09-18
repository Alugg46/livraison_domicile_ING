package com.sky.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;
@Data
@ApiModel(description = "分页查询时的菜品传递模型")
public class DishPageQueryDTO implements Serializable {
    private int page;
    private int pageSize;
    private String name;
    private Integer categoryId;
    private Integer status;
}
