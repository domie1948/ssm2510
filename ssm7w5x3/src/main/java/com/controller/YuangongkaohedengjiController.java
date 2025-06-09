package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YuangongkaohedengjiEntity;
import com.entity.view.YuangongkaohedengjiView;

import com.service.YuangongkaohedengjiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 员工考核登记
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-14 16:33:36
 */
@RestController
@RequestMapping("/yuangongkaohedengji")
public class YuangongkaohedengjiController {
    @Autowired
    private YuangongkaohedengjiService yuangongkaohedengjiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YuangongkaohedengjiEntity yuangongkaohedengji, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yuangong")) {
			yuangongkaohedengji.setYuangonggonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YuangongkaohedengjiEntity> ew = new EntityWrapper<YuangongkaohedengjiEntity>();
		PageUtils page = yuangongkaohedengjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuangongkaohedengji), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YuangongkaohedengjiEntity yuangongkaohedengji, HttpServletRequest request){
        EntityWrapper<YuangongkaohedengjiEntity> ew = new EntityWrapper<YuangongkaohedengjiEntity>();
		PageUtils page = yuangongkaohedengjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuangongkaohedengji), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YuangongkaohedengjiEntity yuangongkaohedengji){
       	EntityWrapper<YuangongkaohedengjiEntity> ew = new EntityWrapper<YuangongkaohedengjiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yuangongkaohedengji, "yuangongkaohedengji")); 
        return R.ok().put("data", yuangongkaohedengjiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YuangongkaohedengjiEntity yuangongkaohedengji){
        EntityWrapper< YuangongkaohedengjiEntity> ew = new EntityWrapper< YuangongkaohedengjiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yuangongkaohedengji, "yuangongkaohedengji")); 
		YuangongkaohedengjiView yuangongkaohedengjiView =  yuangongkaohedengjiService.selectView(ew);
		return R.ok("查询员工考核登记成功").put("data", yuangongkaohedengjiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YuangongkaohedengjiEntity yuangongkaohedengji = yuangongkaohedengjiService.selectById(id);
        return R.ok().put("data", yuangongkaohedengji);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YuangongkaohedengjiEntity yuangongkaohedengji = yuangongkaohedengjiService.selectById(id);
        return R.ok().put("data", yuangongkaohedengji);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YuangongkaohedengjiEntity yuangongkaohedengji, HttpServletRequest request){
    	yuangongkaohedengji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yuangongkaohedengji);

        yuangongkaohedengjiService.insert(yuangongkaohedengji);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
	@IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody YuangongkaohedengjiEntity yuangongkaohedengji, HttpServletRequest request){
    	yuangongkaohedengji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yuangongkaohedengji);

        yuangongkaohedengjiService.insert(yuangongkaohedengji);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YuangongkaohedengjiEntity yuangongkaohedengji, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yuangongkaohedengji);
        yuangongkaohedengjiService.updateById(yuangongkaohedengji);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yuangongkaohedengjiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<YuangongkaohedengjiEntity> wrapper = new EntityWrapper<YuangongkaohedengjiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yuangong")) {
			wrapper.eq("yuangonggonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = yuangongkaohedengjiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
