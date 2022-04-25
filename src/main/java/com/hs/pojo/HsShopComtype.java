package com.hs.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 店铺商品分类表
 * </p>
 *
 * @author zfh
 * @since 2022-04-24
 */
@TableName("hs_shop_comtype")
@ApiModel(value = "HsShopComtype对象", description = "店铺商品分类表")
public class HsShopComtype implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("店铺商品分类ID")
    @TableId(value = "shop_comtype_id", type = IdType.AUTO)
    private Integer shopComtypeId;

    @ApiModelProperty("店铺商品分类名称")
    private String shopComtypeTypeName;

    @ApiModelProperty("店铺商品分类父级ID")
    private Integer shopComtypeParentId;

    @ApiModelProperty("所属店铺ID")
    private Integer shopId;

    @ApiModelProperty("分类创建时间")
    private String shopComtypeCreateTime;

    public Integer getShopComtypeId() {
        return shopComtypeId;
    }

    public void setShopComtypeId(Integer shopComtypeId) {
        this.shopComtypeId = shopComtypeId;
    }

    public String getShopComtypeTypeName() {
        return shopComtypeTypeName;
    }

    public void setShopComtypeTypeName(String shopComtypeTypeName) {
        this.shopComtypeTypeName = shopComtypeTypeName;
    }

    public Integer getShopComtypeParentId() {
        return shopComtypeParentId;
    }

    public void setShopComtypeParentId(Integer shopComtypeParentId) {
        this.shopComtypeParentId = shopComtypeParentId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getShopComtypeCreateTime() {
        return shopComtypeCreateTime;
    }

    public void setShopComtypeCreateTime(String shopComtypeCreateTime) {
        this.shopComtypeCreateTime = shopComtypeCreateTime;
    }

    @Override
    public String toString() {
        return "HsShopComtype{" +
                "shopComtypeId=" + shopComtypeId +
                ", shopComtypeTypeName=" + shopComtypeTypeName +
                ", shopComtypeParentId=" + shopComtypeParentId +
                ", shopId=" + shopId +
                ", shopComtypeCreateTime=" + shopComtypeCreateTime +
                "}";
    }
}
