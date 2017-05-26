package com.herman.dao;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.herman.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao {

    int insert(@Param("pojo") User pojo);

    int insertList(@Param("pojos") List< User> pojo);

    List<User> select(@Param("pojo") User pojo);

    int update(@Param("pojo") User pojo);

    User findUserById(@Param("id") Integer id);
    int deleteById(@Param("id")Integer id);
User findById(@Param("id")Integer id);



}
