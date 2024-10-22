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
* 订单明细表
* @TableName order_detail
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetail implements Serializable {

    /**
    * 主键
    */
    @NotNull(message="[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 名字
    */
    @Size(max= 32,message="编码长度不能超过32")
    @ApiModelProperty("名字")
    @Length(max= 32,message="编码长度不能超过32")
    private String name;
    /**
    * 图片
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("图片")
    @Length(max= 255,message="编码长度不能超过255")
    private String image;
    /**
    * 订单id
    */
    @NotNull(message="[订单id]不能为空")
    @ApiModelProperty("订单id")
    private Long orderId;
    /**
    * 菜品id
    */
    @ApiModelProperty("菜品id")
    private Long dishId;
    /**
    * 套餐id
    */
    @ApiModelProperty("套餐id")
    private Long setmealId;
    /**
    * 口味
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("口味")
    @Length(max= 50,message="编码长度不能超过50")
    private String dishFlavor;
    /**
    * 数量
    */
    @NotNull(message="[数量]不能为空")
    @ApiModelProperty("数量")
    private Integer number;
    /**
    * 金额
    */
    @NotNull(message="[金额]不能为空")
    @ApiModelProperty("金额")
    private BigDecimal amount;

}
