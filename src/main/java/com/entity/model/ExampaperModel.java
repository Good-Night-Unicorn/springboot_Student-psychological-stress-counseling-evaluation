package com.entity.model;

import com.entity.ExampaperEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 心理测评表
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ExampaperModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 心理测评名称
     */
    private String exampaperName;


    /**
     * 心理测评时长(分钟)
     */
    private Integer exampaperDate;


    /**
     * 心理测评总分数
     */
    private Integer exampaperMyscore;


    /**
     * 心理测评状态
     */
    private Integer exampaperTypes;


    /**
     * 组卷方式
     */
    private Integer zujuanTypes;


    /**
     * 逻辑删除（1代表未删除 2代表已删除）
     */
    private Integer exampaperDelete;


    /**
     * 创建时间 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：心理测评名称
	 */
    public String getExampaperName() {
        return exampaperName;
    }


    /**
	 * 设置：心理测评名称
	 */
    public void setExampaperName(String exampaperName) {
        this.exampaperName = exampaperName;
    }
    /**
	 * 获取：心理测评时长(分钟)
	 */
    public Integer getExampaperDate() {
        return exampaperDate;
    }


    /**
	 * 设置：心理测评时长(分钟)
	 */
    public void setExampaperDate(Integer exampaperDate) {
        this.exampaperDate = exampaperDate;
    }
    /**
	 * 获取：心理测评总分数
	 */
    public Integer getExampaperMyscore() {
        return exampaperMyscore;
    }


    /**
	 * 设置：心理测评总分数
	 */
    public void setExampaperMyscore(Integer exampaperMyscore) {
        this.exampaperMyscore = exampaperMyscore;
    }
    /**
	 * 获取：心理测评状态
	 */
    public Integer getExampaperTypes() {
        return exampaperTypes;
    }


    /**
	 * 设置：心理测评状态
	 */
    public void setExampaperTypes(Integer exampaperTypes) {
        this.exampaperTypes = exampaperTypes;
    }
    /**
	 * 获取：组卷方式
	 */
    public Integer getZujuanTypes() {
        return zujuanTypes;
    }


    /**
	 * 设置：组卷方式
	 */
    public void setZujuanTypes(Integer zujuanTypes) {
        this.zujuanTypes = zujuanTypes;
    }
    /**
	 * 获取：逻辑删除（1代表未删除 2代表已删除）
	 */
    public Integer getExampaperDelete() {
        return exampaperDelete;
    }


    /**
	 * 设置：逻辑删除（1代表未删除 2代表已删除）
	 */
    public void setExampaperDelete(Integer exampaperDelete) {
        this.exampaperDelete = exampaperDelete;
    }
    /**
	 * 获取：创建时间 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
