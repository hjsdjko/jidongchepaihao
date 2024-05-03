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
 * 牌照申请
 *
 * @author 
 * @email
 */
@TableName("paizhaoshenqing")
public class PaizhaoshenqingEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public PaizhaoshenqingEntity() {

	}

	public PaizhaoshenqingEntity(T t) {
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
     * 申请牌照类型
     */
    @TableField(value = "paizhaoshenqing_types")

    private Integer paizhaoshenqingTypes;


    /**
     * 申请牌照
     */
    @TableField(value = "paizhaoshenqing_paizhao")

    private String paizhaoshenqingPaizhao;


    /**
     * 申请状态
     */
    @TableField(value = "paizhaoshenqing_yesno_types")

    private Integer paizhaoshenqingYesnoTypes;


    /**
     * 申请结果
     */
    @TableField(value = "paizhaoshenqing_yesno_text")

    private String paizhaoshenqingYesnoText;


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
	 * 设置：申请牌照类型
	 */
    public Integer getPaizhaoshenqingTypes() {
        return paizhaoshenqingTypes;
    }
    /**
	 * 获取：申请牌照类型
	 */

    public void setPaizhaoshenqingTypes(Integer paizhaoshenqingTypes) {
        this.paizhaoshenqingTypes = paizhaoshenqingTypes;
    }
    /**
	 * 设置：申请牌照
	 */
    public String getPaizhaoshenqingPaizhao() {
        return paizhaoshenqingPaizhao;
    }
    /**
	 * 获取：申请牌照
	 */

    public void setPaizhaoshenqingPaizhao(String paizhaoshenqingPaizhao) {
        this.paizhaoshenqingPaizhao = paizhaoshenqingPaizhao;
    }
    /**
	 * 设置：申请状态
	 */
    public Integer getPaizhaoshenqingYesnoTypes() {
        return paizhaoshenqingYesnoTypes;
    }
    /**
	 * 获取：申请状态
	 */

    public void setPaizhaoshenqingYesnoTypes(Integer paizhaoshenqingYesnoTypes) {
        this.paizhaoshenqingYesnoTypes = paizhaoshenqingYesnoTypes;
    }
    /**
	 * 设置：申请结果
	 */
    public String getPaizhaoshenqingYesnoText() {
        return paizhaoshenqingYesnoText;
    }
    /**
	 * 获取：申请结果
	 */

    public void setPaizhaoshenqingYesnoText(String paizhaoshenqingYesnoText) {
        this.paizhaoshenqingYesnoText = paizhaoshenqingYesnoText;
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
        return "Paizhaoshenqing{" +
            "id=" + id +
            ", cheliangId=" + cheliangId +
            ", yonghuId=" + yonghuId +
            ", paizhaoshenqingTypes=" + paizhaoshenqingTypes +
            ", paizhaoshenqingPaizhao=" + paizhaoshenqingPaizhao +
            ", paizhaoshenqingYesnoTypes=" + paizhaoshenqingYesnoTypes +
            ", paizhaoshenqingYesnoText=" + paizhaoshenqingYesnoText +
            ", createTime=" + createTime +
        "}";
    }
}
