package com.sky.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import java.time.LocalDateTime;
import java.util.Date;
import java.math.BigDecimal;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

/**
* 订单表
* @TableName orders
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Orders implements Serializable {

    /**
    * 主键
    */
    @NotNull(message="[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 订单号
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("订单号")
    @Length(max= 50,message="编码长度不能超过50")
    private String number;
    /**
    * 订单状态 1待付款 2待接单 3已接单 4派送中 5已完成 6已取消 7退款
    */
    @NotNull(message="[订单状态 1待付款 2待接单 3已接单 4派送中 5已完成 6已取消 7退款]不能为空")
    @ApiModelProperty("订单状态 1待付款 2待接单 3已接单 4派送中 5已完成 6已取消 7退款")
    private Integer status;
    /**
    * 下单用户
    */
    @NotNull(message="[下单用户]不能为空")
    @ApiModelProperty("下单用户")
    private Long userId;
    /**
    * 地址id
    */
    @NotNull(message="[地址id]不能为空")
    @ApiModelProperty("地址id")
    private Long addressBookId;
    /**
    * 下单时间
    */
    @NotNull(message="[下单时间]不能为空")
    @ApiModelProperty("下单时间")
    private LocalDateTime orderTime;
    /**
    * 结账时间
    */
    @ApiModelProperty("结账时间")
    private LocalDateTime checkoutTime;
    /**
    * 支付方式 1微信,2支付宝
    */
    @NotNull(message="[支付方式 1微信,2支付宝]不能为空")
    @ApiModelProperty("支付方式 1微信,2支付宝")
    private Integer payMethod;
    /**
    * 支付状态 0未支付 1已支付 2退款
    */
    @NotNull(message="[支付状态 0未支付 1已支付 2退款]不能为空")
    @ApiModelProperty("支付状态 0未支付 1已支付 2退款")
    private Integer payStatus;
    /**
    * 实收金额
    */
    @NotNull(message="[实收金额]不能为空")
    @ApiModelProperty("实收金额")
    private BigDecimal amount;
    /**
    * 备注
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("备注")
    @Length(max= 100,message="编码长度不能超过100")
    private String remark;
    /**
    * 手机号
    */
    @Size(max= 11,message="编码长度不能超过11")
    @ApiModelProperty("手机号")
    @Length(max= 11,message="编码长度不能超过11")
    private String phone;
    /**
    * 地址
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("地址")
    @Length(max= 255,message="编码长度不能超过255")
    private String address;
    /**
    * 用户名称
    */
    @Size(max= 32,message="编码长度不能超过32")
    @ApiModelProperty("用户名称")
    @Length(max= 32,message="编码长度不能超过32")
    private String userName;
    /**
    * 收货人
    */
    @Size(max= 32,message="编码长度不能超过32")
    @ApiModelProperty("收货人")
    @Length(max= 32,message="编码长度不能超过32")
    private String consignee;
    /**
    * 订单取消原因
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("订单取消原因")
    @Length(max= 255,message="编码长度不能超过255")
    private String cancelReason;
    /**
    * 订单拒绝原因
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("订单拒绝原因")
    @Length(max= 255,message="编码长度不能超过255")
    private String rejectionReason;
    /**
    * 订单取消时间
    */
    @ApiModelProperty("订单取消时间")
    private LocalDateTime cancelTime;
    /**
    * 预计送达时间
    */
    @ApiModelProperty("预计送达时间")
    private LocalDateTime estimatedDeliveryTime;
    /**
    * 配送状态  1立即送出  0选择具体时间
    */
    @NotNull(message="[配送状态  1立即送出  0选择具体时间]不能为空")
    @ApiModelProperty("配送状态  1立即送出  0选择具体时间")
    private Integer deliveryStatus;
    /**
    * 送达时间
    */
    @ApiModelProperty("送达时间")
    private LocalDateTime deliveryTime;
    /**
    * 打包费
    */
    @ApiModelProperty("打包费")
    private Integer packAmount;
    /**
    * 餐具数量
    */
    @ApiModelProperty("餐具数量")
    private Integer tablewareNumber;
    /**
    * 餐具数量状态  1按餐量提供  0选择具体数量
    */
    @NotNull(message="[餐具数量状态  1按餐量提供  0选择具体数量]不能为空")
    @ApiModelProperty("餐具数量状态  1按餐量提供  0选择具体数量")
    private Integer tablewareStatus;


}
