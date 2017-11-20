package online.shixun.mybatis.test;

import org.apache.ibatis.session.SqlSession;

import online.shixun.mybatis.dao.UserDao;

public class TestDelete {
	SqlSession sqlSession;
	UserDao userDao;
	public void deleteById(){
		//开启数据库连接
		sqlSession=BaseTest.getSqlSessionFactory().openSession();
		userDao=sqlSession.getMapper(UserDao.class);
		//实现方法
		userDao.deleteById(3);;
		System.out.println("删除成功");
		//提交事务并关闭连接
		sqlSession.commit();
		sqlSession.close();	
	}
	public static void main(String[] args) {
		TestDelete td=new TestDelete();
		td.deleteById();;
	}
}
