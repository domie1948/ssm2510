package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiujiashenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiujiashenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiujiashenqingView;


/**
 * 休假申请
 *
 * @author 
 * @email 
 * @date 2021-04-14 16:33:36
 */
public interface XiujiashenqingService extends IService<XiujiashenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiujiashenqingVO> selectListVO(Wrapper<XiujiashenqingEntity> wrapper);
   	
   	XiujiashenqingVO selectVO(@Param("ew") Wrapper<XiujiashenqingEntity> wrapper);
   	
   	List<XiujiashenqingView> selectListView(Wrapper<XiujiashenqingEntity> wrapper);
   	
   	XiujiashenqingView selectView(@Param("ew") Wrapper<XiujiashenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiujiashenqingEntity> wrapper);
   	
}

