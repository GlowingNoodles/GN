package com.hs.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 权限表
 * </p>
 *
 * @author zfh
 * @since 2022-04-24
 */
@TableName("hs_access")
@ApiModel(value = "HsAccess对象", description = "权限表")
public class HsAccess implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("权限id")
    @TableId(value = "access_id", type = IdType.AUTO)
    private Integer accessId;

    @ApiModelProperty("权限名称")
    private String accessName;

    @ApiModelProperty("权限描述（干什么用的？能实现什么功能？）")
    private String accessDesc;

    @ApiModelProperty("权限对应的请求映射地址")
    private String accessUrl;

    public Integer getAccessId() {
        return accessId;
    }

    public void setAccessId(Integer accessId) {
        this.accessId = accessId;
    }
    public String getAccessName() {
        return accessName;
    }

    public void setAccessName(String accessName) {
        this.accessName = accessName;
    }
    public String getAccessDesc() {
        return accessDesc;
    }

    public void setAccessDesc(String accessDesc) {
        this.accessDesc = accessDesc;
    }
    public String getAccessUrl() {
        return accessUrl;
    }

    public void setAccessUrl(String accessUrl) {
        this.accessUrl = accessUrl;
    }

    @Override
    public String toString() {
        return "HsAccess{" +
            "accessId=" + accessId +
            ", accessName=" + accessName +
            ", accessDesc=" + accessDesc +
            ", accessUrl=" + accessUrl +
        "}";
    }
}
