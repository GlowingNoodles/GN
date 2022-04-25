package com.hs.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 文章类型表（帮助中心）
 * </p>
 *
 * @author zfh
 * @since 2022-04-24
 */
@TableName("hs_help_type")
@ApiModel(value = "HsHelpType对象", description = "文章类型表（帮助中心）")
public class HsHelpType implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("文章类型ID")
    @TableId(value = "help_type_id", type = IdType.AUTO)
    private Integer helpTypeId;

    @ApiModelProperty("文章类型名称")
    private String helpTypeName;

    @ApiModelProperty("文章父级ID ")
    private Integer helpTypeParentId;

    public Integer getHelpTypeId() {
        return helpTypeId;
    }

    public void setHelpTypeId(Integer helpTypeId) {
        this.helpTypeId = helpTypeId;
    }
    public String getHelpTypeName() {
        return helpTypeName;
    }

    public void setHelpTypeName(String helpTypeName) {
        this.helpTypeName = helpTypeName;
    }
    public Integer getHelpTypeParentId() {
        return helpTypeParentId;
    }

    public void setHelpTypeParentId(Integer helpTypeParentId) {
        this.helpTypeParentId = helpTypeParentId;
    }

    @Override
    public String toString() {
        return "HsHelpType{" +
            "helpTypeId=" + helpTypeId +
            ", helpTypeName=" + helpTypeName +
            ", helpTypeParentId=" + helpTypeParentId +
        "}";
    }
}
