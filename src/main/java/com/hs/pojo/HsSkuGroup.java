package com.hs.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 商品规格组表
 * </p>
 *
 * @author zfh
 * @since 2022-04-24
 */
@TableName("hs_sku_group")
@ApiModel(value = "HsSkuGroup对象", description = "商品规格组表")
public class HsSkuGroup implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("组ID")
            @TableId(value = "sku_group_id", type = IdType.AUTO)
    private Integer skuGroupId;

    @ApiModelProperty("所属商品ID")
    private Integer cominfoId;

    @ApiModelProperty("组名称")
    private String skuGroupName;

    public Integer getSkuGroupId() {
        return skuGroupId;
    }

    public void setSkuGroupId(Integer skuGroupId) {
        this.skuGroupId = skuGroupId;
    }

    public Integer getCominfoId() {
        return cominfoId;
    }

    public void setCominfoId(Integer cominfoId) {
        this.cominfoId = cominfoId;
    }

    public String getSkuGroupName() {
        return skuGroupName;
    }

    public void setSkuGroupName(String skuGroupName) {
        this.skuGroupName = skuGroupName;
    }

    @Override
    public String toString() {
        return "HsSkuGroup{" +
                "skuGroupId=" + skuGroupId +
                ", cominfoId=" + cominfoId +
                ", skuGroupName=" + skuGroupName +
                "}";
    }
}
