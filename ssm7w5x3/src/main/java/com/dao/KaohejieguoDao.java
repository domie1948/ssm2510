package com.dao;

import com.entity.KaohejieguoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KaohejieguoVO;
import com.entity.view.KaohejieguoView;


/**
 * 考核结果
 * 
 * @author 
 * @email 
 * @date 2021-04-14 16:33:36
 */
public interface KaohejieguoDao extends BaseMapper<KaohejieguoEntity> {
	
	List<KaohejieguoVO> selectListVO(@Param("ew") Wrapper<KaohejieguoEntity> wrapper);
	
	KaohejieguoVO selectVO(@Param("ew") Wrapper<KaohejieguoEntity> wrapper);
	
	List<KaohejieguoView> selectListView(@Param("ew") Wrapper<KaohejieguoEntity> wrapper);

	List<KaohejieguoView> selectListView(Pagination page,@Param("ew") Wrapper<KaohejieguoEntity> wrapper);
	
	KaohejieguoView selectView(@Param("ew") Wrapper<KaohejieguoEntity> wrapper);
	
}
