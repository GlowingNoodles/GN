package com.hs.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author zfh
 * @since 2022-04-24
 */
@TableName("hs_user")
@ApiModel(value = "HsUser对象", description = "用户表")
public class HsUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("用户id")
    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    @ApiModelProperty("小红书编号（唯一）")
    private String userCode;

    @ApiModelProperty("用户昵称（唯一）")
    private String userName;

    @ApiModelProperty("用户密码")
    private String userPwd;

    @ApiModelProperty("用户手机号")
    private String userPhone;

    @ApiModelProperty("地区id")
    private Integer addrId;

    @ApiModelProperty("用户创建时间")
    private String createTime;

    @ApiModelProperty("用户状态：1、正常，2、冻结（默认1）")
    private Integer userStatus;

    @ApiModelProperty("1男、0女")
    private Integer userGender;

    @ApiModelProperty("用户简介")
    private String userIntro;

    @ApiModelProperty("用户出生日期")
    private String userBirthday;

    @ApiModelProperty("用户头像地址")
    private String userHeadImage;

    @ApiModelProperty("用户背景图片地址")
    private String userBackgroundImage;

    @ApiModelProperty("用户职业id")
    private Integer jobId;

    @ApiModelProperty("用户二维码名片路径")
    private String userErweima;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
    public Integer getAddrId() {
        return addrId;
    }

    public void setAddrId(Integer addrId) {
        this.addrId = addrId;
    }
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }
    public Integer getUserGender() {
        return userGender;
    }

    public void setUserGender(Integer userGender) {
        this.userGender = userGender;
    }
    public String getUserIntro() {
        return userIntro;
    }

    public void setUserIntro(String userIntro) {
        this.userIntro = userIntro;
    }
    public String getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(String userBirthday) {
        this.userBirthday = userBirthday;
    }
    public String getUserHeadImage() {
        return userHeadImage;
    }

    public void setUserHeadImage(String userHeadImage) {
        this.userHeadImage = userHeadImage;
    }
    public String getUserBackgroundImage() {
        return userBackgroundImage;
    }

    public void setUserBackgroundImage(String userBackgroundImage) {
        this.userBackgroundImage = userBackgroundImage;
    }
    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }
    public String getUserErweima() {
        return userErweima;
    }

    public void setUserErweima(String userErweima) {
        this.userErweima = userErweima;
    }

    @Override
    public String toString() {
        return "HsUser{" +
            "userId=" + userId +
            ", userCode=" + userCode +
            ", userName=" + userName +
            ", userPwd=" + userPwd +
            ", userPhone=" + userPhone +
            ", addrId=" + addrId +
            ", createTime=" + createTime +
            ", userStatus=" + userStatus +
            ", userGender=" + userGender +
            ", userIntro=" + userIntro +
            ", userBirthday=" + userBirthday +
            ", userHeadImage=" + userHeadImage +
            ", userBackgroundImage=" + userBackgroundImage +
            ", jobId=" + jobId +
            ", userErweima=" + userErweima +
        "}";
    }
}
