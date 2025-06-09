package com.entity.model;

import com.entity.KaohejieguoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 考核结果
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-14 16:33:36
 */
public class KaohejieguoModel  implements Serializable {
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
	 * 考核封面
	 */
	
	private String kaohefengmian;
		
	/**
	 * 考核日期
	 */
	
	private String kaoheriqi;
		
	/**
	 * 考核内容
	 */
	
	private String kaoheneirong;
		
	/**
	 * 考核评分
	 */
	
	private String kaohepingfen;
		
	/**
	 * 绩效
	 */
	
	private Integer jixiao;
		
	/**
	 * 考核评价
	 */
	
	private String kaohepingjia;
				
	
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
	 * 设置：考核封面
	 */
	 
	public void setKaohefengmian(String kaohefengmian) {
		this.kaohefengmian = kaohefengmian;
	}
	
	/**
	 * 获取：考核封面
	 */
	public String getKaohefengmian() {
		return kaohefengmian;
	}
				
	
	/**
	 * 设置：考核日期
	 */
	 
	public void setKaoheriqi(String kaoheriqi) {
		this.kaoheriqi = kaoheriqi;
	}
	
	/**
	 * 获取：考核日期
	 */
	public String getKaoheriqi() {
		return kaoheriqi;
	}
				
	
	/**
	 * 设置：考核内容
	 */
	 
	public void setKaoheneirong(String kaoheneirong) {
		this.kaoheneirong = kaoheneirong;
	}
	
	/**
	 * 获取：考核内容
	 */
	public String getKaoheneirong() {
		return kaoheneirong;
	}
				
	
	/**
	 * 设置：考核评分
	 */
	 
	public void setKaohepingfen(String kaohepingfen) {
		this.kaohepingfen = kaohepingfen;
	}
	
	/**
	 * 获取：考核评分
	 */
	public String getKaohepingfen() {
		return kaohepingfen;
	}
				
	
	/**
	 * 设置：绩效
	 */
	 
	public void setJixiao(Integer jixiao) {
		this.jixiao = jixiao;
	}
	
	/**
	 * 获取：绩效
	 */
	public Integer getJixiao() {
		return jixiao;
	}
				
	
	/**
	 * 设置：考核评价
	 */
	 
	public void setKaohepingjia(String kaohepingjia) {
		this.kaohepingjia = kaohepingjia;
	}
	
	/**
	 * 获取：考核评价
	 */
	public String getKaohepingjia() {
		return kaohepingjia;
	}
			
}
