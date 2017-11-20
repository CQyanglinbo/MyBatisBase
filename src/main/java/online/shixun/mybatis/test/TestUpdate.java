package online.shixun.mybatis.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import online.shixun.mybatis.dao.UserDao;
import online.shixun.mybatis.model.User;

public class TestUpdate {
	SqlSession sqlSession;
	UserDao userDao;
	public void update(){
		//开启数据库连接
		sqlSession=BaseTest.getSqlSessionFactory().openSession();
		userDao=sqlSession.getMapper(UserDao.class);
		//实现方法
		userDao.update(new User(1, "小明", 18, "武汉"));
		System.out.println("修改成功");
		//提交事务并关闭连接
		sqlSession.commit();
		sqlSession.close();	
	}
	public static void main(String[] args) {
		TestUpdate tu=new TestUpdate();
		tu.update();
	}
}
