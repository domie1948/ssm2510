package com.entity.vo;

import com.entity.YuangongkaoqinjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 员工考勤记录
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-14 16:33:36
 */
public class YuangongkaoqinjiluVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
		
	/**
	 * 部门
	 */
	
	private String bumen;
		
	/**
	 * 职位
	 */
	
	private String zhiwei;
		
	/**
	 * 考勤天数
	 */
	
	private Integer kaoqintianshu;
		
	/**
	 * 缺勤次数
	 */
	
	private Integer queqincishu;
		
	/**
	 * 修改时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date xiugaishijian;
				
	
	/**
	 * 设置：员工姓名
	 */
	 
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
	}
				
	
	/**
	 * 设置：部门
	 */
	 
	public void setBumen(String bumen) {
		this.bumen = bumen;
	}
	
	/**
	 * 获取：部门
	 */
	public String getBumen() {
		return bumen;
	}
				
	
	/**
	 * 设置：职位
	 */
	 
	public void setZhiwei(String zhiwei) {
		this.zhiwei = zhiwei;
	}
	
	/**
	 * 获取：职位
	 */
	public String getZhiwei() {
		return zhiwei;
	}
				
	
	/**
	 * 设置：考勤天数
	 */
	 
	public void setKaoqintianshu(Integer kaoqintianshu) {
		this.kaoqintianshu = kaoqintianshu;
	}
	
	/**
	 * 获取：考勤天数
	 */
	public Integer getKaoqintianshu() {
		return kaoqintianshu;
	}
				
	
	/**
	 * 设置：缺勤次数
	 */
	 
	public void setQueqincishu(Integer queqincishu) {
		this.queqincishu = queqincishu;
	}
	
	/**
	 * 获取：缺勤次数
	 */
	public Integer getQueqincishu() {
		return queqincishu;
	}
				
	
	/**
	 * 设置：修改时间
	 */
	 
	public void setXiugaishijian(Date xiugaishijian) {
		this.xiugaishijian = xiugaishijian;
	}
	
	/**
	 * 获取：修改时间
	 */
	public Date getXiugaishijian() {
		return xiugaishijian;
	}
			
}
