package com.sky.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

/**
* 菜品口味关系表
* @TableName dish_flavor
*/

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DishFlavor implements Serializable {

    /**
    * 主键
    */
    @NotNull(message="[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 菜品
    */
    @NotNull(message="[菜品]不能为空")
    @ApiModelProperty("菜品")
    private Long dishId;
    /**
    * 口味名称
    */
    @Size(max= 32,message="编码长度不能超过32")
    @ApiModelProperty("口味名称")
    @Length(max= 32,message="编码长度不能超过32")
    private String name;
    /**
    * 口味数据list
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("口味数据list")
    @Length(max= 255,message="编码长度不能超过255")
    private String value;


}
