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


import com.dao.KaohejieguoDao;
import com.entity.KaohejieguoEntity;
import com.service.KaohejieguoService;
import com.entity.vo.KaohejieguoVO;
import com.entity.view.KaohejieguoView;

@Service("kaohejieguoService")
public class KaohejieguoServiceImpl extends ServiceImpl<KaohejieguoDao, KaohejieguoEntity> implements KaohejieguoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KaohejieguoEntity> page = this.selectPage(
                new Query<KaohejieguoEntity>(params).getPage(),
                new EntityWrapper<KaohejieguoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KaohejieguoEntity> wrapper) {
		  Page<KaohejieguoView> page =new Query<KaohejieguoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KaohejieguoVO> selectListVO(Wrapper<KaohejieguoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KaohejieguoVO selectVO(Wrapper<KaohejieguoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KaohejieguoView> selectListView(Wrapper<KaohejieguoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KaohejieguoView selectView(Wrapper<KaohejieguoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
