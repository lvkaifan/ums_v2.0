package com.bdqn.ums.controller;

import com.bdqn.ums.controller.base.BaseController;
import com.bdqn.ums.pojo.entity.User;
import com.bdqn.ums.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.SQLOutput;

/**
 * <b>用户控制层</b>
 */

@Controller("userController")
@RequestMapping("/user")
public class UserController extends BaseController {
	@Resource(name = "userService")
	private UserService userService;

	@RequestMapping(value = "/save",method = RequestMethod.GET)
	public String forwardAddPage()throws Exception{
		System.out.println("进入1");
		return "user_save";
	}
	@RequestMapping(value = "/save1",method = RequestMethod.POST)
	@ResponseBody
	public boolean saveUser(User user)throws Exception{
		System.out.println("进入2");
		System.out.println(user.getName());
		System.out.println(user.getCellphone());
		return userService.saveUser(user);
	}
	@RequestMapping(value = "/detele",method = RequestMethod.GET)
	public String forwarddetelePage()throws Exception{
		System.out.println("进入1");
		return "user_detele";
	}
	@RequestMapping(value = "/detele1",method = RequestMethod.POST)
	@ResponseBody
	public boolean deteleUser(User user)throws Exception{
		System.out.println("进入2");
		System.out.println(user.getId());
		return userService.deteleUser(user);
	}

	@RequestMapping(value = "/update",method = RequestMethod.GET)
	public String forwardupdatePage()throws Exception{
		System.out.println("进入1");
		return "user_update";
	}
	@RequestMapping(value = "/update1",method = RequestMethod.POST)
	@ResponseBody
	public boolean updateUser(User user)throws Exception{
		System.out.println("进入2");
		System.out.println(user.getName());
		System.out.println(user.getCellphone());
		System.out.println(user.getId());
		return userService.updateUser(user);
	}
}
