package com.bdqn.ums.dao;

import com.bdqn.ums.pojo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
	/**
	 * <b>根据查询对象查询用户信息列表</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<User> findUserListByQuery(User query)throws Exception;

	/**
	 * <b>保存用户信息</b>
	 * @param user
	 * @return
	 * @throws Exception
	 */
	int saveUser(User user)throws Exception;

	/**
	 * <b>修改用户信息</b>
	 * @param user
	 * @return
	 * @throws Exception
	 */
	int updateUser(User user)throws Exception;

	/**
	 * <b>根据用户id删除用户信息</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	int deleteById(User user)throws Exception;
}
