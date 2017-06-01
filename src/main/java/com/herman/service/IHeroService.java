package com.herman.service;

import com.herman.entity.Hero;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IHeroService {
    int deleteByPrimaryKey(Integer id);

    int insert(Hero record);

    int insertSelective(Hero record);

    Hero selectByPrimaryKey(@Param("id") Integer id);

    int updateByPrimaryKeySelective(Hero record);

    int updateByPrimaryKey(Hero record);

    List<Hero> findByName(@Param("name") String name);

    List<Hero> findAll();

    List<Hero> findSelective(@Param("hero") Hero hero);
}
