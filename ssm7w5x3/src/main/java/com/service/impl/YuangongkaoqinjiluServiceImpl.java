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


import com.dao.YuangongkaoqinjiluDao;
import com.entity.YuangongkaoqinjiluEntity;
import com.service.YuangongkaoqinjiluService;
import com.entity.vo.YuangongkaoqinjiluVO;
import com.entity.view.YuangongkaoqinjiluView;

@Service("yuangongkaoqinjiluService")
public class YuangongkaoqinjiluServiceImpl extends ServiceImpl<YuangongkaoqinjiluDao, YuangongkaoqinjiluEntity> implements YuangongkaoqinjiluService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuangongkaoqinjiluEntity> page = this.selectPage(
                new Query<YuangongkaoqinjiluEntity>(params).getPage(),
                new EntityWrapper<YuangongkaoqinjiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuangongkaoqinjiluEntity> wrapper) {
		  Page<YuangongkaoqinjiluView> page =new Query<YuangongkaoqinjiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuangongkaoqinjiluVO> selectListVO(Wrapper<YuangongkaoqinjiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuangongkaoqinjiluVO selectVO(Wrapper<YuangongkaoqinjiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuangongkaoqinjiluView> selectListView(Wrapper<YuangongkaoqinjiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuangongkaoqinjiluView selectView(Wrapper<YuangongkaoqinjiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
