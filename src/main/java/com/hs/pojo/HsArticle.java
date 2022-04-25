package com.hs.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 文章内容表
 * </p>
 *
 * @author zfh
 * @since 2022-04-24
 */
@TableName("hs_article")
@ApiModel(value = "HsArticle对象", description = "文章内容表")
public class HsArticle implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("文章id")
    @TableId(value = "article_id", type = IdType.AUTO)
    private Integer articleId;

    @ApiModelProperty("文章类型ID")
    private Integer helpTypeId;

    @ApiModelProperty("文字内容;存储HTML内容")
    private String articleText;

    @ApiModelProperty("创建人ID（管理员ID）")
    private Integer adminId;

    @ApiModelProperty("创建时间")
    private String articleDateTime;

    @ApiModelProperty("发布时间")
    private String articlePublishTime;

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }
    public Integer getHelpTypeId() {
        return helpTypeId;
    }

    public void setHelpTypeId(Integer helpTypeId) {
        this.helpTypeId = helpTypeId;
    }
    public String getArticleText() {
        return articleText;
    }

    public void setArticleText(String articleText) {
        this.articleText = articleText;
    }
    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }
    public String getArticleDateTime() {
        return articleDateTime;
    }

    public void setArticleDateTime(String articleDateTime) {
        this.articleDateTime = articleDateTime;
    }
    public String getArticlePublishTime() {
        return articlePublishTime;
    }

    public void setArticlePublishTime(String articlePublishTime) {
        this.articlePublishTime = articlePublishTime;
    }

    @Override
    public String toString() {
        return "HsArticle{" +
            "articleId=" + articleId +
            ", helpTypeId=" + helpTypeId +
            ", articleText=" + articleText +
            ", adminId=" + adminId +
            ", articleDateTime=" + articleDateTime +
            ", articlePublishTime=" + articlePublishTime +
        "}";
    }
}
