package com.entity.view;

import com.entity.RenshibiangengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 人事变更
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-14 16:33:35
 */
@TableName("renshibiangeng")
public class RenshibiangengView  extends RenshibiangengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RenshibiangengView(){
	}
 
 	public RenshibiangengView(RenshibiangengEntity renshibiangengEntity){
 	try {
			BeanUtils.copyProperties(this, renshibiangengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
