package com.hs.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 站内信息表
 * </p>
 *
 * @author zfh
 * @since 2022-04-24
 */
@TableName("hs_znmsg")
@ApiModel(value = "HsZnmsg对象", description = "站内信息表")
public class HsZnmsg implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("消息ID")
    @TableId(value = "znmsg_id", type = IdType.AUTO)
    private Integer znmsgId;

    @ApiModelProperty("接收人ID（用户ID）")
    private Integer userId;

    @ApiModelProperty("消息内容")
    private String znmsgText;

    @ApiModelProperty("消息类型：0用户消息  1系统消息")
    private Integer znmsgType;

    @ApiModelProperty("发送时间")
    private String znmsgSendTime;

    public Integer getZnmsgId() {
        return znmsgId;
    }

    public void setZnmsgId(Integer znmsgId) {
        this.znmsgId = znmsgId;
    }
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getZnmsgText() {
        return znmsgText;
    }

    public void setZnmsgText(String znmsgText) {
        this.znmsgText = znmsgText;
    }
    public Integer getZnmsgType() {
        return znmsgType;
    }

    public void setZnmsgType(Integer znmsgType) {
        this.znmsgType = znmsgType;
    }
    public String getZnmsgSendTime() {
        return znmsgSendTime;
    }

    public void setZnmsgSendTime(String znmsgSendTime) {
        this.znmsgSendTime = znmsgSendTime;
    }

    @Override
    public String toString() {
        return "HsZnmsg{" +
            "znmsgId=" + znmsgId +
            ", userId=" + userId +
            ", znmsgText=" + znmsgText +
            ", znmsgType=" + znmsgType +
            ", znmsgSendTime=" + znmsgSendTime +
        "}";
    }
}
