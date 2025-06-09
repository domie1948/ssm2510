package com.entity.view;

import com.entity.YuangongkaoqinjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 员工考勤记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-14 16:33:36
 */
@TableName("yuangongkaoqinjilu")
public class YuangongkaoqinjiluView  extends YuangongkaoqinjiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuangongkaoqinjiluView(){
	}
 
 	public YuangongkaoqinjiluView(YuangongkaoqinjiluEntity yuangongkaoqinjiluEntity){
 	try {
			BeanUtils.copyProperties(this, yuangongkaoqinjiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
