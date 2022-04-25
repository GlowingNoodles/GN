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
 * 商品规格表
 * </p>
 *
 * @author zfh
 * @since 2022-04-24
 */
@TableName("hs_sku")
@ApiModel(value = "HsSku对象", description = "商品规格表")
public class HsSku implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("规格ID")
    @TableId(value = "sku_id", type = IdType.AUTO)
    private Integer skuId;

    @ApiModelProperty("规格名称")
    private String skuName;

    @ApiModelProperty("所属组ID")
    private Integer skuGroupId;

    @ApiModelProperty("库存")
    private Integer skuRepertory;

    @ApiModelProperty("价格")
    private BigDecimal skuPrice;

    @ApiModelProperty("是否推荐（0否 1是）默认：0")
    private Integer skuShow;

    @ApiModelProperty("状态(0启用1禁用)")
    private Integer skuState;

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public Integer getSkuGroupId() {
        return skuGroupId;
    }

    public void setSkuGroupId(Integer skuGroupId) {
        this.skuGroupId = skuGroupId;
    }

    public Integer getSkuRepertory() {
        return skuRepertory;
    }

    public void setSkuRepertory(Integer skuRepertory) {
        this.skuRepertory = skuRepertory;
    }

    public BigDecimal getSkuPrice() {
        return skuPrice;
    }

    public void setSkuPrice(BigDecimal skuPrice) {
        this.skuPrice = skuPrice;
    }

    public Integer getSkuShow() {
        return skuShow;
    }

    public void setSkuShow(Integer skuShow) {
        this.skuShow = skuShow;
    }

    public Integer getSkuState() {
        return skuState;
    }

    public void setSkuState(Integer skuState) {
        this.skuState = skuState;
    }

    @Override
    public String toString() {
        return "HsSku{" +
                "skuId=" + skuId +
                ", skuName=" + skuName +
                ", skuGroupId=" + skuGroupId +
                ", skuRepertory=" + skuRepertory +
                ", skuPrice=" + skuPrice +
                ", skuShow=" + skuShow +
                ", skuState=" + skuState +
                "}";
    }
}
