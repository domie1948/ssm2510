package com.dao;

import com.entity.YuangongkaohedengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuangongkaohedengjiVO;
import com.entity.view.YuangongkaohedengjiView;


/**
 * 员工考核登记
 * 
 * @author 
 * @email 
 * @date 2021-04-14 16:33:36
 */
public interface YuangongkaohedengjiDao extends BaseMapper<YuangongkaohedengjiEntity> {
	
	List<YuangongkaohedengjiVO> selectListVO(@Param("ew") Wrapper<YuangongkaohedengjiEntity> wrapper);
	
	YuangongkaohedengjiVO selectVO(@Param("ew") Wrapper<YuangongkaohedengjiEntity> wrapper);
	
	List<YuangongkaohedengjiView> selectListView(@Param("ew") Wrapper<YuangongkaohedengjiEntity> wrapper);

	List<YuangongkaohedengjiView> selectListView(Pagination page,@Param("ew") Wrapper<YuangongkaohedengjiEntity> wrapper);
	
	YuangongkaohedengjiView selectView(@Param("ew") Wrapper<YuangongkaohedengjiEntity> wrapper);
	
}
