package com.mgxz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgxz.dao.UserDao;
import com.mgxz.po.UserPO;

@Service
public class UserServiceImpl implements UserService {

	@Autowired  
    private UserDao userDao;  
  
    public UserPO selectUserById(Integer userId) {  
        return userDao.selectUserById(userId);  
          
    }  
    
    public List<UserPO> listUser() {  
        return userDao.listUser();  
          
    }  

}
