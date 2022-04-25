package com.hs.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 信息模板表
 * </p>
 *
 * @author zfh
 * @since 2022-04-24
 */
@TableName("hs_msgtemp")
@ApiModel(value = "HsMsgtemp对象", description = "信息模板表")
public class HsMsgtemp implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("模板ID")
    @TableId(value = "msgtemp_id", type = IdType.AUTO)
    private Integer msgtempId;

    @ApiModelProperty("模板名称")
    private String msgtempName;

    @ApiModelProperty("模板内容")
    private String msgtempText;

    @ApiModelProperty("模板描述")
    private String msgtempDesc;

    @ApiModelProperty("状态：1、开启，0，禁用")
    private Integer msgtempStatus;

    public Integer getMsgtempId() {
        return msgtempId;
    }

    public void setMsgtempId(Integer msgtempId) {
        this.msgtempId = msgtempId;
    }

    public String getMsgtempName() {
        return msgtempName;
    }

    public void setMsgtempName(String msgtempName) {
        this.msgtempName = msgtempName;
    }

    public String getMsgtempText() {
        return msgtempText;
    }

    public void setMsgtempText(String msgtempText) {
        this.msgtempText = msgtempText;
    }

    public String getMsgtempDesc() {
        return msgtempDesc;
    }

    public void setMsgtempDesc(String msgtempDesc) {
        this.msgtempDesc = msgtempDesc;
    }

    public Integer getMsgtempStatus() {
        return msgtempStatus;
    }

    public void setMsgtempStatus(Integer msgtempStatus) {
        this.msgtempStatus = msgtempStatus;
    }

    @Override
    public String toString() {
        return "HsMsgtemp{" +
                "msgtempId=" + msgtempId +
                ", msgtempName=" + msgtempName +
                ", msgtempText=" + msgtempText +
                ", msgtempDesc=" + msgtempDesc +
                ", msgtempStatus=" + msgtempStatus +
                "}";
    }
}
