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
* 菜品
* @TableName dish
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Dish implements Serializable {

    /**
    * 主键
    */
    @NotNull(message="[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 菜品名称
    */
    @NotBlank(message="[菜品名称]不能为空")
    @Size(max= 32,message="编码长度不能超过32")
    @ApiModelProperty("菜品名称")
    @Length(max= 32,message="编码长度不能超过32")
    private String name;
    /**
    * 菜品分类id
    */
    @NotNull(message="[菜品分类id]不能为空")
    @ApiModelProperty("菜品分类id")
    private Long categoryId;
    /**
    * 菜品价格
    */
    @ApiModelProperty("菜品价格")
    private BigDecimal price;
    /**
    * 图片
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("图片")
    @Length(max= 255,message="编码长度不能超过255")
    private String image;
    /**
    * 描述信息
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("描述信息")
    @Length(max= 255,message="编码长度不能超过255")
    private String description;
    /**
    * 0 停售 1 起售
    */
    @ApiModelProperty("0 停售 1 起售")
    private Integer status;
    /**
    * 创建时间
    */
    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;
    /**
    * 更新时间
    */
    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;
    /**
    * 创建人
    */
    @ApiModelProperty("创建人")
    private Long createUser;
    /**
    * 修改人
    */
    @ApiModelProperty("修改人")
    private Long updateUser;

}
