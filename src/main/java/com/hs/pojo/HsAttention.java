package com.hs.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 用户关注表
 * </p>
 *
 * @author zfh
 * @since 2022-04-24
 */
@TableName("hs_attention")
@ApiModel(value = "HsAttention对象", description = "用户关注表")
public class HsAttention implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("关注id")
    @TableId(value = "attention_id", type = IdType.AUTO)
    private Integer attentionId;

    @ApiModelProperty("用户id")
    private Integer userId;

    @ApiModelProperty("被关注者id")
    private Integer userLikeId;

    @ApiModelProperty("关注时间")
    private String attentionTime;

    @ApiModelProperty("被关注者类型：1、用户，2、店铺")
    private Integer attentionType;

    public Integer getAttentionId() {
        return attentionId;
    }

    public void setAttentionId(Integer attentionId) {
        this.attentionId = attentionId;
    }
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public Integer getUserLikeId() {
        return userLikeId;
    }

    public void setUserLikeId(Integer userLikeId) {
        this.userLikeId = userLikeId;
    }
    public String getAttentionTime() {
        return attentionTime;
    }

    public void setAttentionTime(String attentionTime) {
        this.attentionTime = attentionTime;
    }
    public Integer getAttentionType() {
        return attentionType;
    }

    public void setAttentionType(Integer attentionType) {
        this.attentionType = attentionType;
    }

    @Override
    public String toString() {
        return "HsAttention{" +
            "attentionId=" + attentionId +
            ", userId=" + userId +
            ", userLikeId=" + userLikeId +
            ", attentionTime=" + attentionTime +
            ", attentionType=" + attentionType +
        "}";
    }
}
