package com.entity.model;

import com.entity.KaohebiaozhunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 考核标准
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-14 16:33:36
 */
public class KaohebiaozhunModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 绩效
	 */
	
	private Integer jixiao;
				
	
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
			
}
