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
 * 店铺订单子表
 * </p>
 *
 * @author zfh
 * @since 2022-04-24
 */
@TableName("hs_order_info")
@ApiModel(value = "HsOrderInfo对象", description = "店铺订单子表")
public class HsOrderInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("订单子表ID")
    @TableId(value = "order_info_id", type = IdType.AUTO)
    private Integer orderInfoId;

    @ApiModelProperty("购买商品ID")
    private Integer cominfoId;

    @ApiModelProperty("购买数量")
    private Integer orderInfoCount;

    @ApiModelProperty("购买单价")
    private BigDecimal orderInfoPrice;

    @ApiModelProperty("商品总价")
    private BigDecimal orderInfoMoreprice;

    @ApiModelProperty("订单ID")
    private Integer orderId;

    public Integer getOrderInfoId() {
        return orderInfoId;
    }

    public void setOrderInfoId(Integer orderInfoId) {
        this.orderInfoId = orderInfoId;
    }
    public Integer getCominfoId() {
        return cominfoId;
    }

    public void setCominfoId(Integer cominfoId) {
        this.cominfoId = cominfoId;
    }
    public Integer getOrderInfoCount() {
        return orderInfoCount;
    }

    public void setOrderInfoCount(Integer orderInfoCount) {
        this.orderInfoCount = orderInfoCount;
    }
    public BigDecimal getOrderInfoPrice() {
        return orderInfoPrice;
    }

    public void setOrderInfoPrice(BigDecimal orderInfoPrice) {
        this.orderInfoPrice = orderInfoPrice;
    }
    public BigDecimal getOrderInfoMoreprice() {
        return orderInfoMoreprice;
    }

    public void setOrderInfoMoreprice(BigDecimal orderInfoMoreprice) {
        this.orderInfoMoreprice = orderInfoMoreprice;
    }
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "HsOrderInfo{" +
            "orderInfoId=" + orderInfoId +
            ", cominfoId=" + cominfoId +
            ", orderInfoCount=" + orderInfoCount +
            ", orderInfoPrice=" + orderInfoPrice +
            ", orderInfoMoreprice=" + orderInfoMoreprice +
            ", orderId=" + orderId +
        "}";
    }
}
