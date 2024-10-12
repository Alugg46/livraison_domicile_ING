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
* 用户信息
* @TableName user
*/

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    /**
    * 主键
    */
    @NotNull(message="[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 微信用户唯一标识
    */
    @Size(max= 45,message="编码长度不能超过45")
    @ApiModelProperty("微信用户唯一标识")
    @Length(max= 45,message="编码长度不能超过45")
    private String openid;
    /**
    * 姓名
    */
    @Size(max= 32,message="编码长度不能超过32")
    @ApiModelProperty("姓名")
    @Length(max= 32,message="编码长度不能超过32")
    private String name;
    /**
    * 手机号
    */
    @Size(max= 11,message="编码长度不能超过11")
    @ApiModelProperty("手机号")
    @Length(max= 11,message="编码长度不能超过11")
    private String phone;
    /**
    * 性别
    */
    @Size(max= 2,message="编码长度不能超过2")
    @ApiModelProperty("性别")
    @Length(max= 2,message="编码长度不能超过2")
    private String sex;
    /**
    * 身份证号
    */
    @Size(max= 18,message="编码长度不能超过18")
    @ApiModelProperty("身份证号")
    @Length(max= 18,message="编码长度不能超过18")
    private String idNumber;
    /**
    * 头像
    */
    @Size(max= 500,message="编码长度不能超过500")
    @ApiModelProperty("头像")
    @Length(max= 500,message="编码长度不能超过500")
    private String avatar;
    /**
    * 
    */
    private LocalDateTime createTime;


}
