package online.shixun.mybatis.test;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BaseTest {
	//mybatis会话工厂
	private static SqlSessionFactory sqlSessionFactory;
	//Reader
	private static Reader reader;
	static{
		
		try {
			//读取配置文件
			reader=Resources.getResourceAsReader("Configuration.xml");
			//根据配置信息产生会话工厂
			sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
	public static void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		BaseTest.sqlSessionFactory = sqlSessionFactory;
	}	
}
