package com.mgxz.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mgxz.dao.UserDao;
import com.mgxz.po.UserPO;

@Controller
public class MyController extends BaseController{
	public MyController() {
		System.err.println("MyController 初始化");
	}
	
	@Autowired
	SqlSessionFactory sqlSessionFactory;
	
	@RequestMapping(value="/a",method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> fun(){
		System.out.println("123123123123123123");
		logger=LoggerFactory.getLogger(MyController.class);
		logger.info("访问成功！！！");
		SqlSession session=sqlSessionFactory.openSession();
		UserDao userDao=session.getMapper(UserDao.class);
		List<UserPO> list=userDao.listUser();
		logger.debug("执行："+list);
		session.close();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("success", true);
		map.put("message", "Successfully returning the data.");
		return map;
	}
}
