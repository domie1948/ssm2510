package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KaohebiaozhunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KaohebiaozhunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KaohebiaozhunView;


/**
 * 考核标准
 *
 * @author 
 * @email 
 * @date 2021-04-14 16:33:36
 */
public interface KaohebiaozhunService extends IService<KaohebiaozhunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KaohebiaozhunVO> selectListVO(Wrapper<KaohebiaozhunEntity> wrapper);
   	
   	KaohebiaozhunVO selectVO(@Param("ew") Wrapper<KaohebiaozhunEntity> wrapper);
   	
   	List<KaohebiaozhunView> selectListView(Wrapper<KaohebiaozhunEntity> wrapper);
   	
   	KaohebiaozhunView selectView(@Param("ew") Wrapper<KaohebiaozhunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KaohebiaozhunEntity> wrapper);
   	
}

