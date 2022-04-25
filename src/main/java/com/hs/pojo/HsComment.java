package com.hs.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 作品评论表
 * </p>
 *
 * @author zfh
 * @since 2022-04-24
 */
@TableName("hs_comment")
@ApiModel(value = "HsComment对象", description = "作品评论表")
public class HsComment implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("评论id")
    @TableId(value = "comm_id", type = IdType.AUTO)
    private Integer commId;

    @ApiModelProperty("作品id")
    private Integer artId;

    @ApiModelProperty("用户id")
    private Integer userId;

    @ApiModelProperty("评论信息")
    private String commMsg;

    @ApiModelProperty("评论点赞数：默认0")
    private Integer commLikeNum;

    @ApiModelProperty("评论父级id")
    private Integer commParentId;

    @ApiModelProperty("评论状态：0正常1违规（默认0）")
    private Integer commStatus;

    public Integer getCommId() {
        return commId;
    }

    public void setCommId(Integer commId) {
        this.commId = commId;
    }
    public Integer getArtId() {
        return artId;
    }

    public void setArtId(Integer artId) {
        this.artId = artId;
    }
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getCommMsg() {
        return commMsg;
    }

    public void setCommMsg(String commMsg) {
        this.commMsg = commMsg;
    }
    public Integer getCommLikeNum() {
        return commLikeNum;
    }

    public void setCommLikeNum(Integer commLikeNum) {
        this.commLikeNum = commLikeNum;
    }
    public Integer getCommParentId() {
        return commParentId;
    }

    public void setCommParentId(Integer commParentId) {
        this.commParentId = commParentId;
    }
    public Integer getCommStatus() {
        return commStatus;
    }

    public void setCommStatus(Integer commStatus) {
        this.commStatus = commStatus;
    }

    @Override
    public String toString() {
        return "HsComment{" +
            "commId=" + commId +
            ", artId=" + artId +
            ", userId=" + userId +
            ", commMsg=" + commMsg +
            ", commLikeNum=" + commLikeNum +
            ", commParentId=" + commParentId +
            ", commStatus=" + commStatus +
        "}";
    }
}
