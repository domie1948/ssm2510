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


import com.dao.KaohebiaozhunDao;
import com.entity.KaohebiaozhunEntity;
import com.service.KaohebiaozhunService;
import com.entity.vo.KaohebiaozhunVO;
import com.entity.view.KaohebiaozhunView;

@Service("kaohebiaozhunService")
public class KaohebiaozhunServiceImpl extends ServiceImpl<KaohebiaozhunDao, KaohebiaozhunEntity> implements KaohebiaozhunService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KaohebiaozhunEntity> page = this.selectPage(
                new Query<KaohebiaozhunEntity>(params).getPage(),
                new EntityWrapper<KaohebiaozhunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KaohebiaozhunEntity> wrapper) {
		  Page<KaohebiaozhunView> page =new Query<KaohebiaozhunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KaohebiaozhunVO> selectListVO(Wrapper<KaohebiaozhunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KaohebiaozhunVO selectVO(Wrapper<KaohebiaozhunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KaohebiaozhunView> selectListView(Wrapper<KaohebiaozhunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KaohebiaozhunView selectView(Wrapper<KaohebiaozhunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
