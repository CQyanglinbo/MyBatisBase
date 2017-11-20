package online.shixun.mybatis.test;

import org.apache.ibatis.session.SqlSession;

import online.shixun.mybatis.dao.UserDao;

public class TestSelect extends BaseTest{
	SqlSession sqlSession;
	UserDao userDao;
	public void selectById(){
		//开启数据库连接
		sqlSession=BaseTest.getSqlSessionFactory().openSession();
		userDao=sqlSession.getMapper(UserDao.class);
		//实现方法
		userDao.selectById(1);
		System.out.println(userDao.selectById(1).toString());
		//提交事务并关闭连接
		sqlSession.commit();
		sqlSession.close();	
	}
	public static void main(String[] args) {
		TestSelect ts=new TestSelect();
		ts.selectById();
	}
	
}
