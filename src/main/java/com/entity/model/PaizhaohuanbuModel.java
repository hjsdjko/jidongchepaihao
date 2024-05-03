package com.entity.model;

import com.entity.PaizhaohuanbuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 牌照换补申请
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class PaizhaohuanbuModel implements Serializable {
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
     * 申请类型
     */
    private Integer paizhaohuanbuTypes;


    /**
     * 牌照
     */
    private String paizhaohuanbuPaizhao;


    /**
     * 申请状态
     */
    private Integer paizhaohuanbuYesnoTypes;


    /**
     * 申请结果
     */
    private String paizhaohuanbuYesnoText;


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
	 * 获取：申请类型
	 */
    public Integer getPaizhaohuanbuTypes() {
        return paizhaohuanbuTypes;
    }


    /**
	 * 设置：申请类型
	 */
    public void setPaizhaohuanbuTypes(Integer paizhaohuanbuTypes) {
        this.paizhaohuanbuTypes = paizhaohuanbuTypes;
    }
    /**
	 * 获取：牌照
	 */
    public String getPaizhaohuanbuPaizhao() {
        return paizhaohuanbuPaizhao;
    }


    /**
	 * 设置：牌照
	 */
    public void setPaizhaohuanbuPaizhao(String paizhaohuanbuPaizhao) {
        this.paizhaohuanbuPaizhao = paizhaohuanbuPaizhao;
    }
    /**
	 * 获取：申请状态
	 */
    public Integer getPaizhaohuanbuYesnoTypes() {
        return paizhaohuanbuYesnoTypes;
    }


    /**
	 * 设置：申请状态
	 */
    public void setPaizhaohuanbuYesnoTypes(Integer paizhaohuanbuYesnoTypes) {
        this.paizhaohuanbuYesnoTypes = paizhaohuanbuYesnoTypes;
    }
    /**
	 * 获取：申请结果
	 */
    public String getPaizhaohuanbuYesnoText() {
        return paizhaohuanbuYesnoText;
    }


    /**
	 * 设置：申请结果
	 */
    public void setPaizhaohuanbuYesnoText(String paizhaohuanbuYesnoText) {
        this.paizhaohuanbuYesnoText = paizhaohuanbuYesnoText;
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
