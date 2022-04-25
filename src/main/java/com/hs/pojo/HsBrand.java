package com.hs.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 商品品牌表
 * </p>
 *
 * @author zfh
 * @since 2022-04-24
 */
@TableName("hs_brand")
@ApiModel(value = "HsBrand对象", description = "商品品牌表")
public class HsBrand implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("品牌ID")
    @TableId(value = "brand_id", type = IdType.AUTO)
    private Integer brandId;

    @ApiModelProperty("品牌名称")
    private String brandName;

    @ApiModelProperty("描述")
    private String brandDescr;

    @ApiModelProperty("图标")
    private String brandImage;

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandDescr() {
        return brandDescr;
    }

    public void setBrandDescr(String brandDescr) {
        this.brandDescr = brandDescr;
    }

    public String getBrandImage() {
        return brandImage;
    }

    public void setBrandImage(String brandImage) {
        this.brandImage = brandImage;
    }

    @Override
    public String toString() {
        return "HsBrand{" +
                "brandId=" + brandId +
                ", brandName=" + brandName +
                ", brandDescr=" + brandDescr +
                ", brandImage=" + brandImage +
                "}";
    }
}
