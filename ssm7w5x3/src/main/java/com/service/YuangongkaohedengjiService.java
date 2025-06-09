package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuangongkaohedengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuangongkaohedengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuangongkaohedengjiView;


/**
 * 员工考核登记
 *
 * @author 
 * @email 
 * @date 2021-04-14 16:33:36
 */
public interface YuangongkaohedengjiService extends IService<YuangongkaohedengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuangongkaohedengjiVO> selectListVO(Wrapper<YuangongkaohedengjiEntity> wrapper);
   	
   	YuangongkaohedengjiVO selectVO(@Param("ew") Wrapper<YuangongkaohedengjiEntity> wrapper);
   	
   	List<YuangongkaohedengjiView> selectListView(Wrapper<YuangongkaohedengjiEntity> wrapper);
   	
   	YuangongkaohedengjiView selectView(@Param("ew") Wrapper<YuangongkaohedengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuangongkaohedengjiEntity> wrapper);
   	
}

