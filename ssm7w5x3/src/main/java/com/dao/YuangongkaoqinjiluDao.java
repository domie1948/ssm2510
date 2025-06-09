package com.dao;

import com.entity.YuangongkaoqinjiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuangongkaoqinjiluVO;
import com.entity.view.YuangongkaoqinjiluView;


/**
 * 员工考勤记录
 * 
 * @author 
 * @email 
 * @date 2021-04-14 16:33:36
 */
public interface YuangongkaoqinjiluDao extends BaseMapper<YuangongkaoqinjiluEntity> {
	
	List<YuangongkaoqinjiluVO> selectListVO(@Param("ew") Wrapper<YuangongkaoqinjiluEntity> wrapper);
	
	YuangongkaoqinjiluVO selectVO(@Param("ew") Wrapper<YuangongkaoqinjiluEntity> wrapper);
	
	List<YuangongkaoqinjiluView> selectListView(@Param("ew") Wrapper<YuangongkaoqinjiluEntity> wrapper);

	List<YuangongkaoqinjiluView> selectListView(Pagination page,@Param("ew") Wrapper<YuangongkaoqinjiluEntity> wrapper);
	
	YuangongkaoqinjiluView selectView(@Param("ew") Wrapper<YuangongkaoqinjiluEntity> wrapper);
	
}
