package com.dao;

import com.entity.KaohebiaozhunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KaohebiaozhunVO;
import com.entity.view.KaohebiaozhunView;


/**
 * 考核标准
 * 
 * @author 
 * @email 
 * @date 2021-04-14 16:33:36
 */
public interface KaohebiaozhunDao extends BaseMapper<KaohebiaozhunEntity> {
	
	List<KaohebiaozhunVO> selectListVO(@Param("ew") Wrapper<KaohebiaozhunEntity> wrapper);
	
	KaohebiaozhunVO selectVO(@Param("ew") Wrapper<KaohebiaozhunEntity> wrapper);
	
	List<KaohebiaozhunView> selectListView(@Param("ew") Wrapper<KaohebiaozhunEntity> wrapper);

	List<KaohebiaozhunView> selectListView(Pagination page,@Param("ew") Wrapper<KaohebiaozhunEntity> wrapper);
	
	KaohebiaozhunView selectView(@Param("ew") Wrapper<KaohebiaozhunEntity> wrapper);
	
}
