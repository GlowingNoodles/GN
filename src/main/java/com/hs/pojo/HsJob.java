package com.hs.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 职业表
 * </p>
 *
 * @author zfh
 * @since 2022-04-24
 */
@TableName("hs_job")
@ApiModel(value = "HsJob对象", description = "职业表")
public class HsJob implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("职业id")
    @TableId(value = "job_id", type = IdType.AUTO)
    private Integer jobId;

    @ApiModelProperty("职业名称")
    private String jobName;

    @ApiModelProperty("职业父级id")
    private Integer jobParentId;

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
    public Integer getJobParentId() {
        return jobParentId;
    }

    public void setJobParentId(Integer jobParentId) {
        this.jobParentId = jobParentId;
    }

    @Override
    public String toString() {
        return "HsJob{" +
            "jobId=" + jobId +
            ", jobName=" + jobName +
            ", jobParentId=" + jobParentId +
        "}";
    }
}
