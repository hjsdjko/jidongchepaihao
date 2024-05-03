package com.entity.view;

import com.entity.PaizhaohuanbuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 牌照换补申请
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("paizhaohuanbu")
public class PaizhaohuanbuView extends PaizhaohuanbuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 申请类型的值
		*/
		private String paizhaohuanbuValue;
		/**
		* 申请状态的值
		*/
		private String paizhaohuanbuYesnoValue;



		//级联表 cheliang
			/**
			* 车辆名称
			*/
			private String cheliangName;
			/**
			* 车辆类型
			*/
			private Integer cheliangTypes;
				/**
				* 车辆类型的值
				*/
				private String cheliangValue;
			/**
			* 车辆牌照
			*/
			private String cheliangPaizhao;
			/**
			* 牌照类型
			*/
			private Integer paizhaoTypes;
				/**
				* 牌照类型的值
				*/
				private String paizhaoValue;
			/**
			* 车辆信息 的 用户
			*/
			private Integer cheliangYonghuId;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public PaizhaohuanbuView() {

	}

	public PaizhaohuanbuView(PaizhaohuanbuEntity paizhaohuanbuEntity) {
		try {
			BeanUtils.copyProperties(this, paizhaohuanbuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 申请类型的值
			*/
			public String getPaizhaohuanbuValue() {
				return paizhaohuanbuValue;
			}
			/**
			* 设置： 申请类型的值
			*/
			public void setPaizhaohuanbuValue(String paizhaohuanbuValue) {
				this.paizhaohuanbuValue = paizhaohuanbuValue;
			}
			/**
			* 获取： 申请状态的值
			*/
			public String getPaizhaohuanbuYesnoValue() {
				return paizhaohuanbuYesnoValue;
			}
			/**
			* 设置： 申请状态的值
			*/
			public void setPaizhaohuanbuYesnoValue(String paizhaohuanbuYesnoValue) {
				this.paizhaohuanbuYesnoValue = paizhaohuanbuYesnoValue;
			}




				//级联表的get和set cheliang

					/**
					* 获取： 车辆名称
					*/
					public String getCheliangName() {
						return cheliangName;
					}
					/**
					* 设置： 车辆名称
					*/
					public void setCheliangName(String cheliangName) {
						this.cheliangName = cheliangName;
					}

					/**
					* 获取： 车辆类型
					*/
					public Integer getCheliangTypes() {
						return cheliangTypes;
					}
					/**
					* 设置： 车辆类型
					*/
					public void setCheliangTypes(Integer cheliangTypes) {
						this.cheliangTypes = cheliangTypes;
					}


						/**
						* 获取： 车辆类型的值
						*/
						public String getCheliangValue() {
							return cheliangValue;
						}
						/**
						* 设置： 车辆类型的值
						*/
						public void setCheliangValue(String cheliangValue) {
							this.cheliangValue = cheliangValue;
						}

					/**
					* 获取： 车辆牌照
					*/
					public String getCheliangPaizhao() {
						return cheliangPaizhao;
					}
					/**
					* 设置： 车辆牌照
					*/
					public void setCheliangPaizhao(String cheliangPaizhao) {
						this.cheliangPaizhao = cheliangPaizhao;
					}

					/**
					* 获取： 牌照类型
					*/
					public Integer getPaizhaoTypes() {
						return paizhaoTypes;
					}
					/**
					* 设置： 牌照类型
					*/
					public void setPaizhaoTypes(Integer paizhaoTypes) {
						this.paizhaoTypes = paizhaoTypes;
					}


						/**
						* 获取： 牌照类型的值
						*/
						public String getPaizhaoValue() {
							return paizhaoValue;
						}
						/**
						* 设置： 牌照类型的值
						*/
						public void setPaizhaoValue(String paizhaoValue) {
							this.paizhaoValue = paizhaoValue;
						}

					/**
					* 获取：车辆信息 的 用户
					*/
					public Integer getCheliangYonghuId() {
						return cheliangYonghuId;
					}
					/**
					* 设置：车辆信息 的 用户
					*/
					public void setCheliangYonghuId(Integer cheliangYonghuId) {
						this.cheliangYonghuId = cheliangYonghuId;
					}




















				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
