package com.sky.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import java.math.BigDecimal;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

/**
* 套餐菜品关系
* @TableName setmeal_dish
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SetmealDish implements Serializable {

    /**
    * 主键
    */
    @NotNull(message="[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 套餐id
    */
    @ApiModelProperty("套餐id")
    private Long setmealId;
    /**
    * 菜品id
    */
    @ApiModelProperty("菜品id")
    private Long dishId;
    /**
    * 菜品名称 （冗余字段）
    */
    @Size(max= 32,message="编码长度不能超过32")
    @ApiModelProperty("菜品名称 （冗余字段）")
    @Length(max= 32,message="编码长度不能超过32")
    private String name;
    /**
    * 菜品单价（冗余字段）
    */
    @ApiModelProperty("菜品单价（冗余字段）")
    private BigDecimal price;
    /**
    * 菜品份数
    */
    @ApiModelProperty("菜品份数")
    private Integer copies;

}
