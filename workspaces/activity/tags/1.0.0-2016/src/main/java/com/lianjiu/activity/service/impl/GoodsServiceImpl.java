package com.lianjiu.activity.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.lianjiu.activity.service.GoodsServiceI;
import com.lianjiu.common.pojo.LianjiuResult;
import com.lianjiu.common.utils.Contants;
import com.lianjiu.common.utils.PageUtils;
 
@Service
public class GoodsServiceImpl implements GoodsServiceI {

	//@Autowired
	//注入商品mapper
	
	//查询当前登陆用户的商品  并分页
	@Override
	public LianjiuResult checkQueryGoods(Object pojo,PageUtils page) {
		Map<String,Object> map =new HashMap<String,Object>();
		try {
			//将查询条件放入到map中
			map.put("pojo", pojo);
			//查询数据总条数
			int num=5;
			if (num==0 || "".equals(num)) {
				return LianjiuResult.build(Contants.SUCCESS, "查询无结果");
			}
			//设置page
			page.setSum(num);//总条数
			//将分页对象放入map中
			map.put("p", page);
			//带分页的查询结果集
			//放入map中
			
			//将插查询条件的实体类移除
			map.remove("pojo");
			return LianjiuResult.build(Contants.SUCCESS, "查询成功",map);
		} catch (Exception e) {
			e.printStackTrace();
			return LianjiuResult.build(Contants.ERROR, "查询失败");
		}
		
	}

	
	//修改商品信息
	@Override
	public LianjiuResult updateGoods(Object pojo) {
		try {
			//调用商品Mapper 的修改方法
			
			return LianjiuResult.build(Contants.SUCCESS, "修改成功");
			
		} catch (Exception e) {
			e.printStackTrace();
			return LianjiuResult.build(Contants.ERROR, "修改失败");
		}
	}


	//通过商品id查询商品信息
	@Override
	public LianjiuResult findGoodsById(Integer id) {
		try {
			//调用商品Mapper 的    通过商品id查询商品方法
			return LianjiuResult.build(Contants.SUCCESS, "查询成功");
			
		} catch (Exception e) {
			e.printStackTrace();
			return LianjiuResult.build(Contants.ERROR, "查询失败");
		}
	}


	 


	 

	
	
	
	
}
