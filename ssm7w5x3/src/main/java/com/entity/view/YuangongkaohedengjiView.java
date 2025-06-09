package com.entity.view;

import com.entity.YuangongkaohedengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 员工考核登记
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-14 16:33:36
 */
@TableName("yuangongkaohedengji")
public class YuangongkaohedengjiView  extends YuangongkaohedengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuangongkaohedengjiView(){
	}
 
 	public YuangongkaohedengjiView(YuangongkaohedengjiEntity yuangongkaohedengjiEntity){
 	try {
			BeanUtils.copyProperties(this, yuangongkaohedengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
