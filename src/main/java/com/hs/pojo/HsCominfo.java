package com.hs.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 商品信息表
 * </p>
 *
 * @author zfh
 * @since 2022-04-24
 */
@TableName("hs_cominfo")
@ApiModel(value = "HsCominfo对象", description = "商品信息表")
public class HsCominfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("商品ID")
    @TableId(value = "cominfo_id", type = IdType.AUTO)
    private Integer cominfoId;

    @ApiModelProperty("商品名称")
    private String cominfoName;

    @ApiModelProperty("商品标题")
    private String cominfoTitle;

    @ApiModelProperty("销量：默认0")
    private Integer cominfoSales;

    @ApiModelProperty("收藏：默认0")
    private Integer cominfoCollect;

    @ApiModelProperty("所属店铺ID")
    private Integer shopId;

    @ApiModelProperty("创建时间")
    private String cominfoCreatTime;

    @ApiModelProperty("上架时间")
    private String cominfoPutTime;

    @ApiModelProperty("商品分类（商品类别表id）")
    private Integer goodtypeId;

    @ApiModelProperty("状态（0未上架 1已上架 2.已删除）默认：0")
    private Integer cominfoState;

    public Integer getCominfoId() {
        return cominfoId;
    }

    public void setCominfoId(Integer cominfoId) {
        this.cominfoId = cominfoId;
    }
    public String getCominfoName() {
        return cominfoName;
    }

    public void setCominfoName(String cominfoName) {
        this.cominfoName = cominfoName;
    }
    public String getCominfoTitle() {
        return cominfoTitle;
    }

    public void setCominfoTitle(String cominfoTitle) {
        this.cominfoTitle = cominfoTitle;
    }
    public Integer getCominfoSales() {
        return cominfoSales;
    }

    public void setCominfoSales(Integer cominfoSales) {
        this.cominfoSales = cominfoSales;
    }
    public Integer getCominfoCollect() {
        return cominfoCollect;
    }

    public void setCominfoCollect(Integer cominfoCollect) {
        this.cominfoCollect = cominfoCollect;
    }
    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }
    public String getCominfoCreatTime() {
        return cominfoCreatTime;
    }

    public void setCominfoCreatTime(String cominfoCreatTime) {
        this.cominfoCreatTime = cominfoCreatTime;
    }
    public String getCominfoPutTime() {
        return cominfoPutTime;
    }

    public void setCominfoPutTime(String cominfoPutTime) {
        this.cominfoPutTime = cominfoPutTime;
    }
    public Integer getGoodtypeId() {
        return goodtypeId;
    }

    public void setGoodtypeId(Integer goodtypeId) {
        this.goodtypeId = goodtypeId;
    }
    public Integer getCominfoState() {
        return cominfoState;
    }

    public void setCominfoState(Integer cominfoState) {
        this.cominfoState = cominfoState;
    }

    @Override
    public String toString() {
        return "HsCominfo{" +
            "cominfoId=" + cominfoId +
            ", cominfoName=" + cominfoName +
            ", cominfoTitle=" + cominfoTitle +
            ", cominfoSales=" + cominfoSales +
            ", cominfoCollect=" + cominfoCollect +
            ", shopId=" + shopId +
            ", cominfoCreatTime=" + cominfoCreatTime +
            ", cominfoPutTime=" + cominfoPutTime +
            ", goodtypeId=" + goodtypeId +
            ", cominfoState=" + cominfoState +
        "}";
    }
}
