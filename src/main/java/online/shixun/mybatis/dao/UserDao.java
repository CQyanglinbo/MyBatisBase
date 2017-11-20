package online.shixun.mybatis.dao;

import java.util.List;

import online.shixun.mybatis.model.User;

public interface UserDao {
	/**
	 * 根据id查询用户信息
	 * @param id
	 * @return
	 */
	User selectById(int id);
	/**
	 * 查询所有用户信息
	 * @return
	 */
	List<User> selectAll();
	/**
	 * 修改用户信息
	 * @param user
	 */
	void update(User user);
	/**
	 * 添加用户
	 * @param user
	 */
	void add(User user);
	/**
	 * 根据id删除用户信息
	 * @param id
	 */
	void deleteById(int id);
}
