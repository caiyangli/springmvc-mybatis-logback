package com.mgxz.controller;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mgxz.dao.UserDao;
import com.mgxz.po.UserPO;

@Controller
public class MyController extends BaseController{
	
	@Autowired
	SqlSessionFactory sqlSessionFactory;
	
	@RequestMapping("/a")
	public String fun(){
		System.out.println("123123123123123123");
		logger=LoggerFactory.getLogger(MyController.class);
		logger.info("访问成功！！！");
		SqlSession session=sqlSessionFactory.openSession();
		UserDao userDao=session.getMapper(UserDao.class);
		List<UserPO> list=userDao.listUser();
		logger.debug("执行："+list);
		session.close();
		return null;
	}
}
