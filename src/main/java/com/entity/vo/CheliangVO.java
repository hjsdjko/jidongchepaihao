package com.entity.vo;

import com.entity.CheliangEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 车辆信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("cheliang")
public class CheliangVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间 show1 show2 photoShow
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
