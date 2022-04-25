package com.hs.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 管理员表
 * </p>
 *
 * @author zfh
 * @since 2022-04-24
 */
@TableName("hs_admin")
@ApiModel(value = "HsAdmin对象", description = "管理员表")
public class HsAdmin implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("超级管理员id")
    @TableId(value = "admin_id", type = IdType.AUTO)
    private Integer adminId;

    @ApiModelProperty("管理员账户名")
    private String adminCode;

    @ApiModelProperty("管理员姓名")
    private String adminName;

    @ApiModelProperty("管理员密码")
    private String adminPwd;

    @ApiModelProperty(" 角色id")
    private Integer roleId;

    @ApiModelProperty("创建时间")
    private String adminCreateTime;

    @ApiModelProperty("创建者id")
    private Integer adminCreatorId;

    @ApiModelProperty("最后登录时间")
    private String adminLastTime;

    @ApiModelProperty("最后登录IP")
    private String adminLastIp;

    @ApiModelProperty("状态0禁用、1启用、默认1")
    private Integer adminState;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminCode() {
        return adminCode;
    }

    public void setAdminCode(String adminCode) {
        this.adminCode = adminCode;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPwd() {
        return adminPwd;
    }

    public void setAdminPwd(String adminPwd) {
        this.adminPwd = adminPwd;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getAdminCreateTime() {
        return adminCreateTime;
    }

    public void setAdminCreateTime(String adminCreateTime) {
        this.adminCreateTime = adminCreateTime;
    }

    public Integer getAdminCreatorId() {
        return adminCreatorId;
    }

    public void setAdminCreatorId(Integer adminCreatorId) {
        this.adminCreatorId = adminCreatorId;
    }

    public String getAdminLastTime() {
        return adminLastTime;
    }

    public void setAdminLastTime(String adminLastTime) {
        this.adminLastTime = adminLastTime;
    }

    public String getAdminLastIp() {
        return adminLastIp;
    }

    public void setAdminLastIp(String adminLastIp) {
        this.adminLastIp = adminLastIp;
    }

    public Integer getAdminState() {
        return adminState;
    }

    public void setAdminState(Integer adminState) {
        this.adminState = adminState;
    }

    @Override
    public String toString() {
        return "HsAdmin{" +
                "adminId=" + adminId +
                ", adminCode=" + adminCode +
                ", adminName=" + adminName +
                ", adminPwd=" + adminPwd +
                ", roleId=" + roleId +
                ", adminCreateTime=" + adminCreateTime +
                ", adminCreatorId=" + adminCreatorId +
                ", adminLastTime=" + adminLastTime +
                ", adminLastIp=" + adminLastIp +
                ", adminState=" + adminState +
                "}";
    }
}
