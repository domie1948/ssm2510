package com.dao;

import com.entity.XiujiashenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiujiashenqingVO;
import com.entity.view.XiujiashenqingView;


/**
 * 休假申请
 * 
 * @author 
 * @email 
 * @date 2021-04-14 16:33:36
 */
public interface XiujiashenqingDao extends BaseMapper<XiujiashenqingEntity> {
	
	List<XiujiashenqingVO> selectListVO(@Param("ew") Wrapper<XiujiashenqingEntity> wrapper);
	
	XiujiashenqingVO selectVO(@Param("ew") Wrapper<XiujiashenqingEntity> wrapper);
	
	List<XiujiashenqingView> selectListView(@Param("ew") Wrapper<XiujiashenqingEntity> wrapper);

	List<XiujiashenqingView> selectListView(Pagination page,@Param("ew") Wrapper<XiujiashenqingEntity> wrapper);
	
	XiujiashenqingView selectView(@Param("ew") Wrapper<XiujiashenqingEntity> wrapper);
	
}
