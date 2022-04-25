package com.hs.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 举报信息表
 * </p>
 *
 * @author zfh
 * @since 2022-04-24
 */
@TableName("hs_jbmsg")
@ApiModel(value = "HsJbmsg对象", description = "举报信息表")
public class HsJbmsg implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("举报信息id")
    @TableId(value = "jbmsg_id", type = IdType.AUTO)
    private Integer jbmsgId;

    @ApiModelProperty("举报类型")
    private String jbmsgType;

    @ApiModelProperty("举报描述")
    private String jbmsgDesc;

    @ApiModelProperty("举报人ID")
    private Integer userId;

    @ApiModelProperty("举报评论id")
    private Integer commId;

    @ApiModelProperty("举报时间")
    private String jbmsgTime;

    @ApiModelProperty("举报作品id")
    private Integer artId;

    @ApiModelProperty("处理人id")
    private Integer adminId;

    @ApiModelProperty("处理时间 ")
    private String jbmsgDisTime;

    @ApiModelProperty("处理意见")
    private String jbmsgOpinion;

    public Integer getJbmsgId() {
        return jbmsgId;
    }

    public void setJbmsgId(Integer jbmsgId) {
        this.jbmsgId = jbmsgId;
    }
    public String getJbmsgType() {
        return jbmsgType;
    }

    public void setJbmsgType(String jbmsgType) {
        this.jbmsgType = jbmsgType;
    }
    public String getJbmsgDesc() {
        return jbmsgDesc;
    }

    public void setJbmsgDesc(String jbmsgDesc) {
        this.jbmsgDesc = jbmsgDesc;
    }
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public Integer getCommId() {
        return commId;
    }

    public void setCommId(Integer commId) {
        this.commId = commId;
    }
    public String getJbmsgTime() {
        return jbmsgTime;
    }

    public void setJbmsgTime(String jbmsgTime) {
        this.jbmsgTime = jbmsgTime;
    }
    public Integer getArtId() {
        return artId;
    }

    public void setArtId(Integer artId) {
        this.artId = artId;
    }
    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }
    public String getJbmsgDisTime() {
        return jbmsgDisTime;
    }

    public void setJbmsgDisTime(String jbmsgDisTime) {
        this.jbmsgDisTime = jbmsgDisTime;
    }
    public String getJbmsgOpinion() {
        return jbmsgOpinion;
    }

    public void setJbmsgOpinion(String jbmsgOpinion) {
        this.jbmsgOpinion = jbmsgOpinion;
    }

    @Override
    public String toString() {
        return "HsJbmsg{" +
            "jbmsgId=" + jbmsgId +
            ", jbmsgType=" + jbmsgType +
            ", jbmsgDesc=" + jbmsgDesc +
            ", userId=" + userId +
            ", commId=" + commId +
            ", jbmsgTime=" + jbmsgTime +
            ", artId=" + artId +
            ", adminId=" + adminId +
            ", jbmsgDisTime=" + jbmsgDisTime +
            ", jbmsgOpinion=" + jbmsgOpinion +
        "}";
    }
}
