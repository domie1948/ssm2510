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
 * 缺勤扣钱标准
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-14 16:33:36
 */
@TableName("queqinkouqianbiaozhun")
public class QueqinkouqianbiaozhunEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QueqinkouqianbiaozhunEntity() {
		
	}
	
	public QueqinkouqianbiaozhunEntity(T t) {
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
	 * 缺勤天数
	 */
					
	private Integer queqintianshu;
	
	/**
	 * 缺勤扣钱
	 */
					
	private Integer queqinkouqian;
	
	
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

}
