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


import com.dao.QueqinkouqianbiaozhunDao;
import com.entity.QueqinkouqianbiaozhunEntity;
import com.service.QueqinkouqianbiaozhunService;
import com.entity.vo.QueqinkouqianbiaozhunVO;
import com.entity.view.QueqinkouqianbiaozhunView;

@Service("queqinkouqianbiaozhunService")
public class QueqinkouqianbiaozhunServiceImpl extends ServiceImpl<QueqinkouqianbiaozhunDao, QueqinkouqianbiaozhunEntity> implements QueqinkouqianbiaozhunService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QueqinkouqianbiaozhunEntity> page = this.selectPage(
                new Query<QueqinkouqianbiaozhunEntity>(params).getPage(),
                new EntityWrapper<QueqinkouqianbiaozhunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QueqinkouqianbiaozhunEntity> wrapper) {
		  Page<QueqinkouqianbiaozhunView> page =new Query<QueqinkouqianbiaozhunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QueqinkouqianbiaozhunVO> selectListVO(Wrapper<QueqinkouqianbiaozhunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QueqinkouqianbiaozhunVO selectVO(Wrapper<QueqinkouqianbiaozhunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QueqinkouqianbiaozhunView> selectListView(Wrapper<QueqinkouqianbiaozhunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QueqinkouqianbiaozhunView selectView(Wrapper<QueqinkouqianbiaozhunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
