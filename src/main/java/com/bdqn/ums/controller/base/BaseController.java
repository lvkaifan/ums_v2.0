package com.bdqn.ums.controller.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * <b>基础控制器</b>
 * <b>该基础控制器依赖注入：httpservletRequest,httpservleResponse和httpsession</b>
 *<b>其他控制器都应当基于本控制器，那么就可以获得以上三个信息</b>
 */
@Controller("baseController")
public class BaseController {
	@Autowired
	protected HttpServletRequest request;
	@Autowired
	protected HttpServletResponse response;
	@Autowired
	protected HttpSession session;
}
