package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YuangongkaohedengjiDao;
import com.entity.YuangongkaohedengjiEntity;
import com.service.YuangongkaohedengjiService;
import com.entity.vo.YuangongkaohedengjiVO;
import com.entity.view.YuangongkaohedengjiView;

@Service("yuangongkaohedengjiService")
public class YuangongkaohedengjiServiceImpl extends ServiceImpl<YuangongkaohedengjiDao, YuangongkaohedengjiEntity> implements YuangongkaohedengjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuangongkaohedengjiEntity> page = this.selectPage(
                new Query<YuangongkaohedengjiEntity>(params).getPage(),
                new EntityWrapper<YuangongkaohedengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuangongkaohedengjiEntity> wrapper) {
		  Page<YuangongkaohedengjiView> page =new Query<YuangongkaohedengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuangongkaohedengjiVO> selectListVO(Wrapper<YuangongkaohedengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuangongkaohedengjiVO selectVO(Wrapper<YuangongkaohedengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuangongkaohedengjiView> selectListView(Wrapper<YuangongkaohedengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuangongkaohedengjiView selectView(Wrapper<YuangongkaohedengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
