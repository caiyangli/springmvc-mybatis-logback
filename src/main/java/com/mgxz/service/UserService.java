package com.mgxz.service;

import java.util.List;

import com.mgxz.po.UserPO;

public interface UserService {
	 UserPO selectUserById(Integer userId); 
	 List<UserPO> listUser();  
}
