package com.entity.view;

import com.entity.QicheOrderEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 汽车订单
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("qiche_order")
public class QicheOrderView extends QicheOrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 订单类型的值
		*/
		private String qicheOrderValue;
		/**
		* 支付类型的值
		*/
		private String qicheOrderPaymentValue;



		//级联表 address
			/**
			* 收货地址 的 创建用户
			*/
			private Integer addressYonghuId;
			/**
			* 收货人
			*/
			private String addressName;
			/**
			* 电话
			*/
			private String addressPhone;
			/**
			* 地址
			*/
			private String addressDizhi;
			/**
			* 是否默认地址
			*/
			private Integer isdefaultTypes;
				/**
				* 是否默认地址的值
				*/
				private String isdefaultValue;

		//级联表 qiche
			/**
			* 汽车名称
			*/
			private String qicheName;
			/**
			* 汽车照片
			*/
			private String qichePhoto;
			/**
			* 汽车类型
			*/
			private Integer qicheTypes;
				/**
				* 汽车类型的值
				*/
				private String qicheValue;
			/**
			* 汽车库存
			*/
			private Integer qicheKucunNumber;
			/**
			* 汽车原价
			*/
			private Double qicheOldMoney;
			/**
			* 现价
			*/
			private Double qicheNewMoney;
			/**
			* 点击次数
			*/
			private Integer qicheClicknum;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer qicheDelete;
			/**
			* 汽车简介
			*/
			private String qicheContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 余额
			*/
			private Double newMoney;

	public QicheOrderView() {

	}

	public QicheOrderView(QicheOrderEntity qicheOrderEntity) {
		try {
			BeanUtils.copyProperties(this, qicheOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 订单类型的值
			*/
			public String getQicheOrderValue() {
				return qicheOrderValue;
			}
			/**
			* 设置： 订单类型的值
			*/
			public void setQicheOrderValue(String qicheOrderValue) {
				this.qicheOrderValue = qicheOrderValue;
			}
			/**
			* 获取： 支付类型的值
			*/
			public String getQicheOrderPaymentValue() {
				return qicheOrderPaymentValue;
			}
			/**
			* 设置： 支付类型的值
			*/
			public void setQicheOrderPaymentValue(String qicheOrderPaymentValue) {
				this.qicheOrderPaymentValue = qicheOrderPaymentValue;
			}




				//级联表的get和set address

					/**
					* 获取：收货地址 的 创建用户
					*/
					public Integer getAddressYonghuId() {
						return addressYonghuId;
					}
					/**
					* 设置：收货地址 的 创建用户
					*/
					public void setAddressYonghuId(Integer addressYonghuId) {
						this.addressYonghuId = addressYonghuId;
					}


					/**
					* 获取： 收货人
					*/
					public String getAddressName() {
						return addressName;
					}
					/**
					* 设置： 收货人
					*/
					public void setAddressName(String addressName) {
						this.addressName = addressName;
					}

					/**
					* 获取： 电话
					*/
					public String getAddressPhone() {
						return addressPhone;
					}
					/**
					* 设置： 电话
					*/
					public void setAddressPhone(String addressPhone) {
						this.addressPhone = addressPhone;
					}

					/**
					* 获取： 地址
					*/
					public String getAddressDizhi() {
						return addressDizhi;
					}
					/**
					* 设置： 地址
					*/
					public void setAddressDizhi(String addressDizhi) {
						this.addressDizhi = addressDizhi;
					}

					/**
					* 获取： 是否默认地址
					*/
					public Integer getIsdefaultTypes() {
						return isdefaultTypes;
					}
					/**
					* 设置： 是否默认地址
					*/
					public void setIsdefaultTypes(Integer isdefaultTypes) {
						this.isdefaultTypes = isdefaultTypes;
					}


						/**
						* 获取： 是否默认地址的值
						*/
						public String getIsdefaultValue() {
							return isdefaultValue;
						}
						/**
						* 设置： 是否默认地址的值
						*/
						public void setIsdefaultValue(String isdefaultValue) {
							this.isdefaultValue = isdefaultValue;
						}





















				//级联表的get和set qiche

					/**
					* 获取： 汽车名称
					*/
					public String getQicheName() {
						return qicheName;
					}
					/**
					* 设置： 汽车名称
					*/
					public void setQicheName(String qicheName) {
						this.qicheName = qicheName;
					}

					/**
					* 获取： 汽车照片
					*/
					public String getQichePhoto() {
						return qichePhoto;
					}
					/**
					* 设置： 汽车照片
					*/
					public void setQichePhoto(String qichePhoto) {
						this.qichePhoto = qichePhoto;
					}

					/**
					* 获取： 汽车类型
					*/
					public Integer getQicheTypes() {
						return qicheTypes;
					}
					/**
					* 设置： 汽车类型
					*/
					public void setQicheTypes(Integer qicheTypes) {
						this.qicheTypes = qicheTypes;
					}


						/**
						* 获取： 汽车类型的值
						*/
						public String getQicheValue() {
							return qicheValue;
						}
						/**
						* 设置： 汽车类型的值
						*/
						public void setQicheValue(String qicheValue) {
							this.qicheValue = qicheValue;
						}

					/**
					* 获取： 汽车库存
					*/
					public Integer getQicheKucunNumber() {
						return qicheKucunNumber;
					}
					/**
					* 设置： 汽车库存
					*/
					public void setQicheKucunNumber(Integer qicheKucunNumber) {
						this.qicheKucunNumber = qicheKucunNumber;
					}

					/**
					* 获取： 汽车原价
					*/
					public Double getQicheOldMoney() {
						return qicheOldMoney;
					}
					/**
					* 设置： 汽车原价
					*/
					public void setQicheOldMoney(Double qicheOldMoney) {
						this.qicheOldMoney = qicheOldMoney;
					}

					/**
					* 获取： 现价
					*/
					public Double getQicheNewMoney() {
						return qicheNewMoney;
					}
					/**
					* 设置： 现价
					*/
					public void setQicheNewMoney(Double qicheNewMoney) {
						this.qicheNewMoney = qicheNewMoney;
					}

					/**
					* 获取： 点击次数
					*/
					public Integer getQicheClicknum() {
						return qicheClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setQicheClicknum(Integer qicheClicknum) {
						this.qicheClicknum = qicheClicknum;
					}

					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
					}


						/**
						* 获取： 是否上架的值
						*/
						public String getShangxiaValue() {
							return shangxiaValue;
						}
						/**
						* 设置： 是否上架的值
						*/
						public void setShangxiaValue(String shangxiaValue) {
							this.shangxiaValue = shangxiaValue;
						}

					/**
					* 获取： 逻辑删除
					*/
					public Integer getQicheDelete() {
						return qicheDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setQicheDelete(Integer qicheDelete) {
						this.qicheDelete = qicheDelete;
					}

					/**
					* 获取： 汽车简介
					*/
					public String getQicheContent() {
						return qicheContent;
					}
					/**
					* 设置： 汽车简介
					*/
					public void setQicheContent(String qicheContent) {
						this.qicheContent = qicheContent;
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
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
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
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}




}
