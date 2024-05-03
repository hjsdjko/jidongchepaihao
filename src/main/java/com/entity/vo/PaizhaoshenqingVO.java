package com.entity.vo;

import com.entity.PaizhaoshenqingEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 牌照申请
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("paizhaoshenqing")
public class PaizhaoshenqingVO implements Serializable {
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

}
