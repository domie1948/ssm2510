package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RenshibiangengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RenshibiangengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RenshibiangengView;


/**
 * 人事变更
 *
 * @author 
 * @email 
 * @date 2021-04-14 16:33:35
 */
public interface RenshibiangengService extends IService<RenshibiangengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RenshibiangengVO> selectListVO(Wrapper<RenshibiangengEntity> wrapper);
   	
   	RenshibiangengVO selectVO(@Param("ew") Wrapper<RenshibiangengEntity> wrapper);
   	
   	List<RenshibiangengView> selectListView(Wrapper<RenshibiangengEntity> wrapper);
   	
   	RenshibiangengView selectView(@Param("ew") Wrapper<RenshibiangengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RenshibiangengEntity> wrapper);
   	
}

