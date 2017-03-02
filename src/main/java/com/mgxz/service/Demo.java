package com.mgxz.service;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mgxz.dao.UserDao;
import com.mgxz.po.UserPO;

public class Demo {
	private static SqlSessionFactory sqlSessionFactory;
	private static Reader reader;
	private static Logger logger=LoggerFactory.getLogger(Demo.class);

	static {
		try {
			reader = Resources.getResourceAsReader("mybatis/mybatis-config.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
//		insertUser();
		updateUser();
//		getUserList();
	}
	private static void updateUser() {
		SqlSession session=sqlSessionFactory.openSession();
		UserDao userDao=session.getMapper(UserDao.class);
		UserPO userPO=userDao.selectUserById(232);
		logger.info("修改前："+userPO.toString());
		userPO.setUserName("强中强"); 
		userPO.setUserEmail("强中强"); 
		userDao.updateUser(userPO);
		session.commit();
		logger.info("修改后："+userDao.selectUserById(232));
		session.close();
		
	}
	@SuppressWarnings("unused")
	private static void insertUser() {
		SqlSession session=sqlSessionFactory.openSession();
		UserDao userDao=session.getMapper(UserDao.class);
		
		UserPO user=new UserPO();
		user.setUserId(232);
		user.setUserName("小强");
		user.setUserEmail("1212@qq.com");
		user.setUserPassword("sdf");
		try {
			userDao.saveUser(user);
			
		} catch (Exception e) {
			logger.error("出错了！！！", e);
		}
		
		session.commit();
		session.close();
		getUserList();
		
	}
	private static void getUserList() {
		SqlSession session=sqlSessionFactory.openSession();
		List<UserPO> list= session.selectList("com.mgxz.dao.UserDao.listUser");
			
		logger.debug("============"+list);
		session.close();
	}

}
