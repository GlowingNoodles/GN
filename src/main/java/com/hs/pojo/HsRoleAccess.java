package com.hs.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 使用联合主键，三个字段的值加一起唯一，不允许重复
 * </p>
 *
 * @author zfh
 * @since 2022-04-24
 */
@TableName("hs_role_access")
@ApiModel(value = "HsRoleAccess对象", description = "使用联合主键，三个字段的值加一起唯一，不允许重复")
public class HsRoleAccess implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("角色权限id")
    @TableId(value = "role_access_id", type = IdType.AUTO)
    private Integer roleAccessId;

    @ApiModelProperty("角色id")
    private Integer roleId;

    @ApiModelProperty("权限id")
    private Integer accessId;

    public Integer getRoleAccessId() {
        return roleAccessId;
    }

    public void setRoleAccessId(Integer roleAccessId) {
        this.roleAccessId = roleAccessId;
    }
    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
    public Integer getAccessId() {
        return accessId;
    }

    public void setAccessId(Integer accessId) {
        this.accessId = accessId;
    }

    @Override
    public String toString() {
        return "HsRoleAccess{" +
            "roleAccessId=" + roleAccessId +
            ", roleId=" + roleId +
            ", accessId=" + accessId +
        "}";
    }
}
