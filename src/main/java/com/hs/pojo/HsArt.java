package com.hs.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 用户作品表
 * </p>
 *
 * @author zfh
 * @since 2022-04-24
 */
@TableName("hs_art")
@ApiModel(value = "HsArt对象", description = "用户作品表")
public class HsArt implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("作品id")
    @TableId(value = "art_id", type = IdType.AUTO)
    private Integer artId;

    @ApiModelProperty("作品所属用户id")
    private Integer userId;

    @ApiModelProperty("作品标题")
    private String artTitle;

    @ApiModelProperty("作品描述")
    private String artDesc;

    @ApiModelProperty("点赞数")
    private Integer likeCnt;

    @ApiModelProperty("收藏数")
    private Integer collectCnt;

    @ApiModelProperty("作品类型：1、图片，2、视频")
    private Integer artType;

    @ApiModelProperty("@人名称：用户昵称")
    private String artAtName;

    @ApiModelProperty("作品话题")
    private String artTopicName;

    @ApiModelProperty("发布地址GPS X坐标")
    private String artGpsX;

    @ApiModelProperty("发布地址GPS Y坐标")
    private String artGpsY;

    @ApiModelProperty("发布地址市区")
    private String addrName;

    @ApiModelProperty("发布地址描述")
    private String addrDesc;

    @ApiModelProperty("作品状态：1、发布，2、已删除  默认：1")
    private Integer artStatus;

    @ApiModelProperty("作品发布时间")
    private String artTopTime;

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
    public String getArtTitle() {
        return artTitle;
    }

    public void setArtTitle(String artTitle) {
        this.artTitle = artTitle;
    }
    public String getArtDesc() {
        return artDesc;
    }

    public void setArtDesc(String artDesc) {
        this.artDesc = artDesc;
    }
    public Integer getLikeCnt() {
        return likeCnt;
    }

    public void setLikeCnt(Integer likeCnt) {
        this.likeCnt = likeCnt;
    }
    public Integer getCollectCnt() {
        return collectCnt;
    }

    public void setCollectCnt(Integer collectCnt) {
        this.collectCnt = collectCnt;
    }
    public Integer getArtType() {
        return artType;
    }

    public void setArtType(Integer artType) {
        this.artType = artType;
    }
    public String getArtAtName() {
        return artAtName;
    }

    public void setArtAtName(String artAtName) {
        this.artAtName = artAtName;
    }
    public String getArtTopicName() {
        return artTopicName;
    }

    public void setArtTopicName(String artTopicName) {
        this.artTopicName = artTopicName;
    }
    public String getArtGpsX() {
        return artGpsX;
    }

    public void setArtGpsX(String artGpsX) {
        this.artGpsX = artGpsX;
    }
    public String getArtGpsY() {
        return artGpsY;
    }

    public void setArtGpsY(String artGpsY) {
        this.artGpsY = artGpsY;
    }
    public String getAddrName() {
        return addrName;
    }

    public void setAddrName(String addrName) {
        this.addrName = addrName;
    }
    public String getAddrDesc() {
        return addrDesc;
    }

    public void setAddrDesc(String addrDesc) {
        this.addrDesc = addrDesc;
    }
    public Integer getArtStatus() {
        return artStatus;
    }

    public void setArtStatus(Integer artStatus) {
        this.artStatus = artStatus;
    }
    public String getArtTopTime() {
        return artTopTime;
    }

    public void setArtTopTime(String artTopTime) {
        this.artTopTime = artTopTime;
    }

    @Override
    public String toString() {
        return "HsArt{" +
            "artId=" + artId +
            ", userId=" + userId +
            ", artTitle=" + artTitle +
            ", artDesc=" + artDesc +
            ", likeCnt=" + likeCnt +
            ", collectCnt=" + collectCnt +
            ", artType=" + artType +
            ", artAtName=" + artAtName +
            ", artTopicName=" + artTopicName +
            ", artGpsX=" + artGpsX +
            ", artGpsY=" + artGpsY +
            ", addrName=" + addrName +
            ", addrDesc=" + addrDesc +
            ", artStatus=" + artStatus +
            ", artTopTime=" + artTopTime +
        "}";
    }
}
