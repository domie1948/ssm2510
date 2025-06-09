package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QueqinkouqianbiaozhunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QueqinkouqianbiaozhunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QueqinkouqianbiaozhunView;


/**
 * 缺勤扣钱标准
 *
 * @author 
 * @email 
 * @date 2021-04-14 16:33:36
 */
public interface QueqinkouqianbiaozhunService extends IService<QueqinkouqianbiaozhunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QueqinkouqianbiaozhunVO> selectListVO(Wrapper<QueqinkouqianbiaozhunEntity> wrapper);
   	
   	QueqinkouqianbiaozhunVO selectVO(@Param("ew") Wrapper<QueqinkouqianbiaozhunEntity> wrapper);
   	
   	List<QueqinkouqianbiaozhunView> selectListView(Wrapper<QueqinkouqianbiaozhunEntity> wrapper);
   	
   	QueqinkouqianbiaozhunView selectView(@Param("ew") Wrapper<QueqinkouqianbiaozhunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QueqinkouqianbiaozhunEntity> wrapper);
   	
}

