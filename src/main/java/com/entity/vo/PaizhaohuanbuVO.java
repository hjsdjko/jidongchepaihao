package com.entity.vo;

import com.entity.PaizhaohuanbuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 牌照换补申请
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("paizhaohuanbu")
public class PaizhaohuanbuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "create_time")
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

}
