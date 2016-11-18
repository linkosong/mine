package com.lianjiu.activity.controller;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lianjiu.activity.service.GoodsServiceI;
import com.lianjiu.activity.service.MoneyServiceI;
import com.lianjiu.activity.service.OrderServiceI;
import com.lianjiu.common.pojo.LianjiuResult;
import com.lianjiu.common.utils.PageUtils;
 

/**
 * 描述: TODO <br>
 * 作者: 米世廷 <br>
 * 时间: 2016年8月31日 下午4:05:21
 */
@Controller
@RequestMapping("/BusGoods")
public class GoodsController {
	
	@Autowired
	private GoodsServiceI goodsService;
 
	//线上商品
	
	//从session中获取用户信息。判断是商家还是供应商。   即获取登录用户id
	
	
	/**
	 * 条件 查询当前用户下的商品
	 * @param pojo
	 * @param page
	 * @return
	 */
	@RequestMapping(value="/checkQueryGoods")
	@ResponseBody						//改为包装类
	public LianjiuResult checkQueryGoods(Object pojo,PageUtils page){
		//pojo.setRole(); 设置用户的id 
		//pojo.setState(); 设置商品的状态，上下  架  、 停止售卖 、  审核中  、  审核失败
		
		return goodsService.checkQueryGoods(pojo,page);
	}

	
	/**
	 * 修改商品信息通过商品的id
	 * @param pojo
	 * @return
	 */
	
	//	修改条件——商品的状态，商品的id
	//分销设置
	//商品下架，商品的上架
	//设置排序
	@RequestMapping(value="/updateGoods")
	@ResponseBody						//选中的商品详情信息 的包装类     包括页面修改的属性，及商品的id
	public LianjiuResult updateGoods(Object pojo){
		//pojo.setRole(); 设置商品的id
		
		return goodsService.updateGoods(pojo);
	}
	
	
	
	/**
	 * 通过商品id,查询   商品详情信息
	 */
	@RequestMapping(value="/findGoodsById")
	@ResponseBody
	public LianjiuResult findGoodsById(Integer id){
		return goodsService.findGoodsById(id);
	}
	

	
}
