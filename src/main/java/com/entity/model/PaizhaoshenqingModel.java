package com.entity.model;

import com.entity.PaizhaoshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 牌照申请
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class PaizhaoshenqingModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 车辆
     */
    private Integer cheliangId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 申请牌照类型
     */
    private Integer paizhaoshenqingTypes;


    /**
     * 申请牌照
     */
    private String paizhaoshenqingPaizhao;


    /**
     * 申请状态
     */
    private Integer paizhaoshenqingYesnoTypes;


    /**
     * 申请结果
     */
    private String paizhaoshenqingYesnoText;


    /**
     * 创建时间
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
	 * 获取：车辆
	 */
    public Integer getCheliangId() {
        return cheliangId;
    }


    /**
	 * 设置：车辆
	 */
    public void setCheliangId(Integer cheliangId) {
        this.cheliangId = cheliangId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：申请牌照类型
	 */
    public Integer getPaizhaoshenqingTypes() {
        return paizhaoshenqingTypes;
    }


    /**
	 * 设置：申请牌照类型
	 */
    public void setPaizhaoshenqingTypes(Integer paizhaoshenqingTypes) {
        this.paizhaoshenqingTypes = paizhaoshenqingTypes;
    }
    /**
	 * 获取：申请牌照
	 */
    public String getPaizhaoshenqingPaizhao() {
        return paizhaoshenqingPaizhao;
    }


    /**
	 * 设置：申请牌照
	 */
    public void setPaizhaoshenqingPaizhao(String paizhaoshenqingPaizhao) {
        this.paizhaoshenqingPaizhao = paizhaoshenqingPaizhao;
    }
    /**
	 * 获取：申请状态
	 */
    public Integer getPaizhaoshenqingYesnoTypes() {
        return paizhaoshenqingYesnoTypes;
    }


    /**
	 * 设置：申请状态
	 */
    public void setPaizhaoshenqingYesnoTypes(Integer paizhaoshenqingYesnoTypes) {
        this.paizhaoshenqingYesnoTypes = paizhaoshenqingYesnoTypes;
    }
    /**
	 * 获取：申请结果
	 */
    public String getPaizhaoshenqingYesnoText() {
        return paizhaoshenqingYesnoText;
    }


    /**
	 * 设置：申请结果
	 */
    public void setPaizhaoshenqingYesnoText(String paizhaoshenqingYesnoText) {
        this.paizhaoshenqingYesnoText = paizhaoshenqingYesnoText;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
