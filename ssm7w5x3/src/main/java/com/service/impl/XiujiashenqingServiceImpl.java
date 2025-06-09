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


import com.dao.XiujiashenqingDao;
import com.entity.XiujiashenqingEntity;
import com.service.XiujiashenqingService;
import com.entity.vo.XiujiashenqingVO;
import com.entity.view.XiujiashenqingView;

@Service("xiujiashenqingService")
public class XiujiashenqingServiceImpl extends ServiceImpl<XiujiashenqingDao, XiujiashenqingEntity> implements XiujiashenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiujiashenqingEntity> page = this.selectPage(
                new Query<XiujiashenqingEntity>(params).getPage(),
                new EntityWrapper<XiujiashenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiujiashenqingEntity> wrapper) {
		  Page<XiujiashenqingView> page =new Query<XiujiashenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiujiashenqingVO> selectListVO(Wrapper<XiujiashenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiujiashenqingVO selectVO(Wrapper<XiujiashenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiujiashenqingView> selectListView(Wrapper<XiujiashenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiujiashenqingView selectView(Wrapper<XiujiashenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
