package com.entity.view;

import com.entity.KaohebiaozhunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 考核标准
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-14 16:33:36
 */
@TableName("kaohebiaozhun")
public class KaohebiaozhunView  extends KaohebiaozhunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KaohebiaozhunView(){
	}
 
 	public KaohebiaozhunView(KaohebiaozhunEntity kaohebiaozhunEntity){
 	try {
			BeanUtils.copyProperties(this, kaohebiaozhunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
