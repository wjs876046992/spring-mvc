package com.herman.service.impl;

import com.herman.dao.IUserDao;
import com.herman.entity.User;
import com.herman.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserService implements IUserService{

    @Resource
    private IUserDao userDao;

    public int doInsert(User pojo){
        return userDao.insert(pojo);
    }

    public int doInsertList(List< User> pojos){
        return userDao.insertList(pojos);
    }

    public List<User> select(User pojo){
        return userDao.select(pojo);
    }

    public int doUpdate(User pojo){
        return userDao.update(pojo);
    }

    public User findUserById(Integer id) {
        return this.userDao.findUserById(id);
    }

    public void doPrint() {
        System.out.println("doPrint");
    }
}
