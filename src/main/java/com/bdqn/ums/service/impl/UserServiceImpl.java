package com.bdqn.ums.service.impl;

import com.bdqn.ums.dao.UserDao;
import com.bdqn.ums.pojo.entity.User;
import com.bdqn.ums.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <b>用户功能业务层实现类</b>
 */

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public boolean saveUser(User user) throws Exception {
		int count = userDao.saveUser(user);
		if (count>0){
			return true;
		}
		return false;
	}

	@Override
	public boolean deteleUser(User user) throws Exception {
		int count = userDao.deleteById(user);
		if (count>0){
			return true;
		}
		return false;
	}

	@Override
	public boolean updateUser(User user) throws Exception {
		int count = userDao.updateUser(user);
		if (count>0){
			return true;
		}
		return false;
	}
}
