package com.hs.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 商品图片信息表
 * </p>
 *
 * @author zfh
 * @since 2022-04-24
 */
@TableName("hs_comimg")
@ApiModel(value = "HsComimg对象", description = "商品图片信息表")
public class HsComimg implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("图片ID")
    @TableId(value = "comimg_id", type = IdType.AUTO)
    private Integer comimgId;

    @ApiModelProperty("图片链接")
    private String comimgUrl;

    @ApiModelProperty("所属商品ID")
    private Integer cominfoId;

    @ApiModelProperty("图片类型（0封面1轮播2规格图片）")
    private Integer comimgType;

    public Integer getComimgId() {
        return comimgId;
    }

    public void setComimgId(Integer comimgId) {
        this.comimgId = comimgId;
    }
    public String getComimgUrl() {
        return comimgUrl;
    }

    public void setComimgUrl(String comimgUrl) {
        this.comimgUrl = comimgUrl;
    }
    public Integer getCominfoId() {
        return cominfoId;
    }

    public void setCominfoId(Integer cominfoId) {
        this.cominfoId = cominfoId;
    }
    public Integer getComimgType() {
        return comimgType;
    }

    public void setComimgType(Integer comimgType) {
        this.comimgType = comimgType;
    }

    @Override
    public String toString() {
        return "HsComimg{" +
            "comimgId=" + comimgId +
            ", comimgUrl=" + comimgUrl +
            ", cominfoId=" + cominfoId +
            ", comimgType=" + comimgType +
        "}";
    }
}
