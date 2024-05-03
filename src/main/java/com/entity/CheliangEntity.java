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
 * 车辆信息
 *
 * @author 
 * @email
 */
@TableName("cheliang")
public class CheliangEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public CheliangEntity() {

	}

	public CheliangEntity(T t) {
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
     * 车辆名称
     */
    @TableField(value = "cheliang_name")

    private String cheliangName;


    /**
     * 车辆类型
     */
    @TableField(value = "cheliang_types")

    private Integer cheliangTypes;


    /**
     * 车辆牌照
     */
    @TableField(value = "cheliang_paizhao")

    private String cheliangPaizhao;


    /**
     * 牌照类型
     */
    @TableField(value = "paizhao_types")

    private Integer paizhaoTypes;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


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
	 * 设置：车辆名称
	 */
    public String getCheliangName() {
        return cheliangName;
    }
    /**
	 * 获取：车辆名称
	 */

    public void setCheliangName(String cheliangName) {
        this.cheliangName = cheliangName;
    }
    /**
	 * 设置：车辆类型
	 */
    public Integer getCheliangTypes() {
        return cheliangTypes;
    }
    /**
	 * 获取：车辆类型
	 */

    public void setCheliangTypes(Integer cheliangTypes) {
        this.cheliangTypes = cheliangTypes;
    }
    /**
	 * 设置：车辆牌照
	 */
    public String getCheliangPaizhao() {
        return cheliangPaizhao;
    }
    /**
	 * 获取：车辆牌照
	 */

    public void setCheliangPaizhao(String cheliangPaizhao) {
        this.cheliangPaizhao = cheliangPaizhao;
    }
    /**
	 * 设置：牌照类型
	 */
    public Integer getPaizhaoTypes() {
        return paizhaoTypes;
    }
    /**
	 * 获取：牌照类型
	 */

    public void setPaizhaoTypes(Integer paizhaoTypes) {
        this.paizhaoTypes = paizhaoTypes;
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
        return "Cheliang{" +
            "id=" + id +
            ", cheliangName=" + cheliangName +
            ", cheliangTypes=" + cheliangTypes +
            ", cheliangPaizhao=" + cheliangPaizhao +
            ", paizhaoTypes=" + paizhaoTypes +
            ", yonghuId=" + yonghuId +
            ", createTime=" + createTime +
        "}";
    }
}
