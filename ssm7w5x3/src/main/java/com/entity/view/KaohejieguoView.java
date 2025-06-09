package com.entity.view;

import com.entity.KaohejieguoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 考核结果
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-14 16:33:36
 */
@TableName("kaohejieguo")
public class KaohejieguoView  extends KaohejieguoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KaohejieguoView(){
	}
 
 	public KaohejieguoView(KaohejieguoEntity kaohejieguoEntity){
 	try {
			BeanUtils.copyProperties(this, kaohejieguoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
