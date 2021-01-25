package com.online.taxi.entity;

import java.util.Date;

public class TagInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_tag_info.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_tag_info.tag_name
     *
     * @mbggenerated
     */
    private String tagName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_tag_info.tag_img
     *
     * @mbggenerated
     */
    private String tagImg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_tag_info.status
     *
     * @mbggenerated
     */
    private Boolean status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_tag_info.operator_id
     *
     * @mbggenerated
     */
    private Integer operatorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_tag_info.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_tag_info.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_tag_info.id
     *
     * @return the value of tbl_tag_info.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_tag_info.id
     *
     * @param id the value for tbl_tag_info.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_tag_info.tag_name
     *
     * @return the value of tbl_tag_info.tag_name
     *
     * @mbggenerated
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_tag_info.tag_name
     *
     * @param tagName the value for tbl_tag_info.tag_name
     *
     * @mbggenerated
     */
    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_tag_info.tag_img
     *
     * @return the value of tbl_tag_info.tag_img
     *
     * @mbggenerated
     */
    public String getTagImg() {
        return tagImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_tag_info.tag_img
     *
     * @param tagImg the value for tbl_tag_info.tag_img
     *
     * @mbggenerated
     */
    public void setTagImg(String tagImg) {
        this.tagImg = tagImg == null ? null : tagImg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_tag_info.status
     *
     * @return the value of tbl_tag_info.status
     *
     * @mbggenerated
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_tag_info.status
     *
     * @param status the value for tbl_tag_info.status
     *
     * @mbggenerated
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_tag_info.operator_id
     *
     * @return the value of tbl_tag_info.operator_id
     *
     * @mbggenerated
     */
    public Integer getOperatorId() {
        return operatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_tag_info.operator_id
     *
     * @param operatorId the value for tbl_tag_info.operator_id
     *
     * @mbggenerated
     */
    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_tag_info.create_time
     *
     * @return the value of tbl_tag_info.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_tag_info.create_time
     *
     * @param createTime the value for tbl_tag_info.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_tag_info.update_time
     *
     * @return the value of tbl_tag_info.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_tag_info.update_time
     *
     * @param updateTime the value for tbl_tag_info.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}