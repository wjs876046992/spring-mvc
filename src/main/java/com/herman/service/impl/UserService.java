package com.herman.service.impl;

import com.herman.dao.IUserDao;
import com.herman.entity.User;
import com.herman.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserService implements IUserService{
    //由declare-parent作申明之后，可以强制类型转换成implement-interface的类型，
    // 并且可以使用default-impl所指定的实现类（此实现类就是代表declare-parent申明的切面对象）
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
//        throw new RuntimeException();
    }

    public void testAroundAdviceWithParams(String name, int times) {

        System.out.println("testAroundAdviceWithParams: " + name + "  " + times);
    }

    public void testDeclareParents() {

        System.out.println("testDeclareParents");
    }
}
