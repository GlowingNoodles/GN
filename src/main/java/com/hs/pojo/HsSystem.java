package com.hs.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 系统设置表
 * </p>
 *
 * @author zfh
 * @since 2022-04-24
 */
@TableName("hs_system")
@ApiModel(value = "HsSystem对象", description = "系统设置表")
public class HsSystem implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("系统ID")
    @TableId(value = "system_id", type = IdType.AUTO)
    private Integer systemId;

    @ApiModelProperty("系统名称")
    private String systemName;

    @ApiModelProperty("域名")
    private String systemDns;

    @ApiModelProperty("APPID")
    private String systemAppid;

    @ApiModelProperty("短信账号")
    private String systemMsgid;

    @ApiModelProperty("短信密码")
    private String systemMsgpwd;

    @ApiModelProperty("备案号")
    private String systemEmc;

    public Integer getSystemId() {
        return systemId;
    }

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }
    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }
    public String getSystemDns() {
        return systemDns;
    }

    public void setSystemDns(String systemDns) {
        this.systemDns = systemDns;
    }
    public String getSystemAppid() {
        return systemAppid;
    }

    public void setSystemAppid(String systemAppid) {
        this.systemAppid = systemAppid;
    }
    public String getSystemMsgid() {
        return systemMsgid;
    }

    public void setSystemMsgid(String systemMsgid) {
        this.systemMsgid = systemMsgid;
    }
    public String getSystemMsgpwd() {
        return systemMsgpwd;
    }

    public void setSystemMsgpwd(String systemMsgpwd) {
        this.systemMsgpwd = systemMsgpwd;
    }
    public String getSystemEmc() {
        return systemEmc;
    }

    public void setSystemEmc(String systemEmc) {
        this.systemEmc = systemEmc;
    }

    @Override
    public String toString() {
        return "HsSystem{" +
            "systemId=" + systemId +
            ", systemName=" + systemName +
            ", systemDns=" + systemDns +
            ", systemAppid=" + systemAppid +
            ", systemMsgid=" + systemMsgid +
            ", systemMsgpwd=" + systemMsgpwd +
            ", systemEmc=" + systemEmc +
        "}";
    }
}
