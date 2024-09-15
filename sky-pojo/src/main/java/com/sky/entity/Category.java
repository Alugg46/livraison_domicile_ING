package com.sky.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import java.time.LocalDateTime;
import java.util.Date;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

/**
* 菜品及套餐分类
* @TableName category
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Category implements Serializable {

    /**
    * 主键
    */
    @NotNull(message="[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 类型   1 菜品分类 2 套餐分类
    */
    @ApiModelProperty("类型   1 菜品分类 2 套餐分类")
    private Integer type;
    /**
    * 分类名称
    */
    @NotBlank(message="[分类名称]不能为空")
    @Size(max= 32,message="编码长度不能超过32")
    @ApiModelProperty("分类名称")
    @Length(max= 32,message="编码长度不能超过32")
    private String name;
    /**
    * 顺序
    */
    @NotNull(message="[顺序]不能为空")
    @ApiModelProperty("顺序")
    private Integer sort;
    /**
    * 分类状态 0:禁用，1:启用
    */
    @ApiModelProperty("分类状态 0:禁用，1:启用")
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
