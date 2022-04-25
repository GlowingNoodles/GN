package com.hs.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 店铺信息表
 * </p>
 *
 * @author zfh
 * @since 2022-04-24
 */
@TableName("hs_shop")
@ApiModel(value = "HsShop对象", description = "店铺信息表")
public class HsShop implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("店铺id")
    @TableId(value = "shop_id", type = IdType.AUTO)
    private Integer shopId;

    @ApiModelProperty("店铺名称")
    private String shopName;

    @ApiModelProperty("店铺类型：1、个人，2、企业（默认1，只做个人）")
    private Integer shopType;

    @ApiModelProperty(" 注册人真实姓名 ")
    private String registrantName;

    @ApiModelProperty("注册人身份证号")
    private String registrantIdCard;

    @ApiModelProperty(" 注册人手机号 ")
    private String registrantPhoneNum;

    @ApiModelProperty(" 注册时间 ")
    private String shopCreatTime;

    @ApiModelProperty(" 所属用户ID ")
    private Integer userId;

    @ApiModelProperty(" 状态（0待审核  1已通过 2未通过）默认：0 ")
    private Integer shopState;

    @ApiModelProperty("店铺头像 ")
    private String shopHeadImg;

    @ApiModelProperty("营业执照图")
    private String shopLicenceImg;

    @ApiModelProperty(" 信用代码 ")
    private String shopCredtNum;

    @ApiModelProperty(" 所在地区ID ")
    private Integer addrId;

    @ApiModelProperty("店铺信誉")
    private Integer shopCredt;

    @ApiModelProperty(" 审核人id：管理员id")
    private Integer adminId;

    @ApiModelProperty(" 审核时间 ")
    private String shopAuditTime;

    @ApiModelProperty(" 审核意见 ")
    private String shopAuditIdea;

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Integer getShopType() {
        return shopType;
    }

    public void setShopType(Integer shopType) {
        this.shopType = shopType;
    }

    public String getRegistrantName() {
        return registrantName;
    }

    public void setRegistrantName(String registrantName) {
        this.registrantName = registrantName;
    }

    public String getRegistrantIdCard() {
        return registrantIdCard;
    }

    public void setRegistrantIdCard(String registrantIdCard) {
        this.registrantIdCard = registrantIdCard;
    }

    public String getRegistrantPhoneNum() {
        return registrantPhoneNum;
    }

    public void setRegistrantPhoneNum(String registrantPhoneNum) {
        this.registrantPhoneNum = registrantPhoneNum;
    }

    public String getShopCreatTime() {
        return shopCreatTime;
    }

    public void setShopCreatTime(String shopCreatTime) {
        this.shopCreatTime = shopCreatTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getShopState() {
        return shopState;
    }

    public void setShopState(Integer shopState) {
        this.shopState = shopState;
    }

    public String getShopHeadImg() {
        return shopHeadImg;
    }

    public void setShopHeadImg(String shopHeadImg) {
        this.shopHeadImg = shopHeadImg;
    }

    public String getShopLicenceImg() {
        return shopLicenceImg;
    }

    public void setShopLicenceImg(String shopLicenceImg) {
        this.shopLicenceImg = shopLicenceImg;
    }

    public String getShopCredtNum() {
        return shopCredtNum;
    }

    public void setShopCredtNum(String shopCredtNum) {
        this.shopCredtNum = shopCredtNum;
    }

    public Integer getAddrId() {
        return addrId;
    }

    public void setAddrId(Integer addrId) {
        this.addrId = addrId;
    }

    public Integer getShopCredt() {
        return shopCredt;
    }

    public void setShopCredt(Integer shopCredt) {
        this.shopCredt = shopCredt;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getShopAuditTime() {
        return shopAuditTime;
    }

    public void setShopAuditTime(String shopAuditTime) {
        this.shopAuditTime = shopAuditTime;
    }

    public String getShopAuditIdea() {
        return shopAuditIdea;
    }

    public void setShopAuditIdea(String shopAuditIdea) {
        this.shopAuditIdea = shopAuditIdea;
    }

    @Override
    public String toString() {
        return "HsShop{" +
                "shopId=" + shopId +
                ", shopName=" + shopName +
                ", shopType=" + shopType +
                ", registrantName=" + registrantName +
                ", registrantIdCard=" + registrantIdCard +
                ", registrantPhoneNum=" + registrantPhoneNum +
                ", shopCreatTime=" + shopCreatTime +
                ", userId=" + userId +
                ", shopState=" + shopState +
                ", shopHeadImg=" + shopHeadImg +
                ", shopLicenceImg=" + shopLicenceImg +
                ", shopCredtNum=" + shopCredtNum +
                ", addrId=" + addrId +
                ", shopCredt=" + shopCredt +
                ", adminId=" + adminId +
                ", shopAuditTime=" + shopAuditTime +
                ", shopAuditIdea=" + shopAuditIdea +
                "}";
    }
}
