package com.hs.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.math.BigDecimal;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 订单总表
 * </p>
 *
 * @author zfh
 * @since 2022-04-24
 */
@TableName("hs_order")
@ApiModel(value = "HsOrder对象", description = "订单总表")
public class HsOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("订单id")
    @TableId(value = "order_id", type = IdType.AUTO)
    private Integer orderId;

    @ApiModelProperty("订单编号")
    private String orderCode;

    @ApiModelProperty("订单总价")
    private BigDecimal orderMoreprice;

    @ApiModelProperty("购买人ID（用户ID）")
    private Integer userId;

    @ApiModelProperty("购买时间")
    private String orderCreatTime;

    @ApiModelProperty("完成时间（用户点击已完成时时间）")
    private String orderFinishTime;

    @ApiModelProperty("快递名称")
    private String orderKdName;

    @ApiModelProperty("快递编号")
    private String orderKdNum;

    @ApiModelProperty("订单状态（0待支付、1待发货、2待收货、3待评价、4退款售后）")
    private Integer orderState;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public BigDecimal getOrderMoreprice() {
        return orderMoreprice;
    }

    public void setOrderMoreprice(BigDecimal orderMoreprice) {
        this.orderMoreprice = orderMoreprice;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOrderCreatTime() {
        return orderCreatTime;
    }

    public void setOrderCreatTime(String orderCreatTime) {
        this.orderCreatTime = orderCreatTime;
    }

    public String getOrderFinishTime() {
        return orderFinishTime;
    }

    public void setOrderFinishTime(String orderFinishTime) {
        this.orderFinishTime = orderFinishTime;
    }

    public String getOrderKdName() {
        return orderKdName;
    }

    public void setOrderKdName(String orderKdName) {
        this.orderKdName = orderKdName;
    }

    public String getOrderKdNum() {
        return orderKdNum;
    }

    public void setOrderKdNum(String orderKdNum) {
        this.orderKdNum = orderKdNum;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    @Override
    public String toString() {
        return "HsOrder{" +
                "orderId=" + orderId +
                ", orderCode=" + orderCode +
                ", orderMoreprice=" + orderMoreprice +
                ", userId=" + userId +
                ", orderCreatTime=" + orderCreatTime +
                ", orderFinishTime=" + orderFinishTime +
                ", orderKdName=" + orderKdName +
                ", orderKdNum=" + orderKdNum +
                ", orderState=" + orderState +
                "}";
    }
}
