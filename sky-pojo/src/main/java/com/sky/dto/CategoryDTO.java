package com.sky.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(description = "新增分类时传递的数据模型")
public class CategoryDTO implements Serializable {
    private Long id;
    /**
     * 分类名称
     */
    private String name;
    /**
     * 排序，按照升序排序
     */
    private int sort;
    /**
     * 分类类型：1为菜品分类，2为套餐分类
     */
    private int type;
}

