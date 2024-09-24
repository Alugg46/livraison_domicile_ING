package com.sky.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

/**
* 套餐
* @TableName setmeal
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Setmeal implements Serializable {

    /**
    * 主键
    */
    @NotNull(message="[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 菜品分类id
    */
    @NotNull(message="[菜品分类id]不能为空")
    @ApiModelProperty("菜品分类id")
    private Long categoryId;
    /**
    * 套餐名称
    */
    @NotBlank(message="[套餐名称]不能为空")
    @Size(max= 32,message="编码长度不能超过32")
    @ApiModelProperty("套餐名称")
    @Length(max= 32,message="编码长度不能超过32")
    private String name;
    /**
    * 套餐价格
    */
    @NotNull(message="[套餐价格]不能为空")
    @ApiModelProperty("套餐价格")
    private BigDecimal price;
    /**
    * 售卖状态 0:停售 1:起售
    */
    @ApiModelProperty("售卖状态 0:停售 1:起售")
    private Integer status;
    /**
    * 描述信息
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("描述信息")
    @Length(max= 255,message="编码长度不能超过255")
    private String description;
    /**
    * 图片
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("图片")
    @Length(max= 255,message="编码长度不能超过255")
    private String image;
    /**
    * 创建时间
    */
    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;

    private Long createUser;

    private Long updateUser;


}
