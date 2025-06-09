package com.dao;

import com.entity.QueqinkouqianbiaozhunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QueqinkouqianbiaozhunVO;
import com.entity.view.QueqinkouqianbiaozhunView;


/**
 * 缺勤扣钱标准
 * 
 * @author 
 * @email 
 * @date 2021-04-14 16:33:36
 */
public interface QueqinkouqianbiaozhunDao extends BaseMapper<QueqinkouqianbiaozhunEntity> {
	
	List<QueqinkouqianbiaozhunVO> selectListVO(@Param("ew") Wrapper<QueqinkouqianbiaozhunEntity> wrapper);
	
	QueqinkouqianbiaozhunVO selectVO(@Param("ew") Wrapper<QueqinkouqianbiaozhunEntity> wrapper);
	
	List<QueqinkouqianbiaozhunView> selectListView(@Param("ew") Wrapper<QueqinkouqianbiaozhunEntity> wrapper);

	List<QueqinkouqianbiaozhunView> selectListView(Pagination page,@Param("ew") Wrapper<QueqinkouqianbiaozhunEntity> wrapper);
	
	QueqinkouqianbiaozhunView selectView(@Param("ew") Wrapper<QueqinkouqianbiaozhunEntity> wrapper);
	
}
