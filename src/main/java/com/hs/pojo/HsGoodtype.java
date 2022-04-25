package com.hs.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 商品类别表
 * </p>
 *
 * @author zfh
 * @since 2022-04-24
 */
@TableName("hs_goodtype")
@ApiModel(value = "HsGoodtype对象", description = "商品类别表")
public class HsGoodtype implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("商品分类id")
    @TableId(value = "goodtype_id", type = IdType.AUTO)
    private Integer goodtypeId;

    @ApiModelProperty("商品分类名称")
    private String goodtypeName;

    @ApiModelProperty("父级ID")
    private Integer goodtypeParentId;

    @ApiModelProperty("创建人ID：user_id")
    private Integer createId;

    @ApiModelProperty("创建时间")
    private String goodtypeCreateTime;

    @ApiModelProperty("图标")
    private String goodtypeIcon;

    public Integer getGoodtypeId() {
        return goodtypeId;
    }

    public void setGoodtypeId(Integer goodtypeId) {
        this.goodtypeId = goodtypeId;
    }

    public String getGoodtypeName() {
        return goodtypeName;
    }

    public void setGoodtypeName(String goodtypeName) {
        this.goodtypeName = goodtypeName;
    }

    public Integer getGoodtypeParentId() {
        return goodtypeParentId;
    }

    public void setGoodtypeParentId(Integer goodtypeParentId) {
        this.goodtypeParentId = goodtypeParentId;
    }

    public Integer getCreateId() {
        return createId;
    }

    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    public String getGoodtypeCreateTime() {
        return goodtypeCreateTime;
    }

    public void setGoodtypeCreateTime(String goodtypeCreateTime) {
        this.goodtypeCreateTime = goodtypeCreateTime;
    }

    public String getGoodtypeIcon() {
        return goodtypeIcon;
    }

    public void setGoodtypeIcon(String goodtypeIcon) {
        this.goodtypeIcon = goodtypeIcon;
    }

    @Override
    public String toString() {
        return "HsGoodtype{" +
                "goodtypeId=" + goodtypeId +
                ", goodtypeName=" + goodtypeName +
                ", goodtypeParentId=" + goodtypeParentId +
                ", createId=" + createId +
                ", goodtypeCreateTime=" + goodtypeCreateTime +
                ", goodtypeIcon=" + goodtypeIcon +
                "}";
    }
}
