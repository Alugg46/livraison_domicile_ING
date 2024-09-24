package com.sky.vo;

import com.sky.entity.SetmealDish;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class SetmealVO implements Serializable {
    private Long id;
    private String name;
    private Long categoryId;
    private BigDecimal price;
    private String image;
    private String desciption;
    private Integer status;
    private LocalDateTime updateTime;
    private String categoryName;
    private List<SetmealDish> setmealDishes =new ArrayList<>();
}
