package com.entity.view;

import com.entity.XiujiashenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 休假申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-14 16:33:36
 */
@TableName("xiujiashenqing")
public class XiujiashenqingView  extends XiujiashenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiujiashenqingView(){
	}
 
 	public XiujiashenqingView(XiujiashenqingEntity xiujiashenqingEntity){
 	try {
			BeanUtils.copyProperties(this, xiujiashenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
