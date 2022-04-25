package com.hs.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 地区表
 * </p>
 *
 * @author zfh
 * @since 2022-04-24
 */
@TableName("hs_addr")
@ApiModel(value = "HsAddr对象", description = "地区表")
public class HsAddr implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("地区id")
    @TableId(value = "addr_id", type = IdType.AUTO)
    private Integer addrId;

    @ApiModelProperty("地区编码")
    private String addrCode;

    @ApiModelProperty("地区名称")
    private String addrName;

    @ApiModelProperty("父级地区id")
    private Integer addrParentId;

    public Integer getAddrId() {
        return addrId;
    }

    public void setAddrId(Integer addrId) {
        this.addrId = addrId;
    }
    public String getAddrCode() {
        return addrCode;
    }

    public void setAddrCode(String addrCode) {
        this.addrCode = addrCode;
    }
    public String getAddrName() {
        return addrName;
    }

    public void setAddrName(String addrName) {
        this.addrName = addrName;
    }
    public Integer getAddrParentId() {
        return addrParentId;
    }

    public void setAddrParentId(Integer addrParentId) {
        this.addrParentId = addrParentId;
    }

    @Override
    public String toString() {
        return "HsAddr{" +
            "addrId=" + addrId +
            ", addrCode=" + addrCode +
            ", addrName=" + addrName +
            ", addrParentId=" + addrParentId +
        "}";
    }
}
