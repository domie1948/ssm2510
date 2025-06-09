package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KaohejieguoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KaohejieguoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KaohejieguoView;


/**
 * 考核结果
 *
 * @author 
 * @email 
 * @date 2021-04-14 16:33:36
 */
public interface KaohejieguoService extends IService<KaohejieguoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KaohejieguoVO> selectListVO(Wrapper<KaohejieguoEntity> wrapper);
   	
   	KaohejieguoVO selectVO(@Param("ew") Wrapper<KaohejieguoEntity> wrapper);
   	
   	List<KaohejieguoView> selectListView(Wrapper<KaohejieguoEntity> wrapper);
   	
   	KaohejieguoView selectView(@Param("ew") Wrapper<KaohejieguoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KaohejieguoEntity> wrapper);
   	
}

