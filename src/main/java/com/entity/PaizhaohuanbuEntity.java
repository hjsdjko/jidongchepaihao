package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 牌照换补申请
 *
 * @author 
 * @email
 */
@TableName("paizhaohuanbu")
public class PaizhaohuanbuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public PaizhaohuanbuEntity() {

	}

	public PaizhaohuanbuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 车辆
     */
    @TableField(value = "cheliang_id")

    private Integer cheliangId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 申请类型
     */
    @TableField(value = "paizhaohuanbu_types")

    private Integer paizhaohuanbuTypes;


    /**
     * 牌照
     */
    @TableField(value = "paizhaohuanbu_paizhao")

    private String paizhaohuanbuPaizhao;


    /**
     * 申请状态
     */
    @TableField(value = "paizhaohuanbu_yesno_types")

    private Integer paizhaohuanbuYesnoTypes;


    /**
     * 申请结果
     */
    @TableField(value = "paizhaohuanbu_yesno_text")

    private String paizhaohuanbuYesnoText;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：车辆
	 */
    public Integer getCheliangId() {
        return cheliangId;
    }
    /**
	 * 获取：车辆
	 */

    public void setCheliangId(Integer cheliangId) {
        this.cheliangId = cheliangId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：申请类型
	 */
    public Integer getPaizhaohuanbuTypes() {
        return paizhaohuanbuTypes;
    }
    /**
	 * 获取：申请类型
	 */

    public void setPaizhaohuanbuTypes(Integer paizhaohuanbuTypes) {
        this.paizhaohuanbuTypes = paizhaohuanbuTypes;
    }
    /**
	 * 设置：牌照
	 */
    public String getPaizhaohuanbuPaizhao() {
        return paizhaohuanbuPaizhao;
    }
    /**
	 * 获取：牌照
	 */

    public void setPaizhaohuanbuPaizhao(String paizhaohuanbuPaizhao) {
        this.paizhaohuanbuPaizhao = paizhaohuanbuPaizhao;
    }
    /**
	 * 设置：申请状态
	 */
    public Integer getPaizhaohuanbuYesnoTypes() {
        return paizhaohuanbuYesnoTypes;
    }
    /**
	 * 获取：申请状态
	 */

    public void setPaizhaohuanbuYesnoTypes(Integer paizhaohuanbuYesnoTypes) {
        this.paizhaohuanbuYesnoTypes = paizhaohuanbuYesnoTypes;
    }
    /**
	 * 设置：申请结果
	 */
    public String getPaizhaohuanbuYesnoText() {
        return paizhaohuanbuYesnoText;
    }
    /**
	 * 获取：申请结果
	 */

    public void setPaizhaohuanbuYesnoText(String paizhaohuanbuYesnoText) {
        this.paizhaohuanbuYesnoText = paizhaohuanbuYesnoText;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Paizhaohuanbu{" +
            "id=" + id +
            ", cheliangId=" + cheliangId +
            ", yonghuId=" + yonghuId +
            ", paizhaohuanbuTypes=" + paizhaohuanbuTypes +
            ", paizhaohuanbuPaizhao=" + paizhaohuanbuPaizhao +
            ", paizhaohuanbuYesnoTypes=" + paizhaohuanbuYesnoTypes +
            ", paizhaohuanbuYesnoText=" + paizhaohuanbuYesnoText +
            ", createTime=" + createTime +
        "}";
    }
}
