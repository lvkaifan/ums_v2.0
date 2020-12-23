package com.bdqn.ums.service;

import com.bdqn.ums.pojo.entity.User;

/**
 * <b>用户功能业务层</b>
 */
public interface UserService {
	boolean saveUser(User user)throws Exception;
	boolean deteleUser(User user)throws Exception;
	boolean updateUser(User user)throws Exception;
}
