package com.mall.vo.branch;

import java.math.BigDecimal;
import java.util.Date;

public class CaoTaxRateDo {
    /** */
    private Long taxRateId;

    /** 考核周期*/
    private String assessCycle;

    /** 主体id*/
    private Long subjectId;

    /** 商品id*/
    private Long goodsId;

    /** 税率值*/
    private BigDecimal taxRate;

    /** 创建人*/
    private String createUser;

    /** 创建时间*/
    private Date createTime;

    /** 更新人*/
    private String updateUser;

    /** 更新时间*/
    private Date updateTime;

    public Long getTaxRateId() {
        return taxRateId;
    }

    public void setTaxRateId(Long taxRateId) {
        this.taxRateId = taxRateId;
    }

    public String getAssessCycle() {
        return assessCycle;
    }

    public void setAssessCycle(String assessCycle) {
        this.assessCycle = assessCycle == null ? null : assessCycle.trim();
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}