package com.mgxz.dao;

import java.util.List;

import com.mgxz.po.UserPO;

public interface UserDao {
	 /** 
     *  
     * @author linbingwen 
     * @since 2015年9月28日 
     * @param userId 
     * @return 
     */  
    public UserPO selectUserById(Integer userId);  
    
    public List<UserPO> listUser();
    
    public boolean updateUser(UserPO userPO);
    public boolean saveUser(UserPO userPO);
}
