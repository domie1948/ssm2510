package com.dao;

import com.entity.RenshibiangengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RenshibiangengVO;
import com.entity.view.RenshibiangengView;


/**
 * 人事变更
 * 
 * @author 
 * @email 
 * @date 2021-04-14 16:33:35
 */
public interface RenshibiangengDao extends BaseMapper<RenshibiangengEntity> {
	
	List<RenshibiangengVO> selectListVO(@Param("ew") Wrapper<RenshibiangengEntity> wrapper);
	
	RenshibiangengVO selectVO(@Param("ew") Wrapper<RenshibiangengEntity> wrapper);
	
	List<RenshibiangengView> selectListView(@Param("ew") Wrapper<RenshibiangengEntity> wrapper);

	List<RenshibiangengView> selectListView(Pagination page,@Param("ew") Wrapper<RenshibiangengEntity> wrapper);
	
	RenshibiangengView selectView(@Param("ew") Wrapper<RenshibiangengEntity> wrapper);
	
}
