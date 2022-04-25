package com.hs.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 订单评价表
 * </p>
 *
 * @author zfh
 * @since 2022-04-24
 */
@TableName("hs_order_talk")
@ApiModel(value = "HsOrderTalk对象", description = "订单评价表")
public class HsOrderTalk implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("订单评价ID")
    @TableId(value = "order_talk_id", type = IdType.AUTO)
    private Integer orderTalkId;

    @ApiModelProperty("订单id")
    private Integer orderId;

    @ApiModelProperty("用户id")
    private Integer userId;

    @ApiModelProperty("创建时间")
    private String shopTalkTime;

    @ApiModelProperty("订单评价内容")
    private String shopTalkContent;

    public Integer getOrderTalkId() {
        return orderTalkId;
    }

    public void setOrderTalkId(Integer orderTalkId) {
        this.orderTalkId = orderTalkId;
    }
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getShopTalkTime() {
        return shopTalkTime;
    }

    public void setShopTalkTime(String shopTalkTime) {
        this.shopTalkTime = shopTalkTime;
    }
    public String getShopTalkContent() {
        return shopTalkContent;
    }

    public void setShopTalkContent(String shopTalkContent) {
        this.shopTalkContent = shopTalkContent;
    }

    @Override
    public String toString() {
        return "HsOrderTalk{" +
            "orderTalkId=" + orderTalkId +
            ", orderId=" + orderId +
            ", userId=" + userId +
            ", shopTalkTime=" + shopTalkTime +
            ", shopTalkContent=" + shopTalkContent +
        "}";
    }
}
