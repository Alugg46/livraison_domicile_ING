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
* 地址簿
* @TableName address_book
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddressBook implements Serializable {

    /**
    * 主键
    */
    @NotNull(message="[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 用户id
    */
    @NotNull(message="[用户id]不能为空")
    @ApiModelProperty("用户id")
    private Long userId;
    /**
    * 收货人
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("收货人")
    @Length(max= 50,message="编码长度不能超过50")
    private String consignee;
    /**
    * 性别
    */
    @Size(max= 2,message="编码长度不能超过2")
    @ApiModelProperty("性别")
    @Length(max= 2,message="编码长度不能超过2")
    private String sex;
    /**
    * 手机号
    */
    @NotBlank(message="[手机号]不能为空")
    @Size(max= 11,message="编码长度不能超过11")
    @ApiModelProperty("手机号")
    @Length(max= 11,message="编码长度不能超过11")
    private String phone;
    /**
    * 省级区划编号
    */
    @Size(max= 12,message="编码长度不能超过12")
    @ApiModelProperty("省级区划编号")
    @Length(max= 12,message="编码长度不能超过12")
    private String provinceCode;
    /**
    * 省级名称
    */
    @Size(max= 32,message="编码长度不能超过32")
    @ApiModelProperty("省级名称")
    @Length(max= 32,message="编码长度不能超过32")
    private String provinceName;
    /**
    * 市级区划编号
    */
    @Size(max= 12,message="编码长度不能超过12")
    @ApiModelProperty("市级区划编号")
    @Length(max= 12,message="编码长度不能超过12")
    private String cityCode;
    /**
    * 市级名称
    */
    @Size(max= 32,message="编码长度不能超过32")
    @ApiModelProperty("市级名称")
    @Length(max= 32,message="编码长度不能超过32")
    private String cityName;
    /**
    * 区级区划编号
    */
    @Size(max= 12,message="编码长度不能超过12")
    @ApiModelProperty("区级区划编号")
    @Length(max= 12,message="编码长度不能超过12")
    private String districtCode;
    /**
    * 区级名称
    */
    @Size(max= 32,message="编码长度不能超过32")
    @ApiModelProperty("区级名称")
    @Length(max= 32,message="编码长度不能超过32")
    private String districtName;
    /**
    * 详细地址
    */
    @Size(max= 200,message="编码长度不能超过200")
    @ApiModelProperty("详细地址")
    @Length(max= 200,message="编码长度不能超过200")
    private String detail;
    /**
    * 标签
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("标签")
    @Length(max= 100,message="编码长度不能超过100")
    private String label;
    /**
    * 默认 0 否 1是
    */
    @NotNull(message="[默认 0 否 1是]不能为空")
    @ApiModelProperty("默认 0 否 1是")
    private Integer isDefault;

}
