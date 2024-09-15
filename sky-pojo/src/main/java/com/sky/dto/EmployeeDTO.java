package com.sky.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(description = "新增员工时传递的数据模型")
public class EmployeeDTO implements Serializable {
    private Long id;
    private String username;
    private String name;
    private String phone;
    private String sex;

    @ApiModelProperty("身份证")
    private String idNumber;
}
