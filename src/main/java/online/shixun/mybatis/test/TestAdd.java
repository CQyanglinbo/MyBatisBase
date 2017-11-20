package online.shixun.mybatis.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import online.shixun.mybatis.dao.UserDao;
import online.shixun.mybatis.model.User;

public class TestAdd {
	SqlSession sqlSession;
	UserDao userDao;
	public void add(){
		//开启数据库连接
		sqlSession=BaseTest.getSqlSessionFactory().openSession();
		userDao=sqlSession.getMapper(UserDao.class);
		//实现方法
		userDao.add(new User("小红", 22, "重庆"));;
		System.out.println("插入成功");
		//提交事务并关闭连接
		sqlSession.commit();
		sqlSession.close();	
	}
	public static void main(String[] args) {
		TestAdd ta=new TestAdd();
		ta.add();
	}
}
