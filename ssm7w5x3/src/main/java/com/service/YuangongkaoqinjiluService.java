package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuangongkaoqinjiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuangongkaoqinjiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuangongkaoqinjiluView;


/**
 * 员工考勤记录
 *
 * @author 
 * @email 
 * @date 2021-04-14 16:33:36
 */
public interface YuangongkaoqinjiluService extends IService<YuangongkaoqinjiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuangongkaoqinjiluVO> selectListVO(Wrapper<YuangongkaoqinjiluEntity> wrapper);
   	
   	YuangongkaoqinjiluVO selectVO(@Param("ew") Wrapper<YuangongkaoqinjiluEntity> wrapper);
   	
   	List<YuangongkaoqinjiluView> selectListView(Wrapper<YuangongkaoqinjiluEntity> wrapper);
   	
   	YuangongkaoqinjiluView selectView(@Param("ew") Wrapper<YuangongkaoqinjiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuangongkaoqinjiluEntity> wrapper);
   	
}

