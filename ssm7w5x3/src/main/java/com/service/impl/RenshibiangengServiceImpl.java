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


import com.dao.RenshibiangengDao;
import com.entity.RenshibiangengEntity;
import com.service.RenshibiangengService;
import com.entity.vo.RenshibiangengVO;
import com.entity.view.RenshibiangengView;

@Service("renshibiangengService")
public class RenshibiangengServiceImpl extends ServiceImpl<RenshibiangengDao, RenshibiangengEntity> implements RenshibiangengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RenshibiangengEntity> page = this.selectPage(
                new Query<RenshibiangengEntity>(params).getPage(),
                new EntityWrapper<RenshibiangengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RenshibiangengEntity> wrapper) {
		  Page<RenshibiangengView> page =new Query<RenshibiangengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RenshibiangengVO> selectListVO(Wrapper<RenshibiangengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RenshibiangengVO selectVO(Wrapper<RenshibiangengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RenshibiangengView> selectListView(Wrapper<RenshibiangengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RenshibiangengView selectView(Wrapper<RenshibiangengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
