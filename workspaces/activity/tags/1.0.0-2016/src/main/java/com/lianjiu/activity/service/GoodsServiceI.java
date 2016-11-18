package com.lianjiu.activity.service;

import com.lianjiu.common.pojo.LianjiuResult;
import com.lianjiu.common.utils.PageUtils;

public interface GoodsServiceI {
	
	//条件查询 当前用户下的商品
	public LianjiuResult checkQueryGoods(Object pojo,PageUtils page);
	
	//修改商品信息
	public LianjiuResult updateGoods(Object pojo);
	
	//通过商品id查询商品信息
	public LianjiuResult findGoodsById(Integer id);
	
}
