package com.entity.model;

import com.entity.QueqinkouqianbiaozhunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 缺勤扣钱标准
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-14 16:33:36
 */
public class QueqinkouqianbiaozhunModel  implements Serializable {
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
