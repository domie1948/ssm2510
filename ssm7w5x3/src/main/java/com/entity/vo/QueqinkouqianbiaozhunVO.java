package com.entity.vo;

import com.entity.QueqinkouqianbiaozhunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 缺勤扣钱标准
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-14 16:33:36
 */
public class QueqinkouqianbiaozhunVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 缺勤扣钱
	 */
	
	private Integer queqinkouqian;
				
	
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
