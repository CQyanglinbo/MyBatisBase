package online.shixun.mybatis.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import online.shixun.mybatis.dao.UserDao;
import online.shixun.mybatis.model.User;

public class TestSelectAll {
	SqlSession sqlSession;
	UserDao userDao;
	public void selectAll(){
		//开启数据库连接
		sqlSession=BaseTest.getSqlSessionFactory().openSession();
		userDao=sqlSession.getMapper(UserDao.class);
		//实现方法
		userDao.selectAll();
		List<User> list=userDao.selectAll();
		for (User user : list) {
			System.out.println(user.toString());
		}
		//提交事务并关闭连接
		sqlSession.commit();
		sqlSession.close();	
	}
	public static void main(String[] args) {
		TestSelectAll tsa=new TestSelectAll();
		tsa.selectAll();
	}
}
