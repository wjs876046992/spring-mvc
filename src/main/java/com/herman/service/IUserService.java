package com.herman.service;

import com.herman.entity.User;

import java.util.List;

/**
 * Created by asus on 2017/4/8.
 */
public interface IUserService {
    public int doInsert(User pojo);

    public int doInsertList(List< User> pojos);

    public List<User> select(User pojo);

    public int doUpdate(User pojo);

    public User findUserById(Integer id);

    public void doPrint();
}
