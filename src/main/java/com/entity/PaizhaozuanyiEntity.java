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
 * 牌照转移申请
 *
 * @author 
 * @email
 */
@TableName("paizhaozuanyi")
public class PaizhaozuanyiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public PaizhaozuanyiEntity() {

	}

	public PaizhaozuanyiEntity(T t) {
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
     * 转移用户名称
     */
    @TableField(value = "paizhaozuanyi_name")

    private String paizhaozuanyiName;


    /**
     * 牌照
     */
    @TableField(value = "paizhaozuanyi_paizhao")

    private String paizhaozuanyiPaizhao;


    /**
     * 申请状态
     */
    @TableField(value = "paizhaozuanyi_yesno_types")

    private Integer paizhaozuanyiYesnoTypes;


    /**
     * 申请结果
     */
    @TableField(value = "paizhaozuanyi_yesno_text")

    private String paizhaozuanyiYesnoText;


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
	 * 设置：转移用户名称
	 */
    public String getPaizhaozuanyiName() {
        return paizhaozuanyiName;
    }
    /**
	 * 获取：转移用户名称
	 */

    public void setPaizhaozuanyiName(String paizhaozuanyiName) {
        this.paizhaozuanyiName = paizhaozuanyiName;
    }
    /**
	 * 设置：牌照
	 */
    public String getPaizhaozuanyiPaizhao() {
        return paizhaozuanyiPaizhao;
    }
    /**
	 * 获取：牌照
	 */

    public void setPaizhaozuanyiPaizhao(String paizhaozuanyiPaizhao) {
        this.paizhaozuanyiPaizhao = paizhaozuanyiPaizhao;
    }
    /**
	 * 设置：申请状态
	 */
    public Integer getPaizhaozuanyiYesnoTypes() {
        return paizhaozuanyiYesnoTypes;
    }
    /**
	 * 获取：申请状态
	 */

    public void setPaizhaozuanyiYesnoTypes(Integer paizhaozuanyiYesnoTypes) {
        this.paizhaozuanyiYesnoTypes = paizhaozuanyiYesnoTypes;
    }
    /**
	 * 设置：申请结果
	 */
    public String getPaizhaozuanyiYesnoText() {
        return paizhaozuanyiYesnoText;
    }
    /**
	 * 获取：申请结果
	 */

    public void setPaizhaozuanyiYesnoText(String paizhaozuanyiYesnoText) {
        this.paizhaozuanyiYesnoText = paizhaozuanyiYesnoText;
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
        return "Paizhaozuanyi{" +
            "id=" + id +
            ", cheliangId=" + cheliangId +
            ", yonghuId=" + yonghuId +
            ", paizhaozuanyiName=" + paizhaozuanyiName +
            ", paizhaozuanyiPaizhao=" + paizhaozuanyiPaizhao +
            ", paizhaozuanyiYesnoTypes=" + paizhaozuanyiYesnoTypes +
            ", paizhaozuanyiYesnoText=" + paizhaozuanyiYesnoText +
            ", createTime=" + createTime +
        "}";
    }
}
