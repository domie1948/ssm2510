package com.entity.model;

import com.entity.YuangonggongziEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 员工工资
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-14 16:33:36
 */
public class YuangonggongziModel  implements Serializable {
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
	 * 基础工资
	 */
	
	private Integer jichugongzi;
		
	/**
	 * 加班补贴
	 */
	
	private Integer jiabanbutie;
		
	/**
	 * 出差津贴
	 */
	
	private Integer chuchajintie;
		
	/**
	 * 缺勤天数
	 */
	
	private Integer queqintianshu;
		
	/**
	 * 缺勤扣钱
	 */
	
	private Integer queqinkouqian;
		
	/**
	 * 实际工资
	 */
	
	private Integer shijigongzi;
				
	
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
	 * 设置：基础工资
	 */
	 
	public void setJichugongzi(Integer jichugongzi) {
		this.jichugongzi = jichugongzi;
	}
	
	/**
	 * 获取：基础工资
	 */
	public Integer getJichugongzi() {
		return jichugongzi;
	}
				
	
	/**
	 * 设置：加班补贴
	 */
	 
	public void setJiabanbutie(Integer jiabanbutie) {
		this.jiabanbutie = jiabanbutie;
	}
	
	/**
	 * 获取：加班补贴
	 */
	public Integer getJiabanbutie() {
		return jiabanbutie;
	}
				
	
	/**
	 * 设置：出差津贴
	 */
	 
	public void setChuchajintie(Integer chuchajintie) {
		this.chuchajintie = chuchajintie;
	}
	
	/**
	 * 获取：出差津贴
	 */
	public Integer getChuchajintie() {
		return chuchajintie;
	}
				
	
	/**
	 * 设置：缺勤天数
	 */
	 
	public void setQueqintianshu(Integer queqintianshu) {
		this.queqintianshu = queqintianshu;
	}
	
	/**
	 * 获取：缺勤天数
	 */
	public Integer getQueqintianshu() {
		return queqintianshu;
	}
				
	
	/**
	 * 设置：缺勤扣钱
	 */
	 
	public void setQueqinkouqian(Integer queqinkouqian) {
		this.queqinkouqian = queqinkouqian;
	}
	
	/**
	 * 获取：缺勤扣钱
	 */
	public Integer getQueqinkouqian() {
		return queqinkouqian;
	}
				
	
	/**
	 * 设置：实际工资
	 */
	 
	public void setShijigongzi(Integer shijigongzi) {
		this.shijigongzi = shijigongzi;
	}
	
	/**
	 * 获取：实际工资
	 */
	public Integer getShijigongzi() {
		return shijigongzi;
	}
			
}
