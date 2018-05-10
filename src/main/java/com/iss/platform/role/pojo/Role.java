package com.iss.platform.role.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Table(name = "t_p_role")
public class Role {
    /**
     * 主键id
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 父级角色ID
     */
    @Column(name = "p_id")
    private String pId;

    /**
     * 有效状态 1 有效，0 无效
     */
    private Integer status;

    /**
     * 角色描述
     */
    private String remark;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 删除时间
     */
    @Column(name = "delete_time")
    private Date deleteTime;

    /**
     * 获取主键id
     *
     * @return id - 主键id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取角色名称
     *
     * @return name - 角色名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置角色名称
     *
     * @param name 角色名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取父级角色ID
     *
     * @return p_id - 父级角色ID
     */
    public String getpId() {
        return pId;
    }

    /**
     * 设置父级角色ID
     *
     * @param pId 父级角色ID
     */
    public void setpId(String pId) {
        this.pId = pId;
    }

    /**
     * 获取有效状态 1 有效，0 无效
     *
     * @return status - 有效状态 1 有效，0 无效
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置有效状态 1 有效，0 无效
     *
     * @param status 有效状态 1 有效，0 无效
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取角色描述
     *
     * @return remark - 角色描述
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置角色描述
     *
     * @param remark 角色描述
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取删除时间
     *
     * @return delete_time - 删除时间
     */
    public Date getDeleteTime() {
        return deleteTime;
    }

    /**
     * 设置删除时间
     *
     * @param deleteTime 删除时间
     */
    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }
}