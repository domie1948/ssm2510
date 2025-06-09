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
 * 员工工资
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-14 16:33:36
 */
@TableName("yuangonggongzi")
public class YuangonggongziEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YuangonggongziEntity() {
		
	}
	
	public YuangonggongziEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 员工工号
	 */
					
	private String yuangonggonghao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：员工工号
	 */
	public void setYuangonggonghao(String yuangonggonghao) {
		this.yuangonggonghao = yuangonggonghao;
	}
	/**
	 * 获取：员工工号
	 */
	public String getYuangonggonghao() {
		return yuangonggonghao;
	}
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
