package com.herman.dao;

import com.herman.entity.Hero;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public interface HeroMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Hero record);

    int insertSelective(Hero record);

    Hero selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hero record);

    int updateByPrimaryKey(Hero record);

    List<Hero> findByName(@Param("name")String name);

    List<Hero> findAll();



}