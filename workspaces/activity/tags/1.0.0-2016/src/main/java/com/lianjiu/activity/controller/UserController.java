package com.lianjiu.activity.controller;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lianjiu.activity.service.UserServiceI;
 

/**
 * 描述: TODO <br>
 * 作者: 米世廷 <br>
 * 时间: 2016年8月31日 下午4:05:21
 */
@Controller
@RequestMapping("/BusUser")
public class UserController {
	
	@Autowired
	private UserServiceI userService;
}
