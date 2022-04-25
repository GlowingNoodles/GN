package com.hs.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 作品资源信息表
 * </p>
 *
 * @author zfh
 * @since 2022-04-24
 */
@TableName("hs_art_info")
@ApiModel(value = "HsArtInfo对象", description = "作品资源信息表")
public class HsArtInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("作品资源id")
    @TableId(value = "info_id", type = IdType.AUTO)
    private Integer infoId;

    @ApiModelProperty("作品资源编码")
    private String infoCode;

    @ApiModelProperty("作品资源路径")
    private String infoSrc;

    @ApiModelProperty("作品id")
    private Integer artId;

    @ApiModelProperty("作品资源类型：1图片，2视频，3音乐")
    private Integer infoType;

    @ApiModelProperty("当前作品的第一条资源为默认展示0，1不展示")
    private Integer infoDefault;

    public Integer getInfoId() {
        return infoId;
    }

    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
    }
    public String getInfoCode() {
        return infoCode;
    }

    public void setInfoCode(String infoCode) {
        this.infoCode = infoCode;
    }
    public String getInfoSrc() {
        return infoSrc;
    }

    public void setInfoSrc(String infoSrc) {
        this.infoSrc = infoSrc;
    }
    public Integer getArtId() {
        return artId;
    }

    public void setArtId(Integer artId) {
        this.artId = artId;
    }
    public Integer getInfoType() {
        return infoType;
    }

    public void setInfoType(Integer infoType) {
        this.infoType = infoType;
    }
    public Integer getInfoDefault() {
        return infoDefault;
    }

    public void setInfoDefault(Integer infoDefault) {
        this.infoDefault = infoDefault;
    }

    @Override
    public String toString() {
        return "HsArtInfo{" +
            "infoId=" + infoId +
            ", infoCode=" + infoCode +
            ", infoSrc=" + infoSrc +
            ", artId=" + artId +
            ", infoType=" + infoType +
            ", infoDefault=" + infoDefault +
        "}";
    }
}
