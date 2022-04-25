package com.hs.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 点赞或收藏表
 * </p>
 *
 * @author zfh
 * @since 2022-04-24
 */
@TableName("hs_praise")
@ApiModel(value = "HsPraise对象", description = "点赞或收藏表")
public class HsPraise implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("点赞或收藏id")
    @TableId(value = "praise_id", type = IdType.AUTO)
    private Integer praiseId;

    @ApiModelProperty("作品id")
    private Integer artId;

    @ApiModelProperty("点赞或收藏用户id")
    private Integer userId;

    @ApiModelProperty("类型：1、点赞，2、收藏")
    private Integer praiseType;

    @ApiModelProperty("创建时间")
    private String praiseLikeTime;

    public Integer getPraiseId() {
        return praiseId;
    }

    public void setPraiseId(Integer praiseId) {
        this.praiseId = praiseId;
    }
    public Integer getArtId() {
        return artId;
    }

    public void setArtId(Integer artId) {
        this.artId = artId;
    }
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public Integer getPraiseType() {
        return praiseType;
    }

    public void setPraiseType(Integer praiseType) {
        this.praiseType = praiseType;
    }
    public String getPraiseLikeTime() {
        return praiseLikeTime;
    }

    public void setPraiseLikeTime(String praiseLikeTime) {
        this.praiseLikeTime = praiseLikeTime;
    }

    @Override
    public String toString() {
        return "HsPraise{" +
            "praiseId=" + praiseId +
            ", artId=" + artId +
            ", userId=" + userId +
            ", praiseType=" + praiseType +
            ", praiseLikeTime=" + praiseLikeTime +
        "}";
    }
}
